public class Recorder
{
    public void simulate()
    {
        int crashedCount = 0, flap1Count = 0, flap2Count = 0, engine1Count = 0, engine2Count = 0, engine3Count = 0, engine4Count = 0, pilot1Count = 0, pilot2Count = 0, pilot3Count = 0;
        
        
        for (int i = 0; i < 1000000; i++)
        {
            Airplane airplane = new Airplane(i);
            
            if (i < 999999)
                System.out.print(i + "\t\t (\t" + flap1Count + "\t" + flap2Count + "\t" + engine1Count + "\t" + engine2Count + "\t" + engine3Count + "\t" + engine4Count + "\t" + pilot1Count + "\t" + pilot2Count + "\t" + pilot3Count + "\t)" + "\r");
            else
                System.out.print(new String(new char[128]).replace("\0", " ") + "\r");
            
            try
            {
                airplane.flight();
            }
            catch (CrashException e)
            {
                crashedCount++;
                System.out.println("Flight " + i + " crashed! (" + e.cause() + ")" + new String(new char[64]).replace("\0", " "));
            }
            
            if (airplane.flap1Fail)
                flap1Count++;
                
            if (airplane.flap2Fail)
                flap2Count++;
                
            if (airplane.engine1Fail)
                engine1Count++;
                
            if (airplane.engine2Fail)
                engine2Count++;
                
            if (airplane.engine3Fail)
                engine3Count++;
                
            if (airplane.engine4Fail)
                engine4Count++;
                
            if (airplane.pilot1Fail)
                pilot1Count++;
                
            if (airplane.pilot2Fail)
                pilot2Count++;
                
            if (airplane.pilot3Fail)
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
