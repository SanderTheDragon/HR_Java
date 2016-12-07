public class RaceBike extends Bike
{
	private boolean closedWheels;
	private int wheelWidth;
	
	public boolean getClosedwheels() { return closedWheels; }
	public void setClosedwheels(boolean newClosedwheels) { closedWheels = newClosedwheels; }
	
	public int getWheelwidth() { return wheelWidth; }
	public void setWheelwidth(int newWheelwidth) { wheelWidth = newWheelwidth; }
	
	public RaceBike(String newName, int newMaxSpeed, double newLength, int newMass, int newlights, String newLightpowersource, boolean newClosedwheels, int newWheelwidth)
	{
		super(newName, newMaxSpeed, newLength, newMass, newlights, newLightpowersource);
		
		setClosedwheels(newClosedwheels);
		setWheelwidth(newWheelwidth);
	}
	
	public void print()
	{
		System.out.println("Name: " + getName() + ":");
		System.out.println("\tMaximum speed: " + getMaxspeed());
		System.out.println("\tLength: " + getLength());
		System.out.println("\tMass: " + getMass());
		System.out.println("\tLights: " + getLights());
		System.out.println("\tLights power source: " + getLightpowersource());
		System.out.println("\tClosed wheels: " + getClosedwheels());
		System.out.println("\tWheel width: " + getWheelwidth());
	}
}
