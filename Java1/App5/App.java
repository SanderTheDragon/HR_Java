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
        
        for (int d = 2; d <= Math.sqrt(amount); d++)
        {
            for (int num = (int)Math.pow(d, 2); num <= amount; num += d)
            {
                primes[num] = false;
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
