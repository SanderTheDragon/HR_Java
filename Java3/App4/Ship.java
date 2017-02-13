public class Ship
{
    private Container[] containers;
    private int containersLeft;
    
    public Ship()
    {
        containers = new Container[100];
        containersLeft = containers.length;
        
        for (int i = 0; i < containersLeft; i++)
            containers[i] = new Container(i + 1);
    }
    
    public synchronized Container takeNextContainer()
    {
        if (containersLeft > 0)
        {
            Container next = containers[containersLeft - 1];
            containersLeft--;
            
            System.out.println("Container " + next.getNumber() + " was taken from the ship");
            
            return next;
        }
        else
            return null;
    }
    
    public boolean containersAvailable()
    {
        return (containersLeft > 0);
    }
}
