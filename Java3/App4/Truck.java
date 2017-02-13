import java.lang.Thread;
import java.util.Random;

public class Truck
{
    private Wharf wharf;
    private String name;
    
    public Truck(String n, Wharf w)
    {
        name = n;
        
        wharf = w;
    }
    
    public void start()
    {
        Thread t = new Thread(() ->
        {
            while(!wharf.finished() || wharf.containersAvailable())
            {
                moveContainer();
            }
        });
        
        t.start();
    }
    
    public void moveContainer()
    {
        Container container = wharf.takeNextContainer();
        
        while (container == null)
        {
            System.out.println(name + " waiting for container");
            
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(name + " crashed!");
            }
            
            container = wharf.takeNextContainer();
        }
        
        System.out.println(name + " has taken container " + container.getNumber());
        
        try
        {
            Thread.sleep(new Random().nextInt(5000) + 1000);
        }
        catch (Exception e)
        {
            System.out.println(name + " crashed!");
        }
        
        System.out.println(name + " delivered container " + container.getNumber());
        
        try
        {
            Thread.sleep(new Random().nextInt(2500) + 1000);
        }
        catch (Exception e)
        {
            System.out.println(name + " crashed!");
        }
    }
}
