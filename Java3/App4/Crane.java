import java.lang.Thread;
import java.util.Random;

public class Crane
{
    private Ship ship;
    private Wharf wharf;
    private String name;
    
    public Crane(String n, Ship s, Wharf w)
    {
        name = n;
        
        ship = s;
        wharf = w;
    }
    
    public void start()
    {
        Thread t = new Thread(() ->
        {
            while (ship.containersAvailable())
            {
                moveNextContainer();
            }
        });
        
        t.start();
    }
    
    public void moveNextContainer()
    {
        Container container = ship.takeNextContainer();
        
        if (container != null)
        {
            System.out.println(name + " received container " + container.getNumber());
            
            try
            {
                Thread.sleep(new Random().nextInt(5000) + 1000);
            }
            catch (Exception e)
            {
                System.out.println(name + " is broken!");
            }
            
            int place = wharf.getSpace();
            
            while (place < 0)
            {
                System.out.println(name + " waiting on space");
                
                try
                {
                    Thread.sleep(500);
                }
                catch (Exception e)
                {
                    System.out.println(name + " is broken!");
                }
                
                place = wharf.getSpace();
            }
            
            wharf.placeContainer(place, container);
                
            System.out.println(name + " placed container " + container.getNumber() + " at space " + (place + 1));
        }
    }
}
