import javax.swing.*;
import java.awt.*;
        import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener
{

    public static int x=100,y=100;

    public static void main(String[]args)
    {
        Game g= new Game();
        Player bob= new Player();
        JFrame f = new JFrame();
        f.setSize(600,600);
        f.add(g);
        f.addKeyListener(g);
        g.setBackground(Color.cyan);
        f.setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(x,y,10,10);

    }

    @Override
    public void keyTyped(KeyEvent e) {    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        repaint();
        if(e.getKeyChar()=='a')
        {
            System.out.println("Left");
            x-=10;
            Player.move(x,y);
        }
        else if(e.getKeyChar()=='w')
        {
            System.out.println("Up");
            y-=10;
            Player.move(x,y);
        }
        else if(e.getKeyChar()=='s')
        {
            System.out.println("Down");
            y+=10;
            Player.move(x,y);
        }
        else if(e.getKeyChar()=='d')
        {
            System.out.println("Right");
            x+=10;
            Player.move(x,y);
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {    }
}