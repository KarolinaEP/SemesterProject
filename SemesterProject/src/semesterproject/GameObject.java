package semesterproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * 
 */
public class GameObject {
    
    private int xpo,ypo,width,height,xinc,yinc;
    
    public GameObject(int xpo,int ypo,int width,int height,int xinc,int yinc){
        this.xpo=xpo; this.ypo=ypo; this.width=width; this.height=height;
        this.xinc=xinc; this.yinc=yinc;
    }
    
    public int[] get_position(){int[] r={xpo,ypo}; return r;}
    public int[] get_size(){int[] r={width,height}; return r;}
    public int[] get_increment(){int[] r={xinc,yinc}; return r;}
    
    public void set_position(int x,int y){this.xpo=x; this.ypo=y;}
    
    public void paint(Graphics g){ 
      Font font = new Font("Times",Font.BOLD, 14);
      g.setFont(font);
      g.setColor(Color.WHITE);
      g.fillOval(xpo,ypo,width,height);
      g.drawString(xpo+" "+ypo,xpo-width/2,ypo);
    }
    
}
