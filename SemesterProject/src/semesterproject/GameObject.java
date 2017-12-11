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
    
    public boolean hit(Wall w,Player p){
        int wl = w.get_position()[0];
        int wt = w.get_position()[1];
        int wr = w.get_size()[0]+wl;
        int wb = wt+w.get_size()[1];
        int pl = p.get_position()[0],pt = p.get_position()[1];
        int pr = p.get_size()[0]+pl, pb = pt+p.get_size()[1];
        System.out.println(wl+' '+wt+' '+pl+' '+pt);
        if( ((pl>wl)&&(pl<wr))||(((pr>wl)&&(pr<wr)) ) && ( ((pt>wt)&&(pt<wb))||((pb>wt)&&(pb<wb)) ) ){ 
            
            return true;
        }
        else{ return false;}
    }
    
}
