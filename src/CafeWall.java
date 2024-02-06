/*
 * Created by BEN BLAIR on 28 JANUARY 2024
 * Used Generative AI: ChatGPT
 * This code functions by drawing rows of black and white boxes with a blue "X" centered
 * on the black boxes.
 * Draw row creates a row of the grids.
 *
 */

import java.awt.*;
import java.io.IOException;

public class CafeWall {

    //Do not remove the static variable mortar
    //You can change the value to either 1 or 2 (Your code should work for both cases)
    private static Integer mortar = 2;  // do NOT remove this line OR change the variable name - you CAN change the value

    public static void main(String[] args) throws IOException {
        //Initialize pane (Change the parameters in below line according to spec!)
        DrawingPanel panel = initializePanel(650, 420, Color.GRAY);
        //Write your code here
        //drawRow(3, 25, 0, 0, panel.getGraphics());
        drawRow(0, 0, 3, 25, panel.getGraphics());
        drawRow(60, 70, 4, 35, panel.getGraphics());
        drawGrid(15, 140, 5, 22, 0, panel.getGraphics());
        drawGrid(250, 180, 3, 25, 15, panel.getGraphics());
        drawGrid(425, 200, 5, 20, 15, panel.getGraphics());
        drawGrid(460, 15, 3, 25, 30, panel.getGraphics());
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

    public static void drawRow(int x, int y, int number, int size, Graphics g) {
        for (int boxes = 0; boxes < number; boxes++) {
            int boxX = x + 2 * boxes * size;
            g.setColor(Color.BLACK);
            // Draw black box
            g.fillRect(boxX, y, size, size);
            g.setColor(Color.BLUE);
            // Draw an "X" inside each black box
            g.drawLine(boxX, y, boxX + size - 1, y + size - 1);
            g.drawLine(boxX , y + size - 1, boxX + size - 1, y);
            g.setColor(Color.WHITE);
            // Draw White Box
            g.fillRect(boxX + size, y, size, size);
        }
    }

    public static void drawGrid(int x, int y, int number, int size, int offset, Graphics g) {
        for (int i = 0; i < number * 2; i++) {
            // xOffset will be 0 if i is even
            // xOffset will be 1 if i is odd
            //This helps creates the optical illusion
            int xOffset = (i % 2) * offset;
            drawRow(x + xOffset, y + i * (size + mortar), number, size, g);
        }
    }

}

