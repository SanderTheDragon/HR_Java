public class Recorder
{
    public void simulate(int num)
    {
        int crashedCount = 0, flap1Count = 0, flap2Count = 0, engine1Count = 0, engine2Count = 0, engine3Count = 0, engine4Count = 0, pilot1Count = 0, pilot2Count = 0, pilot3Count = 0;
        
        for (int i = 0; i < num; i++)
        {
            Airplane airplane = new Airplane(i);
            
            try
            {
                airplane.flight();
            }
            catch (CrashException e)
            {
                crashedCount++;
                System.out.println("Flight " + i + " crashed! (" + e.getMessage() + ")" + new String(new char[128]).replace("\0", " "));
            }
            
            if (App.and(airplane.getFlapFails(), 0))
                flap1Count++;
            
            if (App.and(airplane.getFlapFails(), 1))
                flap2Count++;
            
            if (App.and(airplane.getEngineFails(), 0))
                engine1Count++;
            
            if (App.and(airplane.getEngineFails(), 1))
                engine2Count++;
            
            if (App.and(airplane.getEngineFails(), 2))
                engine3Count++;
            
            if (App.and(airplane.getEngineFails(), 3))
                engine4Count++;
            
            if (App.and(airplane.getPilotFails(), 0))
                pilot1Count++;
            
            if (App.and(airplane.getPilotFails(), 1))
                pilot2Count++;
            
            if (App.and(airplane.getPilotFails(), 2))
                pilot3Count++;
        }
        
        System.out.println(crashedCount + "\t flights are crashed");
        System.out.println(flap1Count + "\t left flaps have failed");
        System.out.println(flap2Count + "\t right flaps have failed");
        System.out.println(engine1Count + "\t outer left engines have failed");
        System.out.println(engine2Count + "\t inner left engines have failed");
        System.out.println(engine3Count + "\t inner right engines have failed");
        System.out.println(engine4Count + "\t outer right engines have failed");
        System.out.println(pilot1Count + "\t first pilots have failed");
        System.out.println(pilot2Count + "\t second pilots have failed");
        System.out.println(pilot3Count + "\t third pilots have failed");
    }
}
