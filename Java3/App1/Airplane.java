public class Airplane
{
    int flightNum;
    
    Flap flap1 = new Flap();
    Flap flap2 = new Flap();
    
    Engine engine1 = new Engine();
    Engine engine2 = new Engine();
    Engine engine3 = new Engine();
    Engine engine4 = new Engine();
    
    Pilot pilot1 = new Pilot();
    Pilot pilot2 = new Pilot();
    Pilot pilot3 = new Pilot();
    
    boolean flap1Fail = false, flap2Fail = false, engine1Fail = false, engine2Fail = false, engine3Fail = false, engine4Fail = false, pilot1Fail = false, pilot2Fail = false, pilot3Fail = false;
    
    public Airplane(int num)
    {
        flightNum = num;
    }
    
    public void flight() throws CrashException
    {
        //System.out.println("[" + flightNum + "]Plane has taken off");
        
        try
        {
            flap1.calculate();
        }
        catch (FlapException fe1)
        {
            //System.out.println("[" + flightNum + "]Flap 1 has failed");
            flap1Fail = true;
        }
        
        try
        {
            flap2.calculate();
        }
        catch (FlapException fe2)
        {
            //System.out.println("[" + flightNum + "]Flap 2 has failed");
            flap2Fail = true;
        }
        
        try
        {
            engine1.calculate();
        }
        catch (EngineException ee1)
        {
            //System.out.println("[" + flightNum + "]Engine 1 has failed");
            engine1Fail = true;
        }
        
        try
        {
            engine2.calculate();
        }
        catch (EngineException ee2)
        {
            //System.out.println("[" + flightNum + "]Engine 2 has failed");
            engine2Fail = true;
        }
        
        try
        {
            engine3.calculate();
        }
        catch (EngineException ee3)
        {
            //System.out.println("[" + flightNum + "]Engine 3 has failed");
            engine3Fail = true;
        }
        
        try
        {
            engine4.calculate();
        }
        catch (EngineException ee4)
        {
            //System.out.println("[" + flightNum + "]Engine 4 has failed");
            engine4Fail = true;
        }
        
        try
        {
            pilot1.calculate();
        }
        catch (PilotException pe1)
        {
            //System.out.println("[" + flightNum + "]Pilot 1 has failed");
            pilot1Fail = true;
        }
        
        try
        {
            pilot2.calculate();
        }
        catch (PilotException pe2)
        {
            //System.out.println("[" + flightNum + "]Pilot 2 has failed");
            pilot2Fail = true;
        }
        
        try
        {
            pilot3.calculate();
        }
        catch (PilotException pe3)
        {
            //System.out.println("[" + flightNum + "]Pilot 3 has failed");
            pilot3Fail = true;
        }
        
        if ((flap1Fail && flap2Fail) || (pilot1Fail && pilot2Fail && pilot3Fail) || ((engine1Fail || engine4Fail) && engine2Fail && engine3Fail))
        {
            //System.out.println("[" + flightNum + "]Plane has crashed");
            throw new CrashException(flap1Fail, flap2Fail, engine1Fail, engine2Fail, engine3Fail, engine4Fail, pilot1Fail, pilot2Fail, pilot3Fail);
        }
        
        //System.out.println("[" + flightNum + "]Plane landed safely");
    }
}
