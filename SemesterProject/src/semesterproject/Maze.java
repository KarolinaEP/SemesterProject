package semesterproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Karolina Pilip, Matt Woodard, Kaleigh McGuirl
 * @version 9 December 2017 
 */
public class Maze {
    private int[][] map;
    private Random rand = new Random(1);
    public Maze(){
        
       int[][] map = {{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
       {0, 0, 0, 0, 1, 0, 0, 0 ,0, 0},
       {0, 0, 0, 0 ,1 ,0 ,0 ,0, 0 ,0},
       {0, 0, 0, 0, 1, 0, 0 ,0 ,0, 0},
       {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
       {0, 0, 0, 0, 1 ,0, 0, 0, 0, 0},
       {0, 0, 0, 0, 1 ,0 ,0 ,0, 0, 0},
       {0, 0, 0, 0, 1, 0, 0 ,0 ,0, 0},
       {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
       {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}};
       this.map=map;
   }
    
    public Maze (File file, int size) {
        this.rand = new Random(1);
        int i = 0, j = 0;
        map = new int[size][size];
        try {
            
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                int val = sc.nextInt();
                map[i][j++] = val;
                if (j == size) {
                    i++;
                    j = 0;
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File cannot be read - " + file);
        }
    }
    
    public int get_map(int x,int y){return map[x][y];}
    public int[] map_size(){int[] q = {map.length,map[0].length};return q;}
    public int[][] RandomMaze(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                map[i][j] = rand.nextInt();
            }
        }
        return map;
    }
}
