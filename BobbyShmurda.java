public class BobbyShmurda extends Character
{
    public String moveMade;
    public BobbyShmurda()
    {
        super("BobbyShmurda",80,"Fire Type",2);
    }
    public void move(int choice, Character ch)
    {
        switch(choice)
        {
            case 1:
                int checkNum1 = (int)(Math.random()*15);
                if (checkNum1 != 0)
                {
                    moveMade = "Thermal Blast";
                    ch.changeHealth(-checkNum1-3);
                    break;
                }
                else
                {
                    moveMade = "Thermal Blast, but misfired";
                    break;
                }
            case 2:
                int checkNum2 = (int)(Math.random()*18);
                if (checkNum2 != 0)
                {
                    moveMade = "Shockwave";
                    ch.changeHealth(-checkNum2-5);
                }
                else
                    moveMade = "Shockwave, but had no effect";
        }
    }
    
    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Thermal Blast  (Playing his iconic banger sets opponents ablaze.)\n2) Shockwave  (Thunderous boom that will disorientate opponents.)\n";
    }
}