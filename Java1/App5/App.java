import java.util.Arrays;

public class App
{
    public static void main(String[] args)
    {
        int amount = 1000, loc = 0;
        
        if (args.length > 0)
        {
            try
            {
                amount = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Argument is niet numeriek, 1000 wordt gebruikt");
            }
        }
        
        boolean[] primes = new boolean[amount + 1];
        
        Arrays.fill(primes, true);
        
        primes[1] = false;
        
        for (int i = 2; i <= Math.sqrt(amount); i++)
        {
            for (int j = (int)Math.pow(i,2); j <= amount; j += i)
            {
                primes[j] = false;
            }
        }
        
        for (int i = 1; i <= amount; i++)
        {
            if (primes[i])
            {
                if (loc + 1 < 10)
                {
                    System.out.print(i + "\t");
                    loc++;
                }
                else
                {
                    System.out.print(i + "\n");
                    loc = 0;
                }
            }
        }
    }
}
