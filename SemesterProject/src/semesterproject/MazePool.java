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
    private File[] files;
    private ArrayList<String> results;
    
    public void loadFiles() {
        results = new ArrayList<>();
        String path = Paths.get(".\\Maze").toString();
        files = new File(path).listFiles();
        //System.out.println(path);

        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }
    }
    //This will be used to make the code pick a random maze
    //Might need another new class - which provides a basis to what each code would be 
    //Then we use the text documents in order to bring up those mazes
//    public Maze getMazePuzzle() {
//        int r = (new Random()).nextInt(results.size());  //new Random() here is an anonymous object
//        System.out.println("r="  + r);                   //used for debugging to know which is being chosen
//        return new Maze(files[r], 5);                  //game currently handles 5x5 puzzles only
//    }
    
    
}
