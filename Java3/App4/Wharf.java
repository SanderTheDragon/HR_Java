public class Wharf
{
    private Container[] containers;
    
    private boolean finished = false;
    
    public Wharf()
    {
        containers = new Container[5];
        
        for (int i = 0; i < containers.length; i++)
            containers[i] = null;
    }
    
    public int getSpace()
    {
        for (int i = 0; i < containers.length; i++)
        {
            if (containers[i] == null)
                return i;
        }
        
        return -1;
    }
    
    public void placeContainer(int space, Container c)
    {
        containers[space] = c;
        
        if (c.getNumber() == 1)
            finished = true;
        
        System.out.println("Wharf received container " + c.getNumber() + " at space " + (space + 1));
    }
    
    public synchronized Container takeNextContainer()
    {
        for (int i = 0; i < containers.length; i++)
        {
            Container c = containers[i];
            
            if (c != null)
            {
                containers[i] = null;
                
                System.out.println("Container " + c.getNumber() + " at " + (i + 1) + " was taken from wharf");
                
                return c;
            }
        }
        
        return null;
    }
    
    public boolean containersAvailable()
    {
        for (int i = 0; i < containers.length; i++)
        {
            if (containers[i] != null)
                return true;
        }
        
        return false;
    }
    
    public boolean finished()
    {
        return finished;
    }
}
