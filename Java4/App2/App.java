public class App
{
	public static void main(String[] args)
	{
		Student janice = new Student(1, "Janice", 25, "V");
		Student kermit = new Student(2, "Kermit", 18, "M");
		Student gonzo = new Student(3, "Gonzo", 8, "M");
		Student swedishChef = new Student(4, "Swedish Chef", 35, "M");
		Student missPiggy = new Student(5, "Miss Piggy", 28, "V");
		
		Queue queue = new Queue();
		List list = new List();
		SortedList men = new SortedList();
		SortedList women = new SortedList();
		
		queue.pop();
		
		queue.push(kermit);
		queue.push(janice);
		queue.push(gonzo);
		queue.push(missPiggy);
		queue.push(swedishChef);
		
		queue.printQueue();
		
		for (Student student = queue.pop(); student != null; student = queue.pop())
		{
			list.push(student, list.size());
			
			if (student.getGeslacht().equalsIgnoreCase("m"))
				men.push(student);
			else
				women.push(student);
		}
		
		queue.printQueue();
		list.printList();
		men.printSortedList();
		women.printSortedList();
	}
}
