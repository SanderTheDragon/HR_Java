public class Student
{
	private int studentNummer;
	private String naam;
	private int leeftijd;
	private String geslacht;
	
	public int getStudentNummer() { return studentNummer; }
	public void setStudentNummer(int studentNummer) { this.studentNummer = studentNummer; }
	
	public String getNaam() { return naam; }
	public void setNaam(String naam) { this.naam = naam; }
	
	public int getLeeftijd() { return leeftijd; }
	public void setLeeftijd(int leeftijd) { this.leeftijd = leeftijd; }
	
	public String getGeslacht() { return geslacht; }
	public void setGeslacht(String geslacht)
	{
		if (geslacht.equalsIgnoreCase("m") || geslacht.equalsIgnoreCase("v"))
			this.geslacht = geslacht;
	}
	
	public Student(int studentNummer, String naam, int leeftijd, String geslacht)
	{
		setStudentNummer(studentNummer);
		setNaam(naam);
		setLeeftijd(leeftijd);
		setGeslacht(geslacht);
	}
	
	public boolean equals(Student other)
	{
		if (this.getStudentNummer() == other.getStudentNummer())
			return true;
		
		return false;
	}
	
	public void printStudent()
	{
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		return "Studentnummer: " + getStudentNummer() + "\nNaam: " + getNaam() + "\nLeeftijd: " + getLeeftijd() + "\nGeslacht: " + getGeslacht() + "\n";
	}
}
