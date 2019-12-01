// ---------------------------------------------------------------------------
// File name: PieceMove
// Project name: FinalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Ramiro Rodriguez, rodriguezr@etsu.edu					
//	Creation Date:	11/27/19		
// Date of Last Modification: 11/29/19		
// ---------------------------------------------------------------------------


/**
 * Class Name: PieceMove <br>
 * Class Purpose: Moves a single game piece a specific amount of spaces
 * based on the numbers that the player rolled on their dice <br>
 *
 * <hr>
 * Date created: 11/27/19 <br>
 * Date last modified: 11/29/19
 * @author Ramiro Rodriguez
 */

public class PieceMove implements Tile
{
		    
	private final int id; 		// Token ID        
	private final int player; 	// Player this token belongs to    
	private Tile tile;			// Tile the token currently is on (null if it is on no tile)
	private int totalMoves;		//sum of numbers rolled by the dice
	private int movesLeft;		//number of spaces a piece can still advance on the board
	private int moveUp;			//moves a piece up by a specific number of spaces 
	
	/**Checks if other player's token is already on this tile
     * @param playerId player is the current player, say player1, who is attempting to move his token on to a tile (not player2)
     * @return true if opponents token occupies this tile, false otherwise
     */
    public boolean isOccupiedByOpponent(int playerId)
	{
        for(Token t:tokens)
		{
            if(t.getPlayer()!=playerId)
			{
                return true;
            }
        }
        return false;
    }
	
	do
	{
		token.moveUp++
		token.movesLeft--;
	}while(movesLeft > 0);
}
