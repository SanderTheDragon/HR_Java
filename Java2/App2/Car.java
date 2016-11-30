public class Car
{
	private String name;
	
	public Car(String newName)
	{
		name = newName;
	}
	
	public void print()
	{
		System.out.println("Car is named: " + getName());
	}
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
}
