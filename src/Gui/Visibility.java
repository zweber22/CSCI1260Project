// ---------------------------------------------------------------------------
// File name: Visibility.java
// Project name: RoyalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Zachary Weber, weberz@etsu.edu
// Course-Section: CSCI 1260
//	Creation Date:	11-24-19
// Date of Last Modification:	11-26-19
// ---------------------------------------------------------------------------
package package1;
/**
 * Class Name: Visibility <br>
 * Class Purpose: Manages the visibility of the different elements of the UI  <br>
 *
 * <hr>
 * Date created: 11-24-19 <br>
 * Date last modified: 11-26-19
 * @author Zachary Weber
 */
public class Visibility
{
    UI ui;
    Rules rules;

    /**
     * Method Name: Visibility <br>
     * Method Purpose: Constructor for the Visibility class <br>
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
     *   @param userInterface
     *   @return void
     */
    public Visibility(UI userInterface)
    {
        ui=userInterface;
    }

    /**
     * Method Name: showMainMenu <br>
     * Method Purpose: This method makes sure that the board is not visible to the user while also
     * making sure that the main menu is visible to the user<br>
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
     *   @param
     *   @return void
     */
    public void showMainMenu()
    {
        //Show the main menu
       ui.titleLabel.setVisible(true);
       ui.playButton.setVisible(true);
       ui.quitButton.setVisible(true);

       //Hide the Board
        ui.board.getGui().setVisible(false);

    }

    /**
     * Method Name: mainMenuToBoard <br>
     * Method Purpose: This method makes sure that the board IS visible to the user while also
     * making sure that the main menu is NOT visible to the user<br>
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
     *   @param
     *   @return void
     */
    public void mainMenuToBoard()
    {
        //Show the Board
        ui.board.getGui().setVisible(true);

        //Hide the main menu
        ui.titleLabel.setVisible(false);
        ui.playButton.setVisible(false);
        ui.quitButton.setVisible(false);


    }
}
