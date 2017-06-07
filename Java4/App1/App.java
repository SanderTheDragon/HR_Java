public class App
{
	public static void main(String[] args)
	{
		Student janice = new Student(1, "Janice", 25, "V");
		Student kermit = new Student(2, "Kermit", 18, "M");
		Student gonzo = new Student(3, "Gonzo", 8, "M");
		Student swedishChef = new Student(4, "Swedish Chef", 35, "M");
		Student missPiggy = new Student(5, "Miss Piggy", 28, "V");
		
		Stack stack = new Stack();
		
		stack.pop();
		
		stack.printStack();
		stack.printWomen();
		
		stack.push(janice);
		stack.push(kermit);
		stack.push(gonzo);
		stack.push(swedishChef);
		stack.push(missPiggy);
		
		stack.printMen();
		stack.printWomen();
		
		stack.push(kermit);
		
		stack.printStack();
	}
}
