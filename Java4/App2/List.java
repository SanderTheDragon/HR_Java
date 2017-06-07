public class List
{
	private Element start;
	private Element end;
	private int size;
	
	public List()
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public int size() { return size; }
	
	public boolean push(Student student, int index)
	{
		if (index > this.size())
			return false;
		
		//if (this.peek(student))
		//	return false;
		
		Element newElement = new Element(student, null, null);
		
		if (this.size() == 0)
		{
			start = end = newElement;
			
			size++;
			
			return true;
		}
		else if (index == 0)
		{
			newElement.setNextElement(start);
			start.setPreviousElement(newElement);
			
			start = newElement;
			
			size++;
			
			return true;
		}
		else if (index == this.size())
		{
			newElement.setPreviousElement(end);
			end.setNextElement(newElement);
			
			end = newElement;
			
			size++;
			
			return true;
		}
		else
		{
			Element atIndex = start;
			
			for (int i = 0; i <= index; i++)
			{
				atIndex = atIndex.getNextElement();
			}
			
			newElement = new Element(student, atIndex, atIndex.getPreviousElement());
			
			atIndex.getPreviousElement().setNextElement(newElement);
			atIndex.setPreviousElement(newElement);
			
			size++;
			
			return true;
		}
	}
	
	public Student head()
	{
		if (this.size() == 0)
			return null;
		
		Element element = start;
		
		start = element.getNextElement();
		
		if (start != null)
			start.setPreviousElement(null);
		
		element.setNextElement(null);
		
		size--;
		
		return element.getStudent();
	}
	
	public Student tail()
	{
		if (this.size() == 0)
			return null;
		
		Element element = end;
		
		end = element.getPreviousElement();
		
		if (end != null)
			end.setNextElement(null);
		
		element.setPreviousElement(null);
		
		size--;
		
		return element.getStudent();
	}
	
	public Student pop(int index)
	{
		if (this.size() == 0)
			return null;
		
		if (index > this.size())
			return null;
		
		Element atIndex = start;
		
		for (int i = 0; i < index; i++)
		{
			atIndex = atIndex.getNextElement();
		}
		
		atIndex.getNextElement().setPreviousElement(atIndex.getPreviousElement());
		atIndex.getPreviousElement().setNextElement(atIndex.getNextElement());
		
		atIndex.setNextElement(null);
		atIndex.setPreviousElement(null);
		
		size--;
		
		return atIndex.getStudent();
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
	
	public void printList()
	{
		System.out.println("List: ");
		
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
