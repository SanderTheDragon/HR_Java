public class App
{
    public static void main(String[] args)
    {
        Recorder recorder = new Recorder();
        
        int num = 1000000;
        
        if (args.length > 0)
        {
            try
            {
                num = Integer.parseInt(args[0]);
            }
            catch (Exception e) { }
        }
        
        recorder.simulate(num);
    }
    
    public static boolean and(int bits, int bit)
    {
        if ((bits & (int)Math.pow(2, bit)) > 0)
            return true;
        
        return false;
    }
}
