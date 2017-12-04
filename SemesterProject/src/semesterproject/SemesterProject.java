package semesterproject;

import javax.swing.JFrame;

/**
 * Semester Project: Navigating through a maze.
 *      - on github
 *          ~ https://github.com/KarolinaEP/SemesterProject.git
 *      - randomly generated maze
 *      - using the arrow keys
 *      - possibly include a jump scare
 * @author Karolina Pilip, Matt Woodard, Kaleigh McGuirl
 * @version 29 November 2017
 */
public class SemesterProject {

    public static void main(String[] args) {
        JFrame frame = new JFrame ("Maze");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new semesterproject.MazePanel());
        frame.pack();
        frame.setVisible(true);
    }
    
}
