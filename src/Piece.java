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

package package1;


/**
 * CSCI 1260 Final Project - Game of Ur 2-Player Board Game with GUI Interface
 *
 * Team Zach:  Zach Weber, Ramiro Rodriguez, and Russ Stipelcovich
 * 
 * Piece class was written by Russ and is used to create 7 pieces for player
 * 1 and 7 pieces for player 2 for assignment and movement from TileId
 * to TileID to an ArrayList of player finishedPieces a game board.
 *
 * <hr>
 * Date created: Nov 27, 2019
 * <hr>
 * @author Russ Stipelcovich
 */

public class Piece
{
	// Piece ID pieceID can be one of 7 pieces, 7 piece objecs for each player.
  
	private int pieceId;

 
	//Each Piece object is assigned to the player.
    
	private int playerId;

	
	// Tile the piece currently is on (null if it is on no tile).
    
	private Tile tileId;
	

	
	/** Constructor: Parameterized:  Initializes a piece
	 * 
	 * Date created: Nov 27, 2019
	 * 
	 * 
     * @param pieceId:  Piece ID
     * @param player Player this piece belongs to
     */
    
	
	public Piece(int pieceId, int playerId){
    
		this.pieceId = pieceId;
        this.playerId = playerId;
    }
	
	//End of constructor.
	

	
    /** This method returns the tile on which the token currently is
     *  (null if no tile at all).
     *  
     *  Date created: Nov 27, 2019
     *    
     * @return Tile on which the token currently is (null if no tile at all)
     */
  	
	public Tile getTileId()
	{
		return tileId;
	}
	
	
	/** This method sets the tileId that the piece is on.
	 * 
	 * 
	 * Date created: Nov 27, 2019
	 *  
     * @param tile New tile the piece is placed on*/
    
	public void setTileId(Tile tileId)
	{
		this.tileId = tileId;
	}
	
	
	/** This method returns the pieceId object along with the player it has
	 *  been assigned to.
	 *  
	 *  
	 *  Date created: Nov 27, 2019
	 *  *  
     * @return Piece:  pieceId
     */

    public int getPieceId()
	{
		return pieceId;
	}

    
    /** This method returns the player this piece belongs to.
     * 
     * 
     *  Date created: Nov 27, 2019
     *  
     * @return The Player that this piece belongs to.
     */
    
	public int getPlayerId()
	{
		return playerId;
	}

	
	/** Getter for the TileId that the piece is on
	 *  and returns the tileId with its attributes.
	 *  Or, if no piece is on the tile, returns null.
	 *  
	 *  Date created: Nov 27, 2019
	 *  
	 *  
	 * @return tileId
	 */
	
	public int getTileIdThatThePieceIsOn()
	{
		return (tileId == null) ? -1 : tileId.getTileId();
	}

	
	/**  The toString() method is for diagnostic purposes during checking.
	 * 
	 * 
	 * Date created: Nov 27, 2019
	 * 
	 * @return isPrivate
	 */
	
	public String toString()
	  {
	    return "PieceId: " + getPieceId() + "; Player: " + getPlayerId();
	  }

}
