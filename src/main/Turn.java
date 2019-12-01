// ---------------------------------------------------------------------------
// File name: Turn
// Project name: FinalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Ramiro Rodriguez, rodriguezr@etsu.edu					
//	Creation Date:	11/27/19		
// Date of Last Modification: 11/29/19		
// ---------------------------------------------------------------------------



/**
 * Class Name: Turn <br>
 * Class Purpose: Establishes the start and end of each user's turn and 
 * notifies the players with a message. <br>
 *
 * <hr>
 * Date created: 11/27/19 <br>
 * Date last modified: 11/29/19
 * @author Ramiro Rodriguez
 */

public class Turn implements DiceRoll
{
	public static void main(String []args)
	{
	private int turnCounter = 0;	//number of turns elapsed
	private Player player1;			//player1 	
	private Player player2; 		//player2
	private int activePlayer;		//shows which player's turn it is
	private int movesLeft;
	
	do
	{
		activePlayer == player1;
	}while(movesLeft > 0)
		
	if(activePlayer != player1)
	{
		activePlayer == player2;
	}
	else
	{
		activePlayer == player1;
	}

	do
	{
		activePlayer == player2;
	}while(movesLeft > 0)

	}//end main
	
}//end public class Turn
