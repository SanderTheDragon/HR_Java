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
        
        for (int count = 0; count < amount; )
        {
            if (isPrime(num))
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
                
                count++;
            }
            
            prime = true;
            num++;
        }
    }
    
    private static boolean isPrime(int num)
    {
        for (int divider = 2; divider <= Math.sqrt(num); divider++)
        {
            if (num % divider == 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
