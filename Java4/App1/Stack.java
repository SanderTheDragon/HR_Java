public class Stack
{
	private class Element
	{
		private Student student;
		private Element nextElement;
		
		public Student getStudent() { return student; }
		public void setStudent(Student student) { this.student = student; }
		
		public Element getNextElement() { return nextElement; }
		public void setNextElement(Element nextElement) { this.nextElement = nextElement; }
		
		public Element(Student student, Element nextElement)
		{
			setStudent(student);
			setNextElement(nextElement);
		}
	}
	
	private Element start;
	private int size;
	
	public Stack()
	{
		start = null;
		size = 0;
	}
	
	public int size() { return size; }
	
	public void push(Student student)
	{
		//if (this.peek(student))
		//	return;
		
		Element newElement = new Element(student, start);
		
		size++;
		
		start = newElement;
	}
	
	public Student pop()
	{
		if (this.size() == 0)
			return null;
		
		Element element = start;
		
		start = element.getNextElement();
		
		element.setNextElement(null);
		
		size--;
		
		return element.getStudent();
	}
	
	public boolean peek(Student student)
	{
		if (this.size() == 0)
			return false;
		
		for (Element element = start; element != null; element = element.getNextElement())
		{
			if (student.equals(element.getStudent()))
				return true;
		}
		
		return false;
	}
	
	public void printStack()
	{
		System.out.println("Stack: ");
		
		print();
	}
	
	public void printMen()
	{
		System.out.println("Mannen: ");
		
		print("m");
	}
	
	public void printWomen()
	{
		System.out.println("Vrouwen: ");
		
		print("v");
	}
	
	private void print() { print(""); }
	private void print(String geslacht)
	{
		if (this.size() == 0)
			return;
		
		for (Element element = start; element != null; element = element.getNextElement())
		{
			if (element.getStudent().getGeslacht().equalsIgnoreCase(geslacht) || geslacht.equals(""))
				element.getStudent().printStudent();
		}
	}
}
