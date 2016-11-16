public class App
{
	public static void main(String[] args)
	{
		Auto[] autos;
		
		autos = createCarArray();
		
		Auto fastest = findFastest(autos);
		
		System.out.println("\n\n\nFastest car: ");
		fastest.print();
	}
	
	public static Auto findFastest(Auto[] autos)
	{
		Auto fastest = autos[0];
		
		for (int i = 1; i < autos.length; i++)
		{
			if (autos[i].getMaxSpeed() > fastest.getMaxSpeed())
				fastest = autos[i];
		}
		
		return fastest;
	}
	
	public static Auto[] createCarArray()
	{
		Auto[] autos = new Auto[5];
		
		Auto a = new Auto();
		a.setLicensePlate("FX-67-GD");
		a.setDoorCount(5);
		a.setColor("Black");
		a.setBrand("Big Cars");
		a.setType("Car");
		a.setMaxSpeed(210);
		a.setFuelType("Euro 98");
		a.setBuildYear(2001);
		autos[0] = a;
		System.out.println("Created car: ");
		a.print();
		
		Auto b = new Auto();
		b.setLicensePlate("CV-PF-36");
		b.setDoorCount(5);
		b.setColor("White");
		b.setBrand("Big Cars");
		b.setType("Car");
		b.setMaxSpeed(180);
		b.setFuelType("Diesel");
		b.setBuildYear(1998);
		autos[1] = b;
		System.out.println("\nCreated car: ");
		b.print();
		
		Auto c = new Auto();
		c.setLicensePlate("WH-49-DD");
		c.setDoorCount(5);
		c.setColor("Red");
		c.setBrand("Small Cars");
		c.setType("Car");
		c.setMaxSpeed(200);
		c.setFuelType("Gas");
		c.setBuildYear(1995);
		autos[2] = c;
		System.out.println("\nCreated car: ");
		c.print();
		
		Auto d = new Auto();
		d.setLicensePlate("33-PF-WF");
		d.setDoorCount(3);
		d.setColor("Blue");
		d.setBrand("Small Cars");
		d.setType("Car");
		d.setMaxSpeed(230);
		d.setFuelType("Euro 95");
		d.setBuildYear(2004);
		autos[3] = d;
		System.out.println("\nCreated car: ");
		d.print();
		
		Auto e = new Auto();
		e.setLicensePlate("LK-VM-38");
		e.setDoorCount(5);
		e.setColor("Red");
		e.setBrand("Big Cars");
		e.setType("Car");
		e.setMaxSpeed(200);
		e.setFuelType("Euro 95");
		e.setBuildYear(2000);
		autos[4] = e;
		System.out.println("\nCreated car: ");
		e.print();
		
		return autos;
	}
}
