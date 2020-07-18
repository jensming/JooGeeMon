//I borrowed all JFrame, JPanel, and Listener ideas from
//stackoverflow, geeksforgeeks, and oracle to help set up this program.
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.io.*;
public class Game extends JPanel implements KeyListener, ActionListener
{
    private ArrayList<Character> allCharacters;
    private ArrayList<Character> player1Deck;
    private ArrayList<Character> player2Deck;
    private JFrame f;
    private Container contentPane;
    private Graphics g;
    private BufferedImage Joo;
    private BufferedImage BadlandChugs;    
    private BufferedImage JordanHunt;    
    private BufferedImage Doge;    
    private BufferedImage BobbyShmurda;    
    private BufferedImage Jah;    
    private BufferedImage Ricardo;    
    private BufferedImage TristanChu;    
    private BufferedImage Shaggy;
    private JPanel menu;
    private JButton JGMN;
    private JButton RUN;
    private JButton FIGHT;
    private Font labelFont;
    private boolean play;
    public Game() 
    {
        //window
        f = new JFrame("JooGeeMon!");
        f.setSize(800,800);
        f.setResizable(false);
        f.setLocationRelativeTo(null);

        //instantiating and populating character specs and decks
        allCharacters = new ArrayList<Character>();
        allCharacters.add(new BadlandChugs());
        allCharacters.add(new JordanHunt());
        allCharacters.add(new Doge());
        allCharacters.add(new BobbyShmurda());
        allCharacters.add(new Jah());
        allCharacters.add(new Ricardo());
        allCharacters.add(new TristanChu());
        allCharacters.add(new Shaggy());
        player1Deck = new ArrayList<Character>();
        player2Deck = new ArrayList<Character>();
        setDeck(player1Deck);
        setDeck(player2Deck);

        // menu = new JPanel();
        // menu.setBackground(Color.white);

        // labelFont = new Font("Arial",Font.BOLD,22);

        //in game UI
        // FIGHT = new JButton("FIGHT");
        // FIGHT.setSize(100,25);
        // FIGHT.setFont(labelFont);
        // FIGHT.setBackground(Color.white);
        // FIGHT.setLocation(650,635);
        // JGMN = new JButton("JGMN");
        // JGMN.setSize(100,25);
        // JGMN.setFont(labelFont);
        // JGMN.setBackground(Color.white);
        // JGMN.setLocation(650,675);
        // RUN = new JButton("RUN");
        // RUN.setSize(100,25);
        // RUN.setFont(labelFont);
        // RUN.setBackground(Color.white);
        // RUN.setLocation(650,715);
        // f.add(FIGHT);
        // f.add(JGMN);
        // f.add(RUN);
        // f.add(menu);
        
        // try {BadlandChugs = ImageIO.read(new File("G:/JooGeeMon/BadlandChugs.png"));} catch (IOException e) {}
        // try {JordanHunt = ImageIO.read(new File("G:/JooGeeMon/JordanHunt.png"));} catch (IOException e) {}
        // try {Doge = ImageIO.read(new File("G:/JooGeeMon/Doge.png"));} catch (IOException e) {}
        // try {BobbyShmurda = ImageIO.read(new File("G:/JooGeeMon/BadlandChugs.png"));} catch (IOException e) {}
        // try {Jah = ImageIO.read(new File("G:/JooGeeMon/Jah.png"));} catch (IOException e) {}
        // try {Ricardo = ImageIO.read(new File("G:/JooGeeMon/Ricardo.png"));} catch (IOException e) {}
        // try {TristanChu = ImageIO.read(new File("G:/JooGeeMon/TristanChu(glare).png"));} catch (IOException e) {}
        // try {Shaggy = ImageIO.read(new File("G:/JooGeeMon/Shaggy.png"));} catch (IOException e) {}
        //g.drawImage(image,3,3,150,150,f); //reference

        // contentPane = f.getContentPane();
        // g = contentPane.getGraphics();
        // paint(g);

        //FIGHT.requestFocusInWindow(); 

        initiateBattle();
    }

    public void paint(Graphics g)
    {        
        // if (play) //battle screen
        // {
            // try {Thread.sleep(100);} catch (Exception e) {}

            // //background
            // g.setColor(new Color(48,39,32));
            // g.fillRect(0,0,800,600);        

            // int count = 0;
            // g.setColor(new Color(255, 239, 198));
            // do
            // {
                // try {Thread.sleep(1);} catch (Exception e) {}
                // g.fillOval(3+(int)(Math.random()*790),3+(int)(Math.random()*790),4,4);
                // count++;
            // } while(count < 100); //stars in backgroundvv

            // //border for background and UI menu
            // g.setColor(Color.green);
            // g.fillRect(0,0,3,800);
            // g.fillRect(0,0,800,3);
            // g.fillRect(791,0,3,800);
            // g.fillRect(0,768,800,3);
            // g.fillRect(0,600,800,3);
            // g.drawImage(Joo,10,10,100,100,f);
        // }
        // else //starting screen
        // {
            // try {Thread.sleep(100);} catch (Exception e) {}
            // g.setColor(Color.green);
            // g.fillRect(0,0,800,800);
            // g.setColor(Color.white);
            // g.fillRect(100,100,600,500);
            // // g.drawImage(new ImageIcon("G:/JooGeeMon/Mr.JooPP.png").getImage(),200,200,200,200,f);

            // g.setFont(labelFont);
            // g.drawString("Press Enter",400,400);
            // f.addKeyListener(new KeyAdapter() //press ENTER key to start battle
                // {
                    // public void keyPressed(KeyEvent e)
                    // {
                        // do{
                            // if (!play && e.getKeyCode() == KeyEvent.VK_ENTER)
                            // {
                                // play = true;
                                // // f.remove(temp);                            
                                // paint(g);
                                // break;
                            // }
                        // } while (true);
                    // }
                // });
        // }
    }

