import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.ResolverStyle;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class App
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Birthdate");
        
        frame.setSize(256, 164);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        
        JLabel bDay1 = new JLabel("Birthday 1: ");
        JTextField bDay1Date = new JTextField("01-01-1999");
        JTextField bDay1Time = new JTextField("00:00:00");
        
        JLabel bDay2 = new JLabel("Birthday 2: ");
        JTextField bDay2Date = new JTextField("31-12-2000");
        JTextField bDay2Time = new JTextField("23:59:59");
        
        JButton now = new JButton("Birthday 2 = Now");
        
        now.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("dd-MM-uuuu");
                DateTimeFormatter tFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
                
                bDay2Date.setText(ZonedDateTime.now().format(dFormat));
                bDay2Time.setText(ZonedDateTime.now().format(tFormat));
            }
        });
        
        JButton calc = new JButton("Calculate");
        
        JLabel result = new JLabel("Result");
        
        JComboBox<String> calculateAs = new JComboBox<String>(new String[] { "Milliseconds", "Seconds", "Minutes", "Hours", "Days", "Years" });
        
        calc.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-uuuu HH:mm:ss").withResolverStyle(ResolverStyle.STRICT);
                
                try
                {
                    LocalDateTime dT1 = LocalDateTime.parse(bDay1Date.getText() + " " + bDay1Time.getText(), format);
                    LocalDateTime dT2 = LocalDateTime.parse(bDay2Date.getText() + " " + bDay2Time.getText(), format);
                
                    float dSec = dT2.getSecond() - dT1.getSecond();
                    float dMin = dT2.getMinute() - dT1.getMinute();
                    float dHou = dT2.getHour() - dT1.getHour();
                    float dDay = dT2.getDayOfYear() - dT1.getDayOfYear();
                    float dYea = dT2.getYear() - dT1.getYear();
                    
                    float res = 0;
                        
                    if (calculateAs.getSelectedItem() == "Milliseconds")
                    {
                        res += dSec * 1000.0;
                        res += dMin * 60.0 * 1000.0;
                        res += dHou * 60.0 * 60.0 * 1000.0;
                        res += dDay * 24.0 * 60.0 * 60.0 * 1000.0;
                        res += dYea * 365.25 * 24.0 * 60.0 * 60.0 * 1000.0;
                    }
                    if (calculateAs.getSelectedItem() == "Seconds")
                    {
                        res += dSec;
                        res += dMin * 60.0;
                        res += dHou * 60.0 * 60.0;
                        res += dDay * 24.0 * 60.0 * 60.0;
                        res += dYea * 365.25 * 24.0 * 60.0 * 60.0;
                    }
                    if (calculateAs.getSelectedItem() == "Minutes")
                    {
                        res += dSec / 60.0;
                        res += dMin;
                        res += dHou * 60.0;
                        res += dDay * 24.0 * 60.0;
                        res += dYea * 365.25 * 24.0 * 60.0;
                    }
                    if (calculateAs.getSelectedItem() == "Hours")
                    {
                        res += dSec / 60.0 / 60.0;
                        res += dMin / 60.0;
                        res += dHou;
                        res += dDay * 24.0;
                        res += dYea * 365.25 * 24.0;
                    }
                    if (calculateAs.getSelectedItem() == "Days")
                    {
                        res += dSec / 24.0 / 60.0 / 60.0;
                        res += dMin / 24.0 / 60.0;
                        res += dHou / 24.0;
                        res += dDay;
                        res += dYea * 365.25;
                    }
                    if (calculateAs.getSelectedItem() == "Years")
                    {
                        res += dSec / 365.25 / 24.0 / 60.0 / 60.0;
                        res += dMin / 365.25 / 24.0 / 60.0;
                        res += dHou / 365.25 / 24.0;
                        res += dDay / 365.25;
                        res += dYea;
                    }
                    
                    result.setText(((Float)res).toString() + " " + calculateAs.getSelectedItem());
                }
                catch (Exception ex)
                {
                    result.setText("Invalid date");
                    
                    return;
                }
            }
        });
        
        frame.add(bDay1);
        frame.add(bDay1Date);
        frame.add(bDay1Time);
        frame.add(bDay2);
        frame.add(bDay2Date);
        frame.add(bDay2Time);
        frame.add(now);
        frame.add(calc);
        frame.add(calculateAs);
        frame.add(result);
        
        frame.setVisible(true);
    }
}
