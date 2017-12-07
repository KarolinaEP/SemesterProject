package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 * Class Player
 * @author Karolina Pilip, Matt Woodard, Kaleigh McGuirl
 * @version 4 December 2017
 */
public class Player extends GameObject{
    
    public Player(int xpo,int ypo,int width,int height,int xinc,int yinc){
        super(xpo,ypo,width,height,xinc,yinc);
    }
    
    public void set_position(int d){
        if(d==0){
            
        }else if(d==1){
            
        }else if(d==2){
            
        }else{
            
        }
    }
    
    public void paint(Graphics g){
      Font font = new Font("Times",Font.BOLD, 14);
      g.setFont(font);
      g.setColor(Color.GREEN);
      g.drawString(super.get_position()[0]+" "+super.get_position()[1],super.get_position()[0]-super.get_size()[0]/2,super.get_position()[1]);
      g.fillOval(super.get_position()[0],super.get_position()[1],super.get_size()[1],super.get_size()[0]);
    }
}
