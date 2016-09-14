import java.util.Scanner;

public class App
{
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        String x1S, y1S, x2S, y2S;
        int x1, y1, x2, y2;
        
        if (args.length < 4)
        {
            System.out.println("x1?");
            x1S = scanner.nextLine();
            
            System.out.println("y1?");
            y1S = scanner.nextLine();
            
            System.out.println("x2?");
            x2S = scanner.nextLine();
            
            System.out.println("y2?");
            y2S = scanner.nextLine();
        }
        else
        {
            if (args.length > 4)
                System.out.println("Meer dan 4 argumenten gegeven, alleen de eerste 4 worden gebruikt");
        
            x1S = args[0];
            y1S = args[1];
            x2S = args[2];
            y2S = args[3];
        }
        
        try
        {
            x1 = Integer.parseInt(x1S);
            y1 = Integer.parseInt(y1S);
            x2 = Integer.parseInt(x2S);
            y2 = Integer.parseInt(y2S);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input is niet numeriek");
            return;
        }
        
        System.out.println("A(" + x1 + "," + y1 + ")  B(" + x2 + "," + y2 + ")");
        
        int dX = x2 - x1;
        int dY = y2 - y1;
        
        System.out.println("ΔX=" + x2 + "-" + x1 + "=" + dX);
        System.out.println("ΔY=" + y2 + "-" + y1 + "=" + dY);
        
        if (dX == 0)
        {
            System.out.println("Kan niet delen door 0");
            System.out.println("Verticale lijn door x=" + x1);
        }
        else if (dY == 0)
        {
            System.out.println("Horizontale lijn door y=" + y1);
        }
        else
        {
            double slope = (double)dY / (double)dX;
            
            System.out.println("r.c.=" + dY + "/" + dX + "=" + slope);
            
            double start1 = y1 - x1 * slope;
            double start2 = y2 - x2 * slope;
            
            System.out.println("Snijpunt y-as volgens y1=" + y1 + "-" + x1 + "*" + slope + "=" + start1);
            System.out.println("Snijpunt y-as volgens y2=" + y2 + "-" + x2 + "*" + slope + "=" + start2);
        }
    }
}
