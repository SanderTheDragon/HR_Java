public class Element
{
	private Student student;
	private Element nextElement;
	private Element previousElement;
	
	public Student getStudent() { return student; }
	public void setStudent(Student student) { this.student = student; }
	
	public Element getNextElement() { return nextElement; }
	public void setNextElement(Element nextElement) { this.nextElement = nextElement; }
	
	public Element getPreviousElement() { return previousElement; }
	public void setPreviousElement(Element previousElement) { this.previousElement = previousElement; }
	
	public Element(Student student, Element nextElement, Element previousElement)
	{
		setStudent(student);
		setNextElement(nextElement);
		setPreviousElement(previousElement);
	}
}
