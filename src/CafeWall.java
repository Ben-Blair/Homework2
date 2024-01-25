/*
 * Created by YOUR_NAME on DATE
 *
 * Add comments that describe the overall program
 *
 * Additional Instructions (that can be removed once your solution is entered):
 *    You shouldn't use any if-else statements
 *    Put comments in your code
 *    Follow freedom of information rule specified in the Syllabus (i.e., "Discussed with: XXX",
 *       "Used Generative AI: XXX", etc.)
 */

import java.awt.*;
import java.io.IOException;

public class CafeWall {

    //Do not remove the static variable mortar
    //You can change the value to either 1 or 2 (Your code should work for both cases)
    private static Integer mortar = 2;  // do NOT remove this line OR change the variable name - you CAN change the value

    public static void main(String[] args) throws IOException {
        //Initialize pane (Change the parameters in below line according to spec!)
        DrawingPanel panel = initializePanel(100, 100, Color.ORANGE);
        //Write your code here


        //Remove this comment and below line and implement your code
        System.out.println("Import Success! Now delete this code and implement your own!");


        //Save the drawing into png file
        panel.save("output" + mortar + ".png"); //Do not remove (this code must be the last statement in main)
    }

    //Do not remove or change this method
    /**
     * This method creates a new drawing panel object with given dimensions and background color
     * and returns the panel object.
     *
     * @param width the width (in pixels) of drawing panel object to create
     * @param height the height (in pixels) of drawing panel object to create
     * @param bgColor the background color of drawing panel object to create
     * @return a new drawing panel object with the given width, height, and background color
     */
    private static DrawingPanel initializePanel(int width, int height, Color bgColor) {
        //Create the drawing panel object
        DrawingPanel panel = new DrawingPanel(width, height);

        //Set background color
        panel.setBackground(bgColor);

        //Return the panel object
        return panel;
    }
}