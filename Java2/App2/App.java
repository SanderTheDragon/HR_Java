public class App
{
	public static void main(String[] args)
	{
		Bank east = new Bank("East Bank");
		Bank west = new Bank("West Bank");
		
		Ferry ferry = new Ferry("East-West Ferry");
		
		Car car = new Car("Car");
		
		east.setCar(car);
		east.print();
		east.setFerry(ferry);
		east.print();
		ferry.print();
		ferry.setCar(car);
		east.setCar(null);
		east.print();
		ferry.print();
		east.setFerry(null);
		west.setFerry(ferry);
		west.print();
		ferry.setCar(null);
		west.setCar(car);
		west.print();
		ferry.print();
	}
}
