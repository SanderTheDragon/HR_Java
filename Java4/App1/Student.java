public class Student
{
	private int studentNumber;
	private String name;
	private int age;
	private String gender;
	
	public int getStudentNumber() { return studentNumber; }
	public void setStudentNumber(int newStudentNumber) { studentNumber = newStudentNumber; }
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public int getAge() { return age; }
	public void setAge(int newAge) { age = newAge; }
	
	public String getGender() { return gender; }
	public void setGender(String newGender)
	{
		if (newGender == "M" || newGender == "m")
			gender = "M";
		
		if (newGender == "F" || newGender == "f")
			gender = "F";
	}
	
	public Student(int newStudentNumber, String newName, int newAge, String newGender)
	{
		setStudentNumber(newStudentNumber);
		setName(newName);
		setAge(newAge);
		setGender(newGender);
	}
	
	public boolean equals(Student other)
	{
		if (this.getStudentNumber() == other.getStudentNumber())
			return true;
		
		return false;
	}
	
	public void printStudent()
	{
		System.out.println("Student number: " + getStudentNumber());
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Gender: " + getGender());
		System.out.println();
	}
	
	public String toString()
	{
		return getStudentNumber() + "\n" + getName() + "\n" + getAge() + "\n" + getGender();
	}
}
