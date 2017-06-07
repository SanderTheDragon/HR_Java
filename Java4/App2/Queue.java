public class Queue
{
	private Element start;
	private Element end;
	private int size;
	
	public Queue()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public int size() { return size; }
	
	public boolean push(Student student)
	{
		//if (this.peek(student))
		//	return false;
		
		Element newElement = new Element(student, end, null);
		
		if (end != null)
			end.setPreviousElement(newElement);
		else
			start = newElement;
		
		end = newElement;
		
		size++;
		
		return true;
	}
	
	public Student pop()
	{
		if (this.size() == 0)
			return null;
		
		Element element = start;
		
		start = element.getPreviousElement();
		
		if (start != null)
			start.setNextElement(null);
		
		element.setPreviousElement(null);
		
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
	
	public void printQueue()
	{
		System.out.println("Queue: ");
		
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
