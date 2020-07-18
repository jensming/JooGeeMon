public class Doge extends Character
{
    public String moveMade;
    public Doge()
    {
        super("Doge",55,"Feral Beast",1);
    }
    public void move(int choice, Character ch)
    {
        int checkNum = (int)(Math.random()*13);
        if (checkNum != 0)
        {
            moveMade = "Bite";
            ch.changeHealth(-checkNum-5);
        }
        else
            moveMade = "Bite, but had no effect";            
    }
    
    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Bite  (Strong chompers.)\n";
    }
}