    private void setDeck(ArrayList<Character> deck)
    {
        int random = (int)(Math.random()*allCharacters.size());
        while (deck.size() < 3)
        {
            deck.add(allCharacters.remove(random));
            random = (int)(Math.random()*allCharacters.size());
        }
    }

    private boolean isAlive(ArrayList<Character> playerDeck)
    {
        int count = playerDeck.size();
        return (count > 0 && count <= 3);
    }

    public void initiateBattle() //establishes which player goes first in battle with a coin toss to decide
    {
        play = true;
        System.out.println("Let's play JooGeeMon!");
        Scanner kb = new Scanner(System.in);
        System.out.println("Press ENTER for a coin toss to see who goes first.");
        String readStr = kb.nextLine();
        while (readStr != null) //makes sure key entered is the ENTER key
        {
            if (readStr.equals(""))
                break;
            else if (readStr.equalsIgnoreCase("EXIT")) //close program on call
                System.exit(0);
            else
            {
                System.out.println("Incorrect input, please try again");
                readStr = kb.nextLine();
            }
        }
        try {Thread.sleep(500);} catch (Exception e) {}
        System.out.print(".");
        try {Thread.sleep(500);} catch (Exception e) {}
        System.out.print(".");
        try {Thread.sleep(500);} catch (Exception e) {}
        System.out.print(".\n");
        int coin = (int)(Math.random()*2);
        if (coin == 0)
        {
            System.out.println("Player 1 goes first.");
            battle(player1Deck, player2Deck);
        }
        else if (coin == 1)
        {
            System.out.println("Player 2 goes first.");
            battle(player2Deck, player1Deck);
        }
    }

