public class Auto
{
	private String licensePlate;
	private int doorCount;
	private String color;
	private String brand;
	private String type;
	private int maxSpeed;
	private String fuelType;
	private int buildYear;
	
	public void print()
	{
		System.out.println("\tLicense plate: \t" + licensePlate);
		System.out.println("\tDoor count: \t" + doorCount);
		System.out.println("\tColor: \t\t" + color);
		System.out.println("\tBrand: \t\t" + brand);
		System.out.println("\tType: \t\t" + type);
		System.out.println("\tMaximum speed: \t" + maxSpeed);
		System.out.println("\tFuel type: \t" + fuelType);
		System.out.println("\tBuild year: \t" + buildYear);
	}
	
	public String getLicensePlate() { return licensePlate; }
	public void setLicensePlate(String newLicensePlate) { licensePlate = newLicensePlate; }
	
	public int getDoorCount() { return doorCount; }
	public void setDoorCount(int newDoorCount) { doorCount = newDoorCount; }
	
	public String getColor() { return color; }
	public void setColor(String newColor) { color = newColor; }
	
	public String getBrand() { return brand; }
	public void setBrand(String newBrand) { brand = newBrand; }
	
	public String getType() { return type; }
	public void setType(String newType) { type = newType; }
	
	public int getMaxSpeed() { return maxSpeed; }
	public void setMaxSpeed(int newMaxSpeed) { maxSpeed = newMaxSpeed; }
	
	public String getFuelType() { return fuelType; }
	public void setFuelType(String newFuelType) { fuelType = newFuelType; }
	
	public int getBuildYear() { return buildYear; }
	public void setBuildYear(int newBuildYear) { buildYear = newBuildYear; }
}
