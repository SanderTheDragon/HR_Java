import java.util.Random;

public class Engine
{
    public void calculate() throws EngineException
    {
        Random r = new Random();
        
        if (r.nextInt(1000) == 1)
            throw new EngineException();
    }
}
