public class RaceCar extends Car
{
	private int gearCount;
	private String company;
	
	public int getGearcount() { return gearCount; }
	public void setGearcount(int newGearcount) { gearCount = newGearcount; }
	
	public String getCompany() { return company; }
	public void setCompany(String newCompany) { company = newCompany; }
	
	public RaceCar(String newName, int newMaxSpeed, double newLength, int newMass, int newDoorcount, String newFueltype, int newGearcount, String newCompany)
	{
		super(newName, newMaxSpeed, newLength, newMass, newDoorcount, newFueltype);
		
		setGearcount(newGearcount);
		setCompany(newCompany);
	}
	
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
