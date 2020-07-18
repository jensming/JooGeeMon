public abstract class Character 
{
    public String name;
    public int currentHealth;
    public final int baseHealth;
    public String archType;
    public String moveMade;
    public int totalMoves;
    public Character(String chName, int health, String arch, int numOfMoves)
    {
        name = chName;
        currentHealth = health;
        baseHealth = health;
        archType = arch;     
        
        totalMoves = numOfMoves;
    }
    
    public abstract void move(int num, Character ch);
    
    public String getMoveMade()
    {
        return moveMade;
    }
    
    public int getTotalMoves()
    {
        return totalMoves;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getArchType()
    {
        return archType;
    }
    
    public void changeHealth(int num)
    {
        currentHealth+= num;
    }
    
    public int getHealth()
    {
        return currentHealth;
    }
    
    public int getBaseHealth()
    {
        return baseHealth;
    }
    
    public abstract String toString();
}