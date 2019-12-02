// ---------------------------------------------------------------------------
// File name: ChoiceHandler.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	12-1-19
// Date of Last Modification:	12-1-19
// ---------------------------------------------------------------------------
package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class Name: ChoiceHandler <br>
 * Class Purpose: This class creates an ActionListener for the buttons and uses a switch to control the outcomes <br>
 *
 * <hr>
 * Date created: 12-1-19 <br>
 * Date last modified: 12-1-19
 * @author Zachary Weber
 */

public class ChoiceHandler implements ActionListener
{

    UI ui = new UI();
    Visibility v = new Visibility(ui);
    Rules r = new Rules();

    /**
     * Method Name: actionPerformed <br>
     * Method Purpose: Overrides the built in java method actionPerformed to create the version that we want, which
     * in this case is to make a switch to control the outcomes of pressing a button <br>
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
     *   @param
     *   @return void
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();

        switch(choice)
        {
            case "Play": v.mainMenuToBoard(); break; //Sets the play button to call a method from the Visibility class
            case "Quit": System.exit(0); break; //Sets the quit button to exit the game
            case "Rules": r.createRules(); break; //Sets the rules button to call a method from the Rules Class
        }
    }
}
