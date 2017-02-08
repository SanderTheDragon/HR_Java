import java.util.Random;

public class Flap
{
    public void calculate() throws FlapException
    {
        Random r = new Random();
        
        if (r.nextInt(2000) == 1)
            throw new FlapException();
    }
}
