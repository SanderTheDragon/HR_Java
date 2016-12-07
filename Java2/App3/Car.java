public class Car extends Vehicle
{
	private int doorCount;
	private String fuelType;
	
	public int getDoorcount() { return doorCount; }
	public void setDoorcount(int newDoorcount) { doorCount = newDoorcount; }
	
	public String getFueltype() { return fuelType; }
	public void setFueltype(String newFueltype) { fuelType = newFueltype; }
	
	public Car(String newName, int newMaxSpeed, double newLength, int newMass, int newDoorcount, String newFueltype)
	{
		super(newName, newMaxSpeed, newLength, newMass);
		
		setDoorcount(newDoorcount);
		setFueltype(newFueltype);
	}
	
	public void print()
	{
		System.out.println("Name: " + getName() + ":");
		System.out.println("\tMaximum speed: " + getMaxspeed());
		System.out.println("\tLength: " + getLength());
		System.out.println("\tMass: " + getMass());
		System.out.println("\tDoor count: " + getDoorcount());
		System.out.println("\tFuel type: " + getFueltype());
	}
}
