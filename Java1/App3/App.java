public class App
{
    public static void main(String[] args)
    {
        int amount = 200, num = 2, loc = 0;
        boolean prime = true;
        
        if (args.length > 0)
        {
            try
            {
                amount = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Argument is niet numeriek, 200 wordt gebruikt");
            }
        }
        
        for (int t = 0; t < amount; )
        {
            for (int d = 2; d <= Math.sqrt(num); d++)
            {
                if (num % d == 0)
                {
                    prime = false;
                    break;
                }
            }
            
            if (prime)
            {
                if (loc + 1 < 10)
                {
                    System.out.print(num + "\t");
                    loc++;
                }
                else
                {
                    System.out.print(num + "\n");
                    loc = 0;
                }
                
                t++;
            }
            
            prime = true;
            num++;
        }
    }
}
