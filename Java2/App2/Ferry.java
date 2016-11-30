public class Ferry
{
	public String name;
	
	public Car car;
	
	public Ferry(String newName)
	{
		name = newName;
	}
	
	public void print()
	{
		if (car == null)
			System.out.println("There is no car on \'" + getName() + "\'");
		else
			System.out.println("There is a car on \'" + getName() + "\': \'" + car.getName() + "\'");
		
		System.out.println("");
	}
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public Car getCar() { return car; }
	public void setCar(Car newCar) { car = newCar; }
}
