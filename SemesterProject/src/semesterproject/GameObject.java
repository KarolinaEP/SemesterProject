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
      g.fillRect(xpo,ypo,width,height);
    }
    
    public boolean hit(GameObject e,GameObject p){
        int x_e = e.get_position()[0];
        int y_e = e.get_position()[1];
        int w_e = e.get_size()[0];
        int h_e = e.get_size()[1];
        int p_x = p.get_position()[0],p_y = p.get_position()[1];
        int p_w = p.get_size()[0], p_h = p.get_size()[1];
        //check a rectagular area to see if x_p and y_p are inside
        if( ( ((p_x>=x_e)&&(p_x<=(x_e+w_e)))||(((p_x+p_w)>=x_e)&&((p_x+p_w)<=(x_e+w_e))) ) && ( ((p_y>=y_e)&&(p_y<=(y_e+h_e)))||(((p_y+p_h)>=y_e)&&((p_y+p_h)<=(y_e+h_e))) ) ){ 
            
            return true;
        }
        else{ return false;}
    }
    
}
