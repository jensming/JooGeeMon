public class BadlandChugs extends Character
{
    public String moveMade;
    public BadlandChugs()
    {
        super("BadlandChugs",100,"Meme",2);
    }

    public void move(int choice, Character ch)
    {
        switch(choice)
        {
            case 1: 
                int checkNum1 = (int)(Math.random()*16);
                if (checkNum1 != 0)
                {
                    moveMade = "Seismic Burp"; 
                    ch.changeHealth(-checkNum1-4);
                    break; 
                }
                else
                {
                    moveMade = "Seismic Burp, but had no effect";
                    break;
                }
            case 2: 
                int checkNum2 = (int)(Math.random()*18);
                if (checkNum2 != 0)
                {
                    moveMade = "Belly Flop";
                    ch.changeHealth(-checkNum2-5);
                }
                else
                    moveMade = "Belly Flop, but had no effect";
        }
    }
    
    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Seismic Burp  (A powerful belch that leaves opponent staggering.)\n2) Belly Flop  (Not a cannonball, it's a belly flop.)\n";
    }
}