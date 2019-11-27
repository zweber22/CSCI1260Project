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
	// The assigned valued is between 0 and 13.
	
	private int tileId;
	
	// The pieces field instance variable ArrayList of type Piece objects holds the list of Pieces on each TileId.
	// TileId 0 - 3 and 12 - 13 spaces (isPrivate = true) can hold a list of two pieces.
	// TileId 4 - 11 spaces (isPrivate = false) can hold a list of one Piece.
	
	private ArrayList<Piece> pieces;
	
	
	// The rollAgain field instance variable boolean type identifies the TileId spaces 3, 7, 12 as roll again
	// spaces (rollAgain = true), while, for TileId spaces 0 - 2, 4 - 6, 8 - 11, and 13 rollAgain = false.
	
	private boolean rollAgain;
	
	
	// The isPrivate field instance variable boolean type identifies the TileId spaces 0 - 3 and 12 - 13 as isPrivate
	// (isPrivate = true), while, for TileId spaces 4 - 11 isPrivate = false.
	
	
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
		super ( );
		this.tileId = tileId;
		this.rollAgain = rollAgain;
		this.isPrivate = isPrivate;
	}



	
	/**  Getter for TileId returns one of the TileIds and its attributes or properties
	 *  (its space 0 - 13 position, isPrivate:  true or false, and rollAgain: true or false 
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


	
	
	
	
	
	
	
	
	
	
	
	
	
}