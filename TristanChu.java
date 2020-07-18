public class TristanChu extends Character
{
    public String moveMade;
    public TristanChu()
    {
        super("TristanChu",65,"Chef",2);
    }
    public void move(int choice, Character ch)
    {
        switch(choice)
        {
            case 1:
                int checkNum1 = (int)(Math.random()*15);
                if (checkNum1 != 0)
                {
                    moveMade = "Fire Spit";
                    ch.changeHealth(-checkNum1-3);
                    break;
                }
                else
                {
                    moveMade = "Fire Spit, but misfired";
                    break;
                }
            case 2:
                int checkNum2 = (int)(Math.random()*17);
                if (checkNum2 != 0)
                {
                    moveMade = "Chef Sauce";
                    ch.changeHealth(-checkNum2-4);
                }
                else
                {
                    moveMade = "Chef Sauce, but spilled on himself instead of";
                    this.changeHealth(-5);
                }
        }
    }
    
    public String getMoveMade()
    {
        return moveMade;
    }
    
    public String toString()
    {
        return "1) Fire Spit  (Devastating bars that rattle anyone targeted.)\n2) Chef Sauce  (Secret sauce Tristan uses to plunge his enemies in.)\n";
    }
}