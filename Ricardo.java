public class Ricardo extends Character
{
    public String moveMade;
    public Ricardo()
    {
        super("Ricardo",100,"Sex Icon",2);
    }

    public void move(int choice, Character ch)
    {
        switch(choice)
        {
            case 1:
                int checkNum1 = (int)(Math.random()*17);
                if (checkNum1 != 0)
                {
                    moveMade = "Butterfly Dance";
                    ch.changeHealth(-checkNum1-5);
                    break;
                }
                else
                {
                    moveMade = "Butterfly Dance, but had no effect";
                    break;
                }
            case 2:
                int checkNum2 = (int)(Math.random()*19);
                if (checkNum2 != 0)
                {
                    moveMade = "Hip Thrust";
                    ch.changeHealth(-checkNum2-7);
                }
                else
                    moveMade = "Hip Thrust, but thrusted ineffectively";                    
        }
    }
    
    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Butterfly Dance  (Majestic dance that entrances and psychologically damages opponents.)\n2) Hip Thrust  (A powerful humping action.)\n";
    }
}