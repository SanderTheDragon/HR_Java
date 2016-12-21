public class App
{
	public static void main(String[] args)
	{
		Letters l = new Letters("Te intens lezen ezels net niet");
		
		l.print();
		System.out.println((l.oplopend()) ? "Letters zijn oplopend" : "Letters zijn niet oplopend");
		System.out.println((l.aflopend()) ? "Letters zijn aflopend" : "Letters zijn niet aflopend");
		
		l.sorteer();
		
		l.print();
		System.out.println((l.oplopend()) ? "Letters zijn oplopend" : "Letters zijn niet oplopend");
		System.out.println((l.aflopend()) ? "Letters zijn aflopend" : "Letters zijn niet aflopend");
		
		l.draaiom();
		
		l.print();
		System.out.println((l.oplopend()) ? "Letters zijn oplopend" : "Letters zijn niet oplopend");
		System.out.println((l.aflopend()) ? "Letters zijn aflopend" : "Letters zijn niet aflopend");
		
		System.out.print("\n");
		
		int[] i = { 1, 4, 7, 3, 2, 5, 8, 5, 5, 9, 6, 0, 3, 2, 1, 0, 5 };
		
		Geheel g = new Geheel(i);
		
		g.print();
		System.out.println((g.oplopend()) ? "Getallen zijn oplopend" : "Getallen zijn niet oplopend");
		System.out.println((g.aflopend()) ? "Getallen zijn aflopend" : "Getallen zijn niet aflopend");
		
		g.sorteer();
		
		g.print();
		System.out.println((g.oplopend()) ? "Getallen zijn oplopend" : "Getallen zijn niet oplopend");
		System.out.println((g.aflopend()) ? "Getallen zijn aflopend" : "Getallen zijn niet aflopend");
		
		g.draaiom();
		
		g.print();
		System.out.println((g.oplopend()) ? "Getallen zijn oplopend" : "Getallen zijn niet oplopend");
		System.out.println((g.aflopend()) ? "Getallen zijn aflopend" : "Getallen zijn niet aflopend");
	}
}
