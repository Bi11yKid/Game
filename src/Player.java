import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player {

   public static void move(int x, int y)
   {
       if(x<0)//left wall
           Game.x=0;
       if(x+10>512)//right wall
           Game.x=502;
       if(y<0)//top wall
           Game.y=0;
       if(y+10>512)//bottom
           Game.y=502;


   }
}
