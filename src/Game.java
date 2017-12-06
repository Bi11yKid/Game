import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener
{

    public int x=100,y=10;



    public static void main(String[]args)
    {
        Game g= new Game();
        JPanel p = new JPanel();
        JFrame f = new JFrame();

        f.setSize(512,512);
        f.add(g);
        f.addKeyListener(g);
        p.setSize(512,512);
        g.setBackground(Color.black);
        f.setVisible(true);
        p.setVisible(true);
    }





    @Override
    public void keyTyped(KeyEvent e)
    {

    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println("WORKING");
        repaint();
        if(e.getKeyChar()=='a')
        {
            x-=10;
        }else if(e.getKeyChar()=='w')
        {
            y-=10;
        }else if(e.getKeyChar()=='s')
        {
            y+=10;
        }else if(e.getKeyChar()=='d')
        {
            x+=10;
        }
    repaint();
    }
    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.green);
        g.fillRect(x,y,10,10);

    }

}