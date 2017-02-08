public class CrashException extends Exception
{
    private String causedBy;
    
    public CrashException()
    {
        causedBy = "Unknown";
    }
    
    public CrashException(String cause)
    {
        causedBy = cause;
    }
    
    public CrashException(boolean flap1, boolean flap2, boolean engine1, boolean engine2, boolean engine3, boolean engine4, boolean pilot1, boolean pilot2, boolean pilot3)
    {
        if ((engine1 || engine4) && engine2 && engine3)
            causedBy = "Failure of engine: " + ((engine1) ? "1, " : "") + "2, 3" + ((engine4) ? ", 4" : "");
        
        if (pilot1 && pilot2 && pilot3)
            causedBy = "Failure of pilot: 1, 2, 3";
            
        if (flap1 && flap2)
            causedBy = "Failure of flap: 1, 2";
    }
    
    public String cause()
    {
        return causedBy;
    }
}
