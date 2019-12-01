// ---------------------------------------------------------------------------
// File name: WinLoseUI.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	12-1-19
// Date of Last Modification:	12-1-19
// ---------------------------------------------------------------------------
package package1;

import javax.swing.*;
import java.awt.*;

/**
 * Class Name: WinLoseUI <br>
 * Class Purpose: This class creates the JFrame that is displayed at the end of the game<br>
 *
 * <hr>
 * Date created: 12-1-19 <br>
 * Date last modified: 12-1-19
 * @author Zachary Weber
 */
public class WinLoseUI
{
    public JFrame window = new JFrame();
    public JLabel titleLabel = new JLabel();
    public JButton playButton = new JButton();
    public JButton quitButton = new JButton();
    public JButton rulesButton = new JButton();
    Font titleFont = new Font("Castellar", Font.PLAIN, 70);
    Font normalFont = new Font("Castellar", Font.PLAIN, 30);


    /**
     * Method Name: createWinLoseUI <br>
     * Method Purpose: Creates a window to be displayed at the end of a game, giving users the choice between playing
     *  again, or quitting the application <br>
     *
     * <hr>
     * Date created: 12-1-19 <br>
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
    public void createWinLoseUI(Game.ChoiceHandler mHandler)
    {
        //Creates the window
        window.setExtendedState(Frame.MAXIMIZED_BOTH);
        FlowLayout f = new FlowLayout(1, 200, 175); //Sets the layout of the title and buttons
        window.setLayout(f); //Apply's the layout to the frame
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black); //Sets the background color to black

        //Making the title label and setting its properties
        titleLabel.setText("Play Again?");
        titleLabel.setForeground(Color.white);
        titleLabel.setBackground(Color.black);
        titleLabel.setFont(titleFont);

        //Making the play button and setting its properties
        playButton.setText("Play");
        playButton.setBackground(Color.BLACK);
        playButton.setForeground(Color.white);
        playButton.setFont(normalFont);
        playButton.setHorizontalAlignment(SwingConstants.CENTER);
        playButton.addActionListener(mHandler); //Adds an action listener to the button
        playButton.setBorderPainted(false);

        //Making the play button and setting its properties
        quitButton.setText("Quit");
        quitButton.setBackground(Color.BLACK);
        quitButton.setForeground(Color.white);
        quitButton.setFont(normalFont);
        quitButton.setHorizontalAlignment(SwingConstants.CENTER);
        quitButton.addActionListener(mHandler); //Adds an action listener to the button
        quitButton.setBorderPainted(false);

        window.add(titleLabel, f);
        window.add(playButton, f);
        window.add(quitButton, f);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
   }
}
