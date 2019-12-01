// ---------------------------------------------------------------------------
// File name: Game.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	11-24-19
// Date of Last Modification:	11-26-19
// ---------------------------------------------------------------------------

package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Class Name: Game <br>
 * Class Purpose: This class calls the UI and visibility methods to display everything to the game screen <br>
 *
 * <hr>
 * Date created: 11-24-19 <br>
 * Date last modified: 11-26-19
 * @author Zachary Weber
 */

public class Game
{
    ChoiceHandler mHandler = new ChoiceHandler();
    UI ui = new UI();
    Visibility v = new Visibility(ui);
    Rules r = new Rules();


    public static void main(String[] args)
    {
        new Game();
    }
    /**
     * Method Name: game <br>
     * Method Purpose: To create an instance of the game <br>
     *
     * <hr>
     * Date created: 11-24-19 <br>
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

    public Game()
    {
        ui.createUI(mHandler);
        v.showMainMenu();
    }
    /**
     * Method Name: ChoiceHandler <br>
     * Method Purpose: Implements an action listener to manage a switch which holds different choices for the user <br>
     *
     * <hr>
     * Date created: 11-24-19 <br>
     * Date last modified: 11-30-19 <br>
     *
     * <hr>
     * Notes on specifications, special algorithms, and assumptions:
     *   notes go here name
     *
     * <hr>
     *   @param
     *   @return
     */
    public class ChoiceHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            String choice = e.getActionCommand();

            switch(choice)
            {
                case "Play": v.mainMenuToBoard(); break;
                case "Quit": System.exit(0); break;
                case "Rules": r.createRules(); break; // To be added
                //case "roll": break; //To be added
               // case "pass": break; //To be added
            }
        }
    }
}
