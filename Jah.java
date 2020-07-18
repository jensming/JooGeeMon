public class Jah extends Character
{
    public String moveMade;
    public Jah()
    {
        super("Jah",80,"Celestial Being",2);
    }
    public void move(int choice, Character ch)
    {
        switch(choice)
        {
            case 1: 
                int checkNum1 = (int)(Math.random()*14);
                if (checkNum1 != 0)
                {
                    moveMade = "Ground Pound";
                    ch.changeHealth(-checkNum1-3);
                    break;
                }
                else
                {
                    moveMade = "Ground Pound, but had no effect";
                    break;
                }
            case 2:
                int checkNum2 = (int)(Math.random()*21);
                if (checkNum2 < 10)
                {
                    moveMade = "Harmful Touch of Jah";
                    ch.changeHealth(-checkNum2*2);
                }
                else
                {
                    moveMade = "Healing Touch of Jah";
                    ch.changeHealth(checkNum2);
                }
        }
    }
    
    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Ground Pound  (Hulk smash that ruptures the very ground below opponent.)\n2) Touch of Jah  (Has the chance to heal or deal tremendous damage on an opponent.)\n";
    }
}