public class App
{
    public static void main(String[] args)
    {
        Ship ship = new Ship();
        Wharf wharf = new Wharf();
        
        Crane crane1 = new Crane("Crane 1", ship, wharf);
        Crane crane2 = new Crane("Crane 2", ship, wharf);
        
        Truck truck1 = new Truck("Truck 1", wharf);
        Truck truck2 = new Truck("Truck 2", wharf);
        Truck truck3 = new Truck("Truck 3", wharf);
        
        crane1.start();
        crane2.start();
        
        truck1.start();
        truck2.start();
        truck3.start();
    }
}
