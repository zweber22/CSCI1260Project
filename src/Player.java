/**
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: FinalGameOfUr
 * ---------------------------------------------------------------------------
 * Creator's name and email: Russ Stipelcovich, stipelcovich@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 27, 2019
 * ---------------------------------------------------------------------------
 */

package package1;

import java.util.ArrayList;


/**
 * CSCI 1260 Final Project - Game of Ur 2-Player Board Game with GUI Interface
 *
 * Team Zach:  Zach Weber, Ramiro Rodriguez, and Russ Stipelcovich
 * 
 * 
 * Player class was written by Russ and is used by the UrGameBoard to create
 * 2 players, player1 and player2. Each player in turn will be associated with
 * 7 pieces (Piece object with pieceId number), a playerPieces ArrayList, and a
 * playerFinishedPiece ArrayList for keeping track when the player wins the game.
 * The pieceId, in turn, will be associated with the tileId as it moves on to the
 * game board, around the game board, and, ultimately, off the game board.
 *
 *
 * <hr>
 * Date created: Nov 27, 2019
 * <hr>
 * @author Russ Stipelcovich
 */

public class Player
{
	//player ID
	
    private int playerId;

    private int pieceId;
    
    
    //list of player piece objects that are assigned to a player.
    
    private ArrayList<Piece> playerPieces;

    
    
    //list of player object pieceIds that did not reach the finish line
    //(added to finishedPieces ArrayList) yet.
    
    private ArrayList<Piece> finishedPlayerPieces;
    
    
    
   /** Constructor - Parameterized:  creates a player object
    * 
    *
    * Date created: Nov 27, 2019
    *
    *@param playerId:  Player ID
    */

    public Player(int playerId)
	
    {
       this.playerId = playerId;
   
       playerPieces = new ArrayList<Piece>();
       
       
   	// every player starts with 7 piecesIds
   
	   	for (int i = 1; i < 8; i++)
	   	{
	   		pieceId = i;
	   		playerPieces.add(new Piece(pieceId, this.playerId));
	   		System.out.println("");
	   	}
    }
    
    //End of Constructor
    
    
   		
   	/** This method adds a Piece to playerPieces ArrayList (used when player is knocked off the board
   	 * by the otherPlayer).
   	 * 
   	 * 
   	 * Date created: Nov 27, 2019
   	 * 
     * @param playerId int that should be added to the playPieces ArrayList.
     */
    
   	public void addPiece(int playerId)
   	{
   		playerPieces.add(new Piece(pieceId, this.playerId));
   	}

   	
	/** This method removes a Piece from playerPieces ArrayList (used when goal
	 *  is reached).
	 *  
	 *  
	 *  Date created: Nov 27, 2019
	 *  
	 * @param playerID int that should be removed from the playPieces ArrayList.
	 */
	    
	public void removePiece(int playerId)
	{
		playerPieces.remove(this.playerId);
	} 	
		
    
    /**This method is called every time the player can move a pieceId.
     * 
     * 
     * Date created: Nov 27, 2019
     * 
     * @param board UrGameBoard
     * @param otherPlayerPieceId:  Pieces that are assigned to the other player.
     * @param diceRoll:  diceRoll result.
     * @return Piece that should be moved this turn.
     */
   
	public Piece playerTurn(Tile[] UrGameBoard, ArrayList<Piece> otherPlayerPieces, int dice)
	{
       
		while(true)
		{
           System.out.print("Enter Valid PieceId ( ");
           
           for(Piece p : playerPieces)
           {
               System.out.print("("+p.getPieceId()+") ");
           }
           
           System.out.print("):\n");
           
           int pieceId = 1;

           for(Piece p : playerPieces)
           {
               if(pieceId == p.getPieceId())
               {
                   return p;
               }
           }
        }
     }


	/** This method adds a piece from the player to the finishedPlayerPiecs when
	 *  the finished line is reached.
	 *  
	 *  
	 *  Date created: Nov 27, 2019
	 *  
     * @param piece Piece that should be removed and added to finishedPieces ArrayList.
     */
    
	public void addToFinishedPlayerPieces(Piece pieceId)
    {
    	finishedPlayerPieces.add(pieceId);
    }


    /** This method returns the players playerId.
     * 
     * 
     * Date created: Nov 27, 2019
     * 
     * @return Player playerId
     */
    
	public int getPlayerId()
	{
		return playerId;
	}
    

    /** This method returns the pieces list for this playerId
     * 
     * 
     * Date created: Nov 27, 2019
     * 
     * @return playerPieces<Piece>:  List of playPieces that have not reached
     * the finish line yet.
     */
    
    public ArrayList<Piece> getPlayerPieces()
    {
    	return playerPieces;
    }
	
 
//    public piecesOnTile assignPlayerPieceIdToTileId(Tile tileId, Piece pieceId)
//    {
//    	this.pieceId = playerPieces.get(0).pieceId;
//    	return pieceOnTile(this.pieceId);
//    }
    
    
    /**  The toString() method is for diagnostic purposes during checking.
	 * 
	 * 
	 * Date created: Nov 27, 2019
	 * 
	 * @return isPrivate
	 */
    
    public String toString()
	  {
	    return "PlayerId: " + getPlayerId() + ";\n Player Pieces: " +
	    				getPlayerPieces();
	  }
	
}
