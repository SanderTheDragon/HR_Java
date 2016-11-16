public class App
{
	public static void main(String[] args)
	{
		Car[] cars;
		
		cars = createCarArray();
		
		Car fastest = findFastest(cars);
		
		System.out.println("\n\n\nFastest car: ");
		fastest.print();
	}
	
	public static Car findFastest(Car[] cars)
	{
		Car fastest = cars[0];
		
		for (int i = 1; i < cars.length; i++)
		{
			if (cars[i].getMaxSpeed() > fastest.getMaxSpeed())
				fastest = cars[i];
		}
		
		return fastest;
	}
	
	public static Car[] createCarArray()
	{
		Car[] cars = new Car[5];
		
		Car a = new Car();
		a.setLicensePlate("FX-67-GD");
		a.setDoorCount(5);
		a.setColor("Black");
		a.setBrand("Big Cars");
		a.setType("Car");
		a.setMaxSpeed(210);
		a.setFuelType("Euro 98");
		a.setBuildYear(2001);
		cars[0] = a;
		System.out.println("Created car: ");
		a.print();
		
		Car b = new Car();
		b.setLicensePlate("CV-PF-36");
		b.setDoorCount(5);
		b.setColor("White");
		b.setBrand("Big Cars");
		b.setType("Car");
		b.setMaxSpeed(180);
		b.setFuelType("Diesel");
		b.setBuildYear(1998);
		cars[1] = b;
		System.out.println("\nCreated car: ");
		b.print();
		
		Car c = new Car();
		c.setLicensePlate("WH-49-DD");
		c.setDoorCount(5);
		c.setColor("Red");
		c.setBrand("Small Cars");
		c.setType("Car");
		c.setMaxSpeed(200);
		c.setFuelType("Gas");
		c.setBuildYear(1995);
		cars[2] = c;
		System.out.println("\nCreated car: ");
		c.print();
		
		Car d = new Car();
		d.setLicensePlate("33-PF-WF");
		d.setDoorCount(3);
		d.setColor("Blue");
		d.setBrand("Small Cars");
		d.setType("Car");
		d.setMaxSpeed(230);
		d.setFuelType("Euro 95");
		d.setBuildYear(2004);
		cars[3] = d;
		System.out.println("\nCreated car: ");
		d.print();
		
		Car e = new Car();
		e.setLicensePlate("LK-VM-38");
		e.setDoorCount(5);
		e.setColor("Red");
		e.setBrand("Big Cars");
		e.setType("Car");
		e.setMaxSpeed(200);
		e.setFuelType("Euro 95");
		e.setBuildYear(2000);
		cars[4] = e;
		System.out.println("\nCreated car: ");
		e.print();
		
		return cars;
	}
}
