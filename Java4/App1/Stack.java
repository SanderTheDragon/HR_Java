public class Stack
{
	private class Element
	{
		private Student student;
		private Element nextStudent;
		
		public Student getStudent() { return student; }
		public void setStudent(Student newStudent) { student = newStudent; }
		
		public Element getNextStudent() { return nextStudent; }
		public void setNextStudent(Element newNextStudent) { nextStudent = newNextStudent; }
		
		public Element(Student newStudent, Element newNextStudent)
		{
			setStudent(newStudent);
			setNextStudent(newNextStudent);
		}
	}
	
	private Element start = null;
	private int size = 0;
	
	public int size() { return size; }
	
	public void push(Student student)
	{
		//if (this.peek(student))
		//	return;
		
		Element newStudent = new Element(student, start);
		
		size++;
		
		start = newStudent;
	}
	
	public Student pop()
	{
		if (this.size() == 0)
			return null;
		
		Element lastStudent = start;
		
		start = lastStudent.getNextStudent();
		
		size--;
		
		return lastStudent.getStudent();
	}
	
	public boolean peek(Student student)
	{
		if (this.size() == 0)
			return false;
		
		Element lastStudent = start;
		
		do
		{
			if (student.equals(lastStudent.getStudent()))
				return true;
		} while ((lastStudent = lastStudent.getNextStudent()) != null);
		
		return false;
	}
	
	public void printStack()
	{
		System.out.println("Stack: ");
		
		if (this.size() == 0)
			return;
		
		Element lastStudent = start;
		
		do
		{
			lastStudent.getStudent().printStudent();
		} while ((lastStudent = lastStudent.getNextStudent()) != null);
	}
	
	public void printMen()
	{
		System.out.println("Men: ");
		
		if (this.size() == 0)
			return;
		
		Element lastStudent = start;
		
		do
		{
			if (lastStudent.getStudent().getGender() == "M")
				lastStudent.getStudent().printStudent();
		} while ((lastStudent = lastStudent.getNextStudent()) != null);
	}
	
	public void printWomen()
	{
		System.out.println("Women: ");
		
		if (this.size() == 0)
			return;
		
		Element lastStudent = start;
		
		do
		{
			if (lastStudent.getStudent().getGender() == "F")
				lastStudent.getStudent().printStudent();
		} while ((lastStudent = lastStudent.getNextStudent()) != null);
	}
}
