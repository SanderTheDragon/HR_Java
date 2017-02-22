public class Airplane
{
    int flightNum;
    
    Flap[] flaps = new Flap[2];
    Engine[] engines = new Engine[4];
    Pilot[] pilots = new Pilot[3];
    
    int fFlaps = 0;
    int fEngines = 0;
    int fPilots = 0;
    
    public Airplane(int num)
    {
        flightNum = num;
        
        flaps[0] = new Flap();
        flaps[1] = new Flap();
        
        engines[0] = new Engine();
        engines[1] = new Engine();
        engines[2] = new Engine();
        engines[3] = new Engine();
        
        pilots[0] = new Pilot();
        pilots[1] = new Pilot();
        pilots[2] = new Pilot();
    }
    
    public void flight() throws CrashException
    {
        for (int f = 0; f < flaps.length; f++)
        {
            try
            {
                flaps[f].calculate();
            }
            catch (FlapException fEx)
            {
                fFlaps += Math.pow(2, f);
            }
        }
        
        for (int e = 0; e < engines.length; e++)
        {
            try
            {
                engines[e].calculate();
            }
            catch (EngineException eEx)
            {
                fEngines += Math.pow(2, e);
            }
        }
        
        for (int p = 0; p < pilots.length; p++)
        {
            try
            {
                pilots[p].calculate();
            }
            catch (PilotException pEx)
            {
                fPilots += Math.pow(2, p);
            }
        }
        
        if (App.and(fFlaps, 0) && App.and(fFlaps, 1))
            throw new CrashException("Failure of all flaps");
        
        if (App.and(fPilots, 0) && App.and(fPilots, 1) && App.and(fPilots, 2))
            throw new CrashException("Failure of all pilots");
        
        if ((App.and(fEngines, 1) && App.and(fEngines, 2)) && (App.and(fEngines, 0) || App.and(fEngines, 3)))
            throw new CrashException("Failure of engines: " + ((App.and(fEngines, 0)) ? "1, " : "") + "2, 3" + ((App.and(fEngines, 3)) ? ", 4" : ""));
    }
    
    public int getFlapFails()
    {
        return fFlaps;
    }
    
    public int getEngineFails()
    {
        return fEngines;
    }
    
    public int getPilotFails()
    {
        return fPilots;
    }
}
