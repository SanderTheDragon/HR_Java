import java.util.Scanner;

public class App
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        String aS, bS, nS;
        int a, b, n;
        
        if (args.length < 3)
        {
            System.out.println("a?");
            aS = scanner.nextLine();
            
            System.out.println("b?");
            bS = scanner.nextLine();
            
            System.out.println("n?");
            nS = scanner.nextLine();
        }
        else
        {
            if (args.length > 3)
                System.out.println("Meer dan 3 argumenten gegeven, alleen de eerste 3 worden gebruikt");
        
            aS = args[0];
            bS = args[1];
            nS = args[2];
        }
        
        try
        {
            a = Integer.parseInt(aS);
            b = Integer.parseInt(bS);
            n = Integer.parseInt(nS);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input is niet numeriek");
            return;
        }
        
        System.out.println("a=" + a + ", b=" + b + ", n=" + n);
        
        double p1 = Math.pow(a + b, n);
        
        System.out.println("(" + a + "+" + b + ")^" + n + "=" + p1);
        
        double p2 = 0;
        
        for (int k = 0; k <= n; k++)
        {
            int bc = bino(n, k);
            double powed = Math.pow(a, k) * Math.pow(b, n - k);
            
            p2 += bc * powed;
        }
        
        System.out.println("∑_(k=0)^" + n + "▒(" + n + " ¦ k)" + a + "^k*" + b + "^(" + n + "-k)=" + p2);
    }
    
    public static int bino(int n, int k)
    {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    
    public static int factorial(int f)
    {
        int ret = 1;
    
        for (int i = 1; i <= f; i++)
            ret *= i;
            
        return ret;
    }
}

