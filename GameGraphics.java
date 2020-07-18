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
public class GameGraphics
{
    public static void main(String[] args) throws IOException //trying to work with image reading and loading 
    {
        JPanel panel = new JPanel();
        BufferedImage Joo = ImageIO.read(new File("G:\\JooGeeMon\\Mr.JooPP.gif"));
        JLabel label = new JLabel(new ImageIcon(Joo));
        panel.add(label);
        
        JFrame f = new JFrame("JooGeeMon!");
        f.setSize(800,800);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.add(panel);
        f.setVisible(true);
    }
}