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

/** Piece ID pieceID can be one of 14 pieces, 7 for player 1 and 7 for player 2.
 * 
 *  
 *  
 *
 */
    
	private final int pieceId;

    
	/** For the 14 pieceIds, 7 are assigned to player 1 and 7 are assigned to player 2.
	 *  This pieceId object belongs to player 1 or player 2.
	 */
    
	private final int player;

    
	/** For each of the 14 pieces (pieceId 0 - 13) it can be on (assigned to) a specific Tile tileId.
	 *  Or, if it is not currently on a specific tileId, then its value is null.
	 *  As the piece reaches the finish line it is added to the finishedPieces ArrayList.
	 */
    
	private Tile tileId;

    
	/** Constructor: Parameterized:  Initializes a piece
     * @param pieceId:  Piece ID
     * @param player Player this token belongs to
     */
    
	
	public Piece(int pieceId, int player){
    
		this.pieceId = pieceId;
        this.player = player;
    }

	
    /** This method returns the game board space tileId on which the pieceId currently is on (null
     *  if no tileId at all)
     * @return Tile tileId
     */
    
	
	public Tile getTileId()
	{
		return tileId;

	}

    /** This method sets the tileId that the pieceId is on
     * @param tile New tileID that the pieceId is placed on,
     */
    
	public void setTileId(Tile tileId)

	{
		this.tileId = tileId;

	}

    /** This method returns the pieceId object along with the player it has been assigned to.
     * @return Piece:  pieceId
     */

    public int getPieceId()
	{
		return pieceId;

	}

    /** This method returns the ID of the tile the token is on
     * @return -1 is token is on no tile, the tile ID otherwise*/
    
	
	public int getTileIdNumber()
	{

		return (tileId == null)? -1 : tileId.getTileId();

	}

    /** This method returns the player this piece belongs to.
     * @return The Player that this token belongs to.
     */
    
	public int getPlayer()

	{

		return player;

	}
}
