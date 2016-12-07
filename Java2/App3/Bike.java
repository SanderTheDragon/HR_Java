public class Bike extends Vehicle
{
	private int lights;
	private String lightPowerSource;
	
	public int getLights() { return lights; }
	public void setLights(int newlights) { lights = newlights; }
	
	public String getLightpowersource() { return lightPowerSource; }
	public void setLightpowersource(String newLightpowersource) { lightPowerSource = newLightpowersource; }
	
	public Bike(String newName, int newMaxSpeed, double newLength, int newMass, int newlights, String newLightpowersource)
	{
		super(newName, newMaxSpeed, newLength, newMass);
		
		setLights(newlights);
		setLightpowersource(newLightpowersource);
	}
	
	public void print()
	{
		System.out.println("Name: " + getName() + ":");
		System.out.println("\tMaximum speed: " + getMaxspeed());
		System.out.println("\tLength: " + getLength());
		System.out.println("\tMass: " + getMass());
		System.out.println("\tLights: " + getLights());
		System.out.println("\tLights power source: " + getLightpowersource());
	}
}
