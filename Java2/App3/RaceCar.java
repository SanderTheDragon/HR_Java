/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class RaceCar extends Car
{
	/**
	 * Declares 'gearCount' as 'private int'
	 */
	private int gearCount;
	/**
	 * Declares 'company' as 'private String'
	 */
	private String company;
	
	public int getGearcount() { return gearCount; }
	public void setGearcount(int newGearcount) { gearCount = newGearcount; }
	
	public String getCompany() { return company; }
	public void setCompany(String newCompany) { company = newCompany; }
	
	/**
	 * Constructor for 'RaceCar'
	 <p>
	 * Initializes all variables
	 * 
	 * @param newName          Name of the vehicle (as String)
	 * @param newMaxSpeed      Maximum speed of vehicle in km/h (as int)
	 * @param newLength        Length of vehicle in m (as double)
	 * @param newMass          Mass of vehicle in kg (as int)
	 * @param newDoorcount     Amount of doors (as int)
	 * @param newFueltype      Fuel types of cars (as String)
	 * @param newGearcount     Count of gears (as int)
	 * @param newCompany       Company the driver races for (as String)
	 */
	public RaceCar(String newName, int newMaxSpeed, double newLength, int newMass, int newDoorcount, String newFueltype, int newGearcount, String newCompany)
	{
		super(newName, newMaxSpeed, newLength, newMass, newDoorcount, newFueltype);
		
		setGearcount(newGearcount);
		setCompany(newCompany);
	}
	
	/**
	 * Prints value of all the variables
	 */
	public void print()
	{
		System.out.println("Name: " + getName() + ":");
		System.out.println("\tMaximum speed: " + getMaxspeed());
		System.out.println("\tLength: " + getLength());
		System.out.println("\tMass: " + getMass());
		System.out.println("\tDoor count: " + getDoorcount());
		System.out.println("\tFuel type: " + getFueltype());
		System.out.println("\tGear count: " + getGearcount());
		System.out.println("\tCompany: " + getCompany());
	}
}
