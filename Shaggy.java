public class Shaggy extends Character
{
    public String moveMade;
    public Shaggy()
    {
        super("Shaggy",75,"Celestial Being",3);
    }

    public void move(int choice, Character ch)
    {
        switch(choice)
        {
            case 1: 
                int checkNum1 = (int)(Math.random()*15);
                if (checkNum1 != 0)
                {
                    moveMade = "Scooby Snack Attack";
                    ch.changeHealth(-checkNum1-2);
                    break;
                }
                else
                {                    
                    moveMade = "Scooby Snack Attack, but had no effect";
                    break;
                }
            case 2: 
                int checkNum2 = (int)(Math.random()*16);
                if (checkNum2 != 0)
                {
                    moveMade = "Spooky Punch";
                    ch.changeHealth(-checkNum2-4);
                    break;
                }
                else
                {                    
                    moveMade = "Spooky Punch, but had no effect";
                    break;
                }
            case 3:
                if ((int)(Math.random()*20) == 10) //insta-kill opponents if random num equals 10 (wildcard move)
                {
                    moveMade = "1% of Power";
                    ch.changeHealth(-500);
                }
                else
                    moveMade = "1% of his power, but misfired";
        }
    }

    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Scooby Snack Attack  (Scrumptious scooby snacks.)\n2) Spooky Punch  (A jab to the face so hard, the opponent's apparition gets knockered.)\n3) 1% of Power  (This can end someone's life.)\n";
    }
}