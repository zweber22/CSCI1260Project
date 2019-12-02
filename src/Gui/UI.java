// ---------------------------------------------------------------------------
// File name: UI.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	11-24-19
// Date of Last Modification:	12-1-19
// ---------------------------------------------------------------------------
package package1;

import javax.swing.*;
import java.awt.*;

/**
 * Class Name: UI <br>
 * Class Purpose: This class creates the UI which is displayed for the game <br>
 *
 * <hr>
 * Date created: 11-24-19 <br>
 * Date last modified: 12-1-19
 * @author Zachary Weber
 */
public class UI
{

    public JFrame window = new JFrame();
    public JLabel titleLabel = new JLabel();
    public JButton playButton = new JButton();
    public JButton quitButton = new JButton();
    public JButton rulesButton = new JButton();
    Font titleFont = new Font("Castellar", Font.PLAIN, 100);
    Font normalFont = new Font("Castellar", Font.PLAIN, 50);
    

    /**
     * Method Name: createUI <br>
     * Method Purpose: Pulls all elements of the project together to create a UI that will be displayed in the game <br>
     *
     * <hr>
     * Date created: 11-24-19 <br>
     * Date last modified: 12-1-19 <br>
     *
     * <hr>
     * Notes on specifications, special algorithms, and assumptions:
     *   notes go here name
     *
     * <hr>
     *   @param mHandler
     *   @return void
     */
    public void createUI(ChoiceHandler mHandler)
    {
        //Creates the window
        window.setSize(1400, 1300); //setting the size of the window
        FlowLayout f = new FlowLayout(1, 250, 175); //Sets the layout of the title and buttons
        window.setLayout(f); //Apply's the layout to the frame
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black); //Sets the background color to black

        //Making the title label and setting its properties
        titleLabel.setText("Royal Game of Ur");
        titleLabel.setForeground(Color.white);
        titleLabel.setBackground(Color.black);
        titleLabel.setFont(titleFont);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Making the play button and setting its properties
        playButton.setText("Play");
        playButton.setBackground(Color.BLACK);
        playButton.setForeground(Color.white);
        playButton.setFont(normalFont);
        playButton.setHorizontalAlignment(SwingConstants.CENTER);
        playButton.addActionListener(mHandler); //Adds an action listener to the button
        playButton.setBorderPainted(false); //Removes the border around the button

        //Making the play button and setting its properties
        quitButton.setText("Quit");
        quitButton.setBackground(Color.BLACK);
        quitButton.setForeground(Color.white);
        quitButton.setFont(normalFont);
        quitButton.setHorizontalAlignment(SwingConstants.CENTER);
        quitButton.addActionListener(mHandler); //Adds an action listener to the button
        quitButton.setBorderPainted(false); //Removes the border around the button

        //Making the rules button and setting its properties
        rulesButton.setText("Rules");
        rulesButton.setBackground(Color.BLACK);
        rulesButton.setForeground(Color.white);
        rulesButton.setFont(normalFont);
        rulesButton.setHorizontalAlignment(SwingConstants.CENTER);
        rulesButton.addActionListener(mHandler); //Adds an action listener to the button
        rulesButton.setBorderPainted(false); //Removes the border around the button

        //Adds all the elements to the frame to be displayed
        window.add(titleLabel, f);
        window.add(playButton, f);
        window.add(quitButton, f);
        window.add(rulesButton, f);

        //Finish setting the properties of the window
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setTitle("Game of Ur");
        window.setResizable(false);

    }
}
