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
}
