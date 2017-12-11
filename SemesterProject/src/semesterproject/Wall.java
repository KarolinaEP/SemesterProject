package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * 
 */
public class Wall extends GameObject{
    
//    private int xpo;int ypo;
    
    public Wall(int xpo,int ypo,int width,int height,int xinc,int yinc){
        super(xpo,ypo,width,height,0,0);
    }
    
    public void paint(Graphics g){
      Font font = new Font("Times",Font.BOLD, 14);
      g.setFont(font);
      g.setColor(Color.WHITE);
      g.fillRect(super.get_position()[0],super.get_position()[1],super.get_size()[1],super.get_size()[0]);
    }
}