    public void battle(ArrayList<Character> starter, ArrayList<Character> opponent) //JooGeeMon battle between two players, starter is the player that makes the move during each turn
    {
        if (isAlive(starter) && isAlive(opponent)) //battle ends if each character in one player's deck is dead
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Choose a character from your deck:");
            String escStr;
            int num = 1;
            for (Character ch: starter) //lists starter's deck of characters
            {
                System.out.println(num + ") " + ch.getName() + "  HP: " + ch.getHealth() + "/" + ch.getBaseHealth());
                num++;
            }
            System.out.println("");
            if (!kb.hasNextInt())
            {
                escStr = kb.next();
                if (escStr.equalsIgnoreCase("EXIT")) //close program on call
                    System.exit(0);
                while (!kb.hasNextInt()) //makes sure input is a num, not a string
                {
                    System.out.println("Not an int, please try again.");
                    kb.next();
                }
            }
            int starterChoice = kb.nextInt();
            while (true) //makes sure key entered is between the num of starter characters alive still
            {
                if (starterChoice > 0 && starterChoice <= starter.size())
                    break;
                else
                {
                    System.out.println("There is no choice for the number you inputed, please try again.");
                    if (!kb.hasNextInt())
                    {
                        while (!kb.hasNextInt())
                        {
                            System.out.println("Not an int, please try again");
                            kb.next();
                        }
                    }
                    else
                        starterChoice = kb.nextInt();
                }
            }
            String starterChName = starter.get(--starterChoice).getName();
            System.out.println("You have chosen " + starterChName + ".\nSelect opponent character # to make your move on:");
            num = 1;
            for (Character ch: opponent) //lists opponent's deck of characters
            {
                System.out.println(num + ") " + ch.getName() + "  HP: " + ch.getHealth() + "/" + ch.getBaseHealth());
                num++;
            }
            System.out.println("");    
            if (!kb.hasNextInt())
            {
                escStr = kb.next();
                if (escStr.equalsIgnoreCase("EXIT")) //close program on call
                    System.exit(0);
                while (!kb.hasNextInt()) //makes sure input is a num, not a string
                {
                    System.out.println("Not an int, please try again.");
                    kb.next();
                }
            }
            int attackChoice = kb.nextInt();
            while (true) //makes sure key entered is between the num of opponent characters alive still
            {
                if (attackChoice > 0 && attackChoice <= opponent.size())
                    break;
                else
                {
                    System.out.println("There is no choice for the number you inputed, please try again.");
                    if (!kb.hasNextInt())
                    {
                        while (!kb.hasNextInt())
                        {
                            System.out.println("Not an int, please try again");
                            kb.next();
                        }
                    }
                    else
                        attackChoice = kb.nextInt();
                }
            }
            Character opponentCh = opponent.get(attackChoice-1);
            System.out.println("You have targeted " + opponentCh.getName() + ".");
            System.out.println("Pick move:\n" + starter.get(starterChoice).toString());
            if (!kb.hasNextInt())
            {
                escStr = kb.next();
                if (escStr.equalsIgnoreCase("EXIT")) //close program on call
                    System.exit(0);
                while (!kb.hasNextInt()) //makes sure input is a num, not a string
                {
                    System.out.println("Not an int, please try again.");
                    kb.next();
                }
            }
            int movePick = kb.nextInt();
            while (true) //ensures that move picked is the correct input with provided number of moves
            {
                if (movePick > 0 && movePick <= starter.get(starterChoice).getTotalMoves())
                    break;                
                else
                {
                    System.out.println("There is no choice for the number you inputed, please try again.");
                    if (!kb.hasNextInt())
                    {
                        while (!kb.hasNextInt())
                        {
                            System.out.println("Not an int, please try again");
                            kb.next();
                        }
                    }
                    else
                        movePick = kb.nextInt();
                }
            }
            damageSystem(movePick,starter.get(starterChoice),opponentCh);
            if (opponentCh.getHealth() <= 0) //identifies if opponent character is dead
            {
                num = (int)(Math.random()*4) + 1;
                String KOstr = "";
                switch(num)
                {
                    case 1: 
                    {KOstr = " destroyed "; break;}
                    case 2: 
                    {KOstr = " ended "; break;}
                    case 3: 
                    {KOstr = " finished "; break;}
                    case 4: 
                    {KOstr = " wrecked "; break;}
                }
                System.out.println(starter.get(starterChoice).getName() + KOstr + "the " + opponentCh.getArchType() + ", " + opponentCh.getName() + ", with " + starter.get(starterChoice).getMoveMade() + "!\n");
                opponent.remove(opponentCh);
            }
            else
                System.out.println(starter.get(starterChoice).getName() + " used " + starter.get(starterChoice).getMoveMade() + " on " + opponentCh.getName() + "!\n");
            if (!isAlive(opponent))
            {
                battle(starter,opponent);
            }
            else if (starter.equals(player1Deck))
            {
                System.out.println("Player 2's turn now.\n\nPick a character:");
                battle(opponent,starter);
            }
            else
            { 
                System.out.println("Player 1's turn now.\n\nPick a character:");
                battle(opponent,starter);
            }
        }
        else
        {
            if (!isAlive(starter))
            {
                if (starter.equals(player1Deck))
                    System.out.println("Player 2 won!\n\n");
                else
                    System.out.println("Player 1 won!\n\n");
            }
            else if (!isAlive(opponent))
            {
                if (opponent.equals(player1Deck))       
                    System.out.println("Player 2 won!\n\n");
                else
                    System.out.println("Player 1 won!\n\n");
            }
            try {Thread.sleep(800);} catch (Exception e) {}
            System.out.println("Press ENTER to play another game.\nType EXIT to quit.");
            Scanner kb = new Scanner(System.in);
            String readStr = kb.nextLine();
            while (readStr != null) //makes sure key(s) entered is the ENTER key or EXIT
            {
                if (readStr.equals(""))
                {
                    new Game();
                    break;
                }
                else if (readStr.equalsIgnoreCase("EXIT")) //close program
                {
                    System.exit(0);
                }
                else
                {
                    System.out.println("Can't recognize that input, please try again");
                    readStr = kb.nextLine();
                }
            }
        }
    }

    public void damageSystem(int movePicked, Character player, Character opponent) //damage system in game
    {
        if (player1Deck.contains(player) && !player2Deck.contains(player))
        {
            player.move(movePicked,opponent);
        }
        else if (player2Deck.contains(player) && !player1Deck.contains(player))
        {
            player.move(movePicked,opponent);
        }
        else
        {
            System.out.println("Error! both players have atleast one character that's the same, restarting game");
            try {Thread.sleep(1200);} catch (Exception e) {}
            new Game();
        }
    }

    public void actionPerformed(ActionEvent e)
    {
    }

    public void mousePressed(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
    }

    public void mouseExited(MouseEvent e)
    {
    }

    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseClicked(MouseEvent e)
    {
    }

    public void keyTyped(KeyEvent e)
    {
    }

    public void keyPressed(KeyEvent e)
    {
        // if (e.getKeyCode() == KeyEvent.VK_ENTER)
        // {
        // if (play)
        // {
        // //start game
        // e.consume();
        // }
        // else if (!play)
        // {
        // play = true;
        // new Game();
        // // repaint();
        // }
        // }
        // else if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
        // {
        // int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the game?");
        // if (input == 0)
        // System.exit(0);
        // }
    }

    public void keyReleased(KeyEvent e)
    {
    } 
}