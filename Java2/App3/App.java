/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class App
{
	/**
	 * Main method for 'App'
	 <p>
	 * Create vehicles and find the heaviest and lightest
	 * 
	 * @param args           Arguments (as String[])
	 */
	public static void main(String[] args)
	{
		Vehicle[] vehicles = new Vehicle[10];
		
		vehicles[0] = new Car("Small Car", 200, 2.5, 5000, 5, "Gas");
		vehicles[1] = new RaceCar("Fast Car", 300, 3.0, 1000, 3, "Euro 95 + Alcohol", 6, "Car Co.");
		vehicles[2] = new Bike("HeavyBike", 1, 1.0, 1000, 16, "Car Battery");
		vehicles[3] = new Car("Big Car", 150, 5.0, 25000, 7, "Diesel");
		vehicles[4] = new Bike("TinyBike", 10, 1.0, 10, 2, "Battery");
		vehicles[5] = new RaceCar("Faster Car", 350, 3.0, 950, 3, "Dollar 98", 7, "Car Inc.");
		vehicles[6] = new RaceBike("Fast Bike", 50, 1.5, 20, 0, "", true, 5);
		vehicles[7] = new Bike("Tinier Bike", 5, 0.5, 1, 1, "Battery");
		vehicles[8] = new Bike("Big Bike", 25, 2.5, 50, 4, "Dynamo");
		vehicles[9] = new RaceBike("RocketBike", 5000, 2.0, 100, 2, "Rocket Fuel", false, 100);
		
		Vehicle heaviest = getHeaviestVehicle(vehicles);
		Vehivle lightest = getLightestVehicle(vehicles);
		
		heaviest.print();
		lightest.print();
	}
	
	/**
	 * Find the heaviest vehicle
	 * 
	 * @param vehicles            A list of vehicles (as Vehicle[])
	 * 
	 * @return                    The heaviest car (as Vehicle)
	 */
	public static Vehicle getHeaviestVehicle(Vehicle[] vehicles)
	{
		Vehicle heaviest = vehicles[0];
		
		for (int i = 1; i < vehicles.length; i++)
		{
			if (vehicles[i].getMass() > heaviest.getMass())
				heaviest = vehicles[i];
		}
		
		return heaviest;
	}
	
	/**
	 * Find the lightest vehicle
	 * 
	 * @param vehicles            A list of vehicles (as Vehicle[])
	 * 
	 * @return                    The lightest car (as Vehicle)
	 */
	public static Vehicle getLightestVehicle(Vehicle[] vehicles)
	{
		Vehicle lightest = vehicles[0];
		
		for (int i = 1; i < vehicles.length; i++)
		{
			if (vehicles[i].getMass() < lightest.getMass())
				lightest = vehicles[i];
		}
		
		return lightest;
	}
}
