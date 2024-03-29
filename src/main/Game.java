// ---------------------------------------------------------------------------
// File name: Game.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	11-24-19
// Date of Last Modification:	12-1-19
// ---------------------------------------------------------------------------

package package1;

/**
 * Class Name: Game <br>
 * Class Purpose: This class calls the UI and visibility methods to display everything to the game screen <br>
 *
 * <hr>
 * Date created: 11-24-19 <br>
 * Date last modified: 12-1-19
 * @author Zachary Weber
 */

public class Game
{
    ChoiceHandler mHandler = new ChoiceHandler();
    UI ui = new UI();
    Visibility v = new Visibility(ui);

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

    public Game()
    {
        ui.createUI(mHandler);
        v.showMainMenu();

    }

}
    }
}
