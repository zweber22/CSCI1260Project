// ---------------------------------------------------------------------------
// File name: Rules.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	11-29-19
// Date of Last Modification:	11-30-19
// ---------------------------------------------------------------------------
package package1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Class Name: Rules <br>
 * Class Purpose: This class creates a separate wJFrame that, when accessed by the "Rules" button,
 * displays the rules of the game <br>
 *
 * <hr>
 * Date created: 11-29-19 <br>
 * Date last modified: 11-30-19
 * @author Zachary Weber
 */
public class Rules
{

    JFrame rulesWindow = new JFrame("Rules");

    /**
     * Method Name: createRules <br>
     * Method Purpose: Creates a new JFrame to display the rules of the game and loads an image of the rules <br>
     *
     * <hr>
     * Date created: 11-29-19 <br>
     * Date last modified: 11-30-19 <br>
     *
     * <hr>
     * Notes on specifications, special algorithms, and assumptions:
     *   notes go here name
     *
     * <hr>
     *   @param
     *   @return void
     */
    public void createRules()
    {
        rulesWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BufferedImage img = null; //Instantiating the new image
        //We are using a try catch to handle exceptions in the event that we can not load the image and need
        //to find out what went wrong and where
        try
        {
            img = ImageIO.read(getClass().getResource("/package1/Rules.png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(1);
        }

        //Here we have created a Jlabel to hold the image that we are loading
        ImageIcon icon = new ImageIcon(img);
        JLabel label = new JLabel();
        label.setIcon(icon);

        //Adding the image to the JFrame and setting the JFrames properties
        rulesWindow.getContentPane().add(label, BorderLayout.CENTER);
        rulesWindow.pack();
        rulesWindow.setLocationRelativeTo(null);
        rulesWindow.setVisible(true);
        rulesWindow.setResizable(false);
    }
}
