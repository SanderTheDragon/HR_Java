public class Vehicle
{
	private String name;
	private int maxSpeed;
	private double length;
	private int mass;
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public int getMaxspeed() { return maxSpeed; }
	public void setMaxspeed(int newMaxspeed) { maxSpeed = newMaxspeed; }
	
	public double getLength() { return length; }
	public void setLength(double newLength) { length = newLength; }
	
	public int getMass() { return mass; }
	public void setMass(int newMass) { mass = newMass; }
	
	public Vehicle(String newName, int newMaxSpeed, double newLength, int newMass)
	{
		setName(newName);
		setMaxspeed(newMaxSpeed);
		setLength(newLength);
		setMass(newMass);
	}
	
	public void print()
	{
		System.out.println("Name: " + getName() + ":");
		System.out.println("\tMaximum speed: " + getMaxspeed());
		System.out.println("\tLength: " + getLength());
		System.out.println("\tMass: " + getMass());
	}
}
