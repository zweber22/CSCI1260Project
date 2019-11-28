/**
 * ---------------------------------------------------------------------------
 * File name: Piece.java
 * Project name: FinalGameOfUr
 * ---------------------------------------------------------------------------
 * Creator's name and email: Russ Stipelcovich, stipelcovich@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 27, 2019
 * ---------------------------------------------------------------------------
 */

package GOUClassFiles;


/**
 * CSCI 1260 Final Project - Game of Ur 2-Player Board Game with GUI Interface
 *
 * Team Zach:  Zach Weber, Ramiro Rodriguez, and Russ Stipelcovich
 * 
 * Piece class is used to create 7 pieces for player 1 and 7 pieces for player 2 for
 * assignment and movement from TileId to TileID to an ArrayList of player finishedPieces a game board.
 *
 * <hr>
 * Date created: Nov 27, 2019
 * <hr>
 * @author Russ Stipelcovich
 */
public class Piece
{

/** Piece ID pieceID can be one of 7 pieces, 7 piece objecs for each player.
 * 
 *  
 */
    
	private final int pieceId;

    
	/** Each Piece object is assigned to the player.
	 *  
	 */
    
	private final int player;

    
     /** Constructor: Parameterized:  Initializes a piece
     * @param pieceId:  Piece ID
     * @param player Player this piece belongs to.
     */
    
	
	public Piece(int pieceId, int player)
	{
    	this.pieceId = pieceId;
        this.player = player;
        }


    /** This method returns the pieceId object along with the player it has been assigned to.
     * @return Piece:  pieceId
     */

        public int getPieceId()
	{
		return pieceId;
	}

   

    /** This method returns the player this piece belongs to.
     * @return The Player that this token belongs to.
     */
    
	public int getPlayer()
	{
		return player;
	}
}
