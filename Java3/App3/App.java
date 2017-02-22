import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.lang.Thread;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class App
{
    private static boolean running = false, end = false;
    private static DefaultListModel laps = new DefaultListModel();
    private static long startTime = 0, stopTime = 0, lastLap = 0;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Stopwatch");
        
        frame.setSize(280, 192);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        
        JList<String> lapTimes = new JList<String>();
        
        JLabel timeLabel = new JLabel("00:00:00.000");
        
        timeLabel.setFont(new Font(timeLabel.getFont().getName(), Font.PLAIN, 18));
        
        Thread t = new Thread(new Runnable()
        {
            public void run()
            {
                while (true)
                {
                    if (running)
                    {
                        timeLabel.show();
                        
                        timeLabel.setText(toTimeString(System.currentTimeMillis() - startTime));
                    }
                    
                    if (!running && stopTime != startTime)
                    {
                        if (System.currentTimeMillis() % 2000 < 1000)
                            timeLabel.hide();
                        else
                            timeLabel.show();
                    }
                }
            }
        });
        
        JPanel buttons = new JPanel();
        
        buttons.setPreferredSize(new Dimension(128, 152));
        
        JButton startStop = new JButton("Start");
        
        startStop.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if (!running)
                {
                    if (t.getState() == Thread.State.NEW)
                    {
                        t.start();
                        startTime = System.currentTimeMillis();
                    }
                    else
                        startTime = System.currentTimeMillis() - (stopTime - startTime);
                    
                    running = true;
                    
                    startStop.setText("Stop");
                }
                else
                {
                    stopTime = System.currentTimeMillis();
                    
                    running = false;
                    
                    startStop.setText("Start");
                }
            }
        });
        
        JButton reset = new JButton("Reset");
        
        reset.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if (running)
                    running = false;
                
                startStop.setText("Start");
                
                startTime = System.currentTimeMillis();
                stopTime = System.currentTimeMillis();
                
                timeLabel.show();
                timeLabel.setText(toTimeString(0));
                
                laps.clear();
            }
        });
        
        JButton timeLap = new JButton("Laptime");
        
        timeLap.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if (running)
                {
                    laps.addElement(toTimeString(System.currentTimeMillis() - startTime - lastLap));
                    lapTimes.setModel(laps);
                    
                    lastLap = System.currentTimeMillis() - startTime;
                    
                    end = true;
                }
            }
        });
        
        JScrollPane pane = new JScrollPane(lapTimes);
        
        pane.setPreferredSize(new Dimension(128, 152));
        
        pane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener()
        {
            public void adjustmentValueChanged(AdjustmentEvent e)
            {
                if (end)
                    e.getAdjustable().setValue(e.getAdjustable().getMaximum());
                
                end = false;
            }
        });
        
        buttons.add(startStop);
        buttons.add(reset);
        buttons.add(timeLap);
        buttons.add(timeLabel);
        
        frame.add(buttons);
        frame.add(pane);
        
        frame.setVisible(true);
    }
    
    public static String toTimeString(long millis)
    {
        long milli = millis % 1000;
        long second = (millis / 1000) % 60;
        long minute = (millis / (1000 * 60)) % 60;
        long hour = (millis / (1000 * 60 * 60)) % 24;
        
        return String.format("%02d:%02d:%02d:%03d", hour, minute, second, milli);
    }
}
