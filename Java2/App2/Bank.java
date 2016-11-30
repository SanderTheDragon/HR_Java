public class Bank
{
	private String name;
	
	private Car car;
	private Ferry ferry;
	
	public Bank(String newName)
	{
		name = newName;
	}
	
	public void print()
	{
		if (car == null)
			System.out.println("There is no car at \'" + getName() + "\'");
		else
			System.out.println("There is a car at \'" + getName() + "\': \'" + car.getName() + "\'");
		
		if (ferry == null)
			System.out.println("There is no ferry at \'" + getName() + "\'");
		else
			System.out.println("There is a ferry at \'" + getName() + "\': \'" + ferry.getName() + "\'");
		
		System.out.println("");
	}
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public Car getCar() { return car; }
	public void setCar(Car newCar) {car = newCar; }
	
	public Ferry getFerry() { return ferry; }
	public void setFerry(Ferry newFerry) { ferry = newFerry; }
}
