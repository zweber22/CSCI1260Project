/**
 * ---------------------------------------------------------------------------
 * File name: Tile.java
 * Project name: FinalGameOfUr
 * ---------------------------------------------------------------------------
 * Creator's name and email: Russ Stipelcovich, stipelcovich@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 27, 2019
 * ---------------------------------------------------------------------------
 */

package GOUClassFiles;

import java.util.ArrayList;

/**
 * CSCI 1260 Final Project - Game of Ur 2-Player Board Game with GUI Interface
 *
 * Team Zach:  Zach Weber, Ramiro Rodriguez, and Russ Stipelcovich
 * 
 * Tile class is used to create an array of spaces for a game board.
 * 
 * 
 * 
 * <hr>
 * Date created: Nov 27, 2019
 * <hr>
 * @author Russ Stipelcovich
 */
public class Tile
{

	// The tileId field instance variable (type int) is used to assign the order position of the 14 board spaces.
	// The assigned valued is between 1 and 14.
	
	private int tileId;
	
	
	// The pieces field instance variable ArrayList of type Piece objects holds the list of Pieces on each TileId.
	// TileId 1 - 4 and 13 - 14 spaces (isPrivate = true) can hold a list of two pieces, one from each player.
	// TileId 5 - 12 spaces (isPrivate = false) can hold a list of one Piece at a time.
	
	private ArrayList<Piece> playerIdPieceId;
	
	
	// The rollAgain field instance variable boolean type identifies the TileId spaces 4, 8, 13 as roll again
	// spaces (rollAgain = true), while, for TileId spaces 1 - 3, 5 - 7, 9 - 12, and 14 rollAgain = false.
	
	private boolean rollAgain;
	
	
	// The isPrivate field instance variable boolean type identifies the TileId spaces 1 - 4 and 13 - 14 as isPrivate
	// (isPrivate = true), while, for TileId spaces 5 - 12 isPrivate = false.
	
	
	private boolean isPrivate;


	
	/**
	 * Constructor  - Parameterized to characterize each of the 14 board spaces used in the game.      
	 *
	 * <hr>
	 * Date created: Nov 27, 2019 
	 *
	 * 
	 * @param tileId
	 * @param rollAgain
	 * @param isPrivate
	 */
	public Tile (int tileId, boolean rollAgain, boolean isPrivate)
	{
		
		this.tileId = tileId;
		this.rollAgain = rollAgain;
		this.isPrivate = isPrivate;
		
		playerIdPieceId = new ArrayList<Piece>();
	}

	
	
	
	
	
	
	/**
	 * @return playerIdPieceId
	 */
	public ArrayList <Piece> getPlayerIdPieceId ( )
	{
		return playerIdPieceId;
	}






	
	/**
	 * @param playerIdPieceId the playerIdPieceId to set
	 */
	public void setPlayerIdPieceId (ArrayList <Piece> playerIdPieceId)
	{
		this.playerIdPieceId = playerIdPieceId;
	}






	public void removePiece(Piece piece)

	{
      
		//remove piece from tile
		playerIdPieceId.remove(piece);
        
		//remove tile from piece
        piece.setTileId(null);
    }

    /** This method adds a piece to tile
     * and removes other players piece if there is one
     * (checks if move is possible is done at Main.move())
     *
     * @param piece piece that should be added
     */
    
	
	public void addPiece(Piece piece)
	{
        
		//add piece to tile
		playerIdPieceId.add(piece);
       
	    //add tile to piece
        piece.setTileId(this);
        
		//remove opponents piece if necessary
        if(!isPrivate && !rollAgain){
            for(Piece p : playerIdPieceId)
            {
                if(p.getPlayerId() != piece.getPlayerId())
                {
                    removePiece(p);
                }
            }
        }
    }

    /**This method checks if currentPlayer's own piece is already on this tile
     * @param playerId the currentPlayer's whose piece is on this tile
     * @return true if currentPlayer's piece occupies this tile, false otherwise
     */
    public boolean isOccupiedByOwn(int playerId)
    {
        for(Piece p : playerIdPieceId)
        {
            if(p.getPlayerId() == playerId)
            {
                return true;
            }
        }
        return false;
    }

    /**Checks if the otherplayer's piece is already on this tile.
     * @param playerId currenPlayers piece who is trying to occupy the tile.
     * @return true if otherPlayer's piece occupies this tile, false otherwise
     */
    public boolean isOccupiedByOtherPlayerId(int playerId)
    {
        for(Piece p : playerIdPieceId)
        {
            if(p.getPlayerId() != playerId)
            {
                return true;
            }
        }
        
        return false;
    }

	
	/**  Getter and Setter for tileId returns one of the tileIds and its attributes or properties
	 *  (its space 1 - 14 position, isPrivate:  true or false, rollAgain: true or false
	 *  and the ArrayList of Piece objects on that tileID at the beginning and ending of each turn
	 *   for its space on the game board (UrGameBoard).
	 * @return tileId
	 */
	
	public int getTileId ( )
	{
		return tileId;
	}

	
	/**  Getter for rollAgain:  true or false attribute for one of the TileIds
	 * @return rollAgain
	 */
	public boolean isRollAgain ( )
	{
		return rollAgain;
	}
	

	/**  Getter for isPrivate:  true or false attribute for one of the TileIds
	 * @return isPrivate
	 */
	public boolean isPrivate ( )
	{
		return isPrivate;
	}
	
	
	
	 public String toString()
	  {
	    return "TileId: " + getTileId() + "; rollAgain: " + isRollAgain()
	    + "\n\n  isPrivate:  " + isPrivate + "Player pieces on this tile:  "
	    + playerIdPieceId;
	  }
	 
	
	
}
