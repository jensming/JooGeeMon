public class JordanHunt extends Character
{
    public String moveMade;
    public JordanHunt()
    {
        super("JordanHunt",60,"Meme",1);
    }

    public void move(int choice, Character ch)
    {
        int checkNum = (int)(Math.random()*16);
        if (checkNum != 0)
        {
            if (checkNum == 10)
            {
                moveMade = "Three Power Kicks";
                ch.changeHealth(-(checkNum*3));
            }
            else
            {
                moveMade = "Power Kick";
                ch.changeHealth(-checkNum);
            }
        }
        else
            moveMade = "Power Kick, but missed badly";
    }

    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Power Kick  (Incredibly strong kick with a chance to deal extra damage.)\n";
    }
}