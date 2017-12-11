package semesterproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Karolina Pilip, Matt Woodard, Kaleigh McGuirl
 * @version 9 December 2017 
 */
public class Maze {
    private int[][] map;
    
    public Maze(){
       int[][] map = new int[10][10];
   }
    
    public Maze (File file, int size) {
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
    
    public int[][] get_map(){return map;}
}
