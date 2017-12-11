package semesterproject;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random; 

/**
 * This maintains all of the possible mazes that can be done for this project.
 * This was set up similarly to the Nonogram method from CS114 Assignment 4
 * @author Kaleigh McGuirl, Karolina Pilip, Matthew Woodard
 * @version December 6, 2017
 */
public class MazePool {
//    private File[] files;
//    private ArrayList<String> results;
//    
//    public void loadFiles() {
//        results = new ArrayList<>();
//        String path = Paths.get(".\\Maze").toString();
//        files = new File(path).listFiles();
//        //System.out.println(path);
//
//        for (File file : files) {
//            if (file.isFile()) {
//                results.add(file.getName());
//            }
//        }
//    }
//    
//    
//    public Maze getMazePuzzle() {
//        int r = (new Random()).nextInt(results.size());  
//        System.out.println("r="  + r);                   
//        return new Maze(files[r]);                  
//    }
    
    public MazePool(){
        int mazewalls[][] = {
            {0,1,0,0,1,1,1,0,1,0},
            {0,1,1,0,0,0,0,0,1,0},
            {0,0,0,0,1,1,1,0,1,1},
            {1,0,1,0,0,0,1,0,0,1},
            {1,0,1,1,1,0,1,1,1,1},
            {1,0,1,0,1,0,0,1,0,0},
            {1,0,0,0,1,1,1,1,0,1},
            {0,0,1,0,0,0,0,1,0,1},
            {1,1,1,0,1,1,0,0,0,1},
            {1,0,0,0,0,1,1,1,1,1}};
    }
    
}
