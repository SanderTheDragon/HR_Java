public class CrashException extends Exception
{
    public CrashException()
    {
        super("Unknown");
    }
    
    public CrashException(String cause)
    {
        super(cause);
    }
}
