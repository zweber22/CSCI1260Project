/**
 * ---------------------------------------------------------------------------
 * File name: Main.java
 * Project name: FinalGameOfUr
 * ---------------------------------------------------------------------------
 * Creator's name and email: Russ Stipelcovich, stipelcovich@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 28, 2019
 * ---------------------------------------------------------------------------
 */

package GOUClassFiles;

//import java.util.ArrayList;

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Nov 28, 2019
 * <hr>
 * @author Russ Stipelcovich
 */



///** This is the main method. The programm starts here.
// * @param args unused
// */
//public static void main(String args[]){
//    new Main(new Human(0), new Human(1), new ConsoleOutput(), 0);
//    System.out.println("Russ");
//    
//    
//}


public class Main
{

	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Nov 28, 2019
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		int player1 = 1;
	    
	    int player2 = 2;
		
		
		UrGameBoard gameBoard;
		
		gameBoard = new UrGameBoard(player1, player2);
		
		
		System.out.println(gameBoard.toString());
	}
}
		