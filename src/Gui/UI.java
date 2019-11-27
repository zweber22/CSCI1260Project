// ---------------------------------------------------------------------------
// File name: UI.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	11-24-19
// Date of Last Modification:	11-26-19
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
 * Date last modified: 11-26-19
 * @author Zachary Weber
 */
public class UI
{

    JFrame window;
    JPanel titlePanel, playPanel, quitPanel;
    JLabel titleLabel;
    JButton playButton, quitButton;
    Font titleFont = new Font("Verdana", Font.PLAIN, 120);
    Font normalFont = new Font("Verdana", Font.PLAIN, 25);

    Board board = new Board();

    /**
     * Method Name: createUI <br>
     * Method Purpose: Pulls all elements of the project together to create a UI that will be displayed in the game <br>
     *
     * <hr>
     * Date created: 11-24-19 <br>
     * Date last modified: 11-26-19 <br>
     *
     * <hr>
     * Notes on specifications, special algorithms, and assumptions:
     *   notes go here name
     *
     * <hr>
     *   @param mHandler
     *   @return void
     */
    public void createUI(Game.ChoiceHandler mHandler)
    {
        //Creates the window
        window = new JFrame("Royal Game Of Ur");
        window.setSize(1600, 900);
        //window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);

        //Creates the title screen
        titlePanel = new JPanel();
        titlePanel.setBounds(200, 100, 1100, 500);
        titlePanel.setBackground(Color.black);
        titleLabel = new JLabel("Royal Game Of Ur");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(titleFont);
        titlePanel.add(titleLabel);

        //Creates the panel and button for Play
        playPanel = new JPanel();
        playPanel.setBounds(650, 600, 300, 200);
        playPanel.setBackground(Color.black);
        playButton = new JButton("Play");
        playButton.setBackground(Color.black);
        playButton.setForeground(Color.WHITE);
        playButton.setFont(normalFont);
        playButton.setFocusPainted(false);
        playButton.addActionListener(mHandler);
        playButton.setActionCommand("Play");
        playPanel.add(playButton);

        //Creates the panel and button for Quit
        quitPanel = new JPanel();
        quitPanel.setBounds(650, 700, 300, 200);
        quitPanel.setBackground(Color.black);
        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.black);
        quitButton.setForeground(Color.WHITE);
        quitButton.setFont(normalFont);
        quitButton.setFocusPainted(false);
        quitButton.addActionListener(mHandler);
        quitButton.setActionCommand("Quit");
        quitPanel.add(quitButton);

        //Adds all the panels to the JFrame
        window.add(titlePanel);
        window.add(playPanel);
        window.add(quitPanel);
        window.add(board);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

    }


}
