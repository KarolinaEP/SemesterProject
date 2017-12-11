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
    private final int xinc,yinc;
    private int xpo,ypo,size;
    
    public Player(int xpo,int ypo,int width,int height,int xinc,int yinc){
        super(xpo,ypo,width,height,xinc,yinc);
        this.xinc=xinc;this.yinc=yinc;size=height;
    }
    
    public void set_position(int d){
        int v; //variable used to change position value
        switch (d) {
            case 0: //down
                v=super.get_position()[1]-yinc;
                super.set_position(get_position()[0],v); break;
            case 1: //up
                v=super.get_position()[1]+yinc;
                super.set_position(get_position()[0],v); break;
            case 2: //left
                v=super.get_position()[0]-xinc;
                super.set_position(v,get_position()[1]); break;
            default: //right
                v=super.get_position()[0]+xinc;
                super.set_position(v,get_position()[1]); break;
        }
    }
    
    @Override
    public int[] get_position(){int[] x={xpo,ypo};return x;}
    @Override
    public int[] get_size(){int[] a={size,size};return a;} 
    
    public void paint(Graphics g){
      Font font = new Font("Times",Font.BOLD, 14);
      g.setFont(font);
      g.setColor(Color.RED);
      g.fillRect(super.get_position()[0],super.get_position()[1],super.get_size()[1],super.get_size()[0]);
    }
    
//    public boolean end(){
//        if()
//    }
}
