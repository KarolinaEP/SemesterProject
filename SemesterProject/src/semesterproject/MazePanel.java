package semesterproject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Class MazePanel controls the game panel
 * @author Karolina Pilip, Matt Woodard, Kaleigh McGuirl
 * @version 4 December 2017
 */
public class MazePanel extends JPanel{
    //baseline parameters...
   private final static int WIDTH = 200, HEIGHT = 200, U_RATE = 32, SIZE=20;
   //change keyboard controls here...
   protected final static int K_U = KeyEvent.VK_UP,     //used to move up
                              K_D = KeyEvent.VK_DOWN,   //used to move down
                              K_L = KeyEvent.VK_LEFT,   //used to move left
                              K_R = KeyEvent.VK_RIGHT;  //used to move right
   //key array to determine if a key is being held down by the person:
   protected boolean[] key_down = {false,false,false,false,false,false}; //keeps track of keys held
   
   protected Timer update;             //the synchronous event generator
   protected Random r = new Random();  //a source of uncertainty
   
   //polymorphic example
   protected Player  p; Maze m;
   protected ArrayList<Wall> w = new ArrayList<Wall>();
   
   public MazePanel(){
       
       
       for(int i = 0; i < m.get_map().length; i++){
           for(int j=0;j<m.get_map()[i].length;j++){
               w.add(new Wall(i,j,SIZE,SIZE,0,0));
           }
      }
   }
   
    @Override
    public void paintComponent (Graphics page){ 
      super.paintComponent(page);
      Font font = new Font("Times",Font.BOLD, 16);
      page.setFont(font);
      page.setColor(Color.WHITE);
   }
    
    protected class PolyListener implements ActionListener{
      //--------------------------------------------------------------
      //  Updates the position of the image and possibly the direction
      //  of movement whenever the timer fires an action event.
      //--------------------------------------------------------------
      @Override
      public void actionPerformed (ActionEvent event){        
         if (key_down[0]){p.set_position(0);  }
         if (key_down[1]){p.set_position(1);  }
         if (key_down[2]){p.set_position(2);  }
         if (key_down[3]){p.set_position(3);  }
         
      }
    }
}
