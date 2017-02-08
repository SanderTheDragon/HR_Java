import java.util.Random;

public class Pilot
{
    public void calculate() throws PilotException
    {
        Random r = new Random();
        
        if (r.nextInt(200) == 1)
            throw new PilotException();
    }
}
