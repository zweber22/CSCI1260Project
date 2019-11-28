/**
 * ---------------------------------------------------------------------------
 * File name: UrGameBoard.java
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
 * UrGameBoard class is Model of the game board that displays current state of the game,
 * status of board spaces with respect to tileIds, and position on the board of player's pieceIds.
 * The game board Model is also used to update the current view of the GUI.
 * The game board model also interfaces with the PlayerMove, Turn, and RollDice classes.
 *
 * <hr>
 * Date created: Nov 27, 2019
 * <hr>
 * @author Russ Stipelcovich
 */
public class UrGameBoard
{

	
    /** This is the game board. it manages all tiles
     * @see Tile */
    
	private Tile[] gameBoard;

    //players
    /** Create variable for two new Player objects
     */
	
    private Player player1;
    
    private Player player2;
    
    
    /** ArrayList that contain each players pieces
     */
    
    private ArrayList<Piece> playerPieces;
    
    
    
    /** Array of lists that contain each players finished pieces*/
    
    private ArrayList<Piece> finishedPlayerPieces;
    
    
    
    /** ID of player whose turn it currently is*/
    
    private Player currentPlayer;
    
    
/** ID of other player whose turn is waiting
 */
    
    private Player otherPlayer;

    
    //Update the GUI View
    /** This is the View interface.
     * @see Game class
     * 
     */
    
    //private Game view;

     

    /**The constructor of UrGameBoard manages the game setup and state. It initializes the game board,
     * the players, pieces, and the tiles.
     * @param player1 First player
     * @param player2 Second player
     * @param view Updates the View GUI
     * 
     *
     * 
     */
    
    public UrGameBoard(Player player1, Player player2)
    {
        
    	//Setup Players
        
        this.player1 = player1;
        
        this.player2 = player2;
        
    	
    	//Setup Game Board
        //create board tiles
        
        gameBoard = new Tile[14];
        
        for(int i = 1; i <= gameBoard.length; i++)
        {
            //; tiles 4, 8 and 13 are double roll tiles, tiles 1-4 and 13-14 are private.
        	
            gameBoard[i] = new Tile(i, ((i==4)||(i==8)||(i==13)), (i<=4||i>=13));
        }
            
        //print board
        //update.printBoard(gameBoard,playerArray);

        //Start loop
       
    }

    
	
	/**This method takes care of the gameloop. It runs in an infinite while loop until the game is won.
	 * It calls turn() for the current active player.
	 */
    public void run()
    {
        gameloop:
        while(true)
        {
            //Player turns
            //also: test if player has already won
            if(turn(currentPlayer))
            {
            	break gameloop;
            }

            //Output current state of the game
            //update.printBoard(UrGameBoard, playerArray);

                   }
    }

    /** This method takes care of one players turn.
     * It first changes the current player for the next turn,
     * then rolls a dice, then ask what the player wants do do, if there is a possible move
     * and finally makes that move, if possible
     *
     * @param player player current player's turn.
     * @return true if player has won, false otherwise
     */
    
    private boolean turn(Player player){
        
    	        
    	//change currentPlayer (changed back in move() if currentPlayeryou land on a double roll)
        
    	currentPlayer = otherPlayer;

        //roll Dice
        
    	int dice = rollDice();
        
    	//output.print("Dice: "+dice+"\n");

        // move piece if valid move exists
        
    	if(!doValidMovesExsist(gameBoard, currentPlayer, dice))
    	{
    		return false;
    	}

        //move otherwise. throw error if move is not possible
        
    	move(currentPlayer, CurrentPlayer.turn(boardGame, this.currentPlayer.getPieces(), dice), dice);
            //throw new Error("Illegal Move ("+player.getID());


        //check if player has won
        
		
		  if(finishedPlayerPieces.size()==7)
		  {
		  //output.print(player.getName() + " won!\n");
		  return true;
		  }
		  return false;
		 
    }

    /** This method moves pieceId if possible.
     * @param player currentPlayer's turn
     * @param piece Piece that should be moved
     * @param dice Number of Tiles to move
     * @return true if move is successful, false otherwise
     */
    private boolean move(Player player, Piece piece, int dice)
    {
        //Don't move if dice is zero
    	
        if(dice == 0)
        {
        	return true;
        	
        }

        //Don't move if there are no vaild moves
        
        if(!doValidMovesExsist(gameBoard,player,dice))
        {
        	return true;
        	
        }
        

      
        //if(player.getPlayerID() != piece.getPlayer())
        	
        	return false;

        //check if move is valid
        
        //if(!isValidMove(gameBoard,piece,dice))
        {
        	return false;
        	
        }

        //test if tile reached the end
        
        if(piece.getTileId() != null && piece.getTile().getID() + dice == 14)
        {
            piece.getTile().removePiece(piece);
            finishedPlayerPieces.add(piece);
            player.removePiece(piece);
            return true;
        }

        //calculate new tile ID
        
        Tile newTile;
        
        if(piece.getTile() == null)
        {
        	//If piece is not on board yet
        	
            newTile = gameBoard[dice-1];
            
        }
        
        else
        {   
        	//If piece is already on board
        	
            newTile = board[piece.getTile().getID() + dice];
        }

        //Change active player back if you land on a double roll
        
        if(newTile.isRollAgain())
        {
            activePlayer = player.getID();
        }

        //actually move piece
        
        if(piece.getTile()!=null)
        {
        	piece.getTile().removePiece(piece);
        }
        
        newTile.addPiece(piece);

        return true;
    }

    /** This method test if a move is valid
     * @param board game board
     * @param piece piece that should be moved
     * @param dice number of tiles to move
     * @return false if move is invalid
     *          true otherwise
     * */
    
    
    public static boolean isValidMove(Tile[] board, Piece piece, int dice)
   
    {
        //move is always valid if dice is zero*/
    	
        if(dice == 0)
        {
        	return true;
        }

        //calculate new tile ID
        
        int newTileID;
        
        //test if piece is not on board yet
        
        if(piece.getTile()==null)
        {
            newTileID = dice-1;
        }
        
        else
        {
            newTileID = piece.getTile().getID() + dice;
        }

        //test if player reached the goal
        
        if(newTileID == board.length)
        {
        	return true;
        	
        }

        //test if player moved out of board area
        else if(newTileID>board.length)
        {
        	return false;
        	
        }

        //find new Tile
        
        Tile newTile = board[newTileID];

        //test if tile is blocked by own piece
        
        if(newTile.isOccupiedByOwn(piece.getPlayer()))
        
        { 
        	return false;
        	
        }

        //test if other player is on safespot
        
        if(!newTile.isPrivate() && newTile.isRollAgain() && newTile.isOccupiedByOpponent(piece.getPlayer()))
        {
        	return false;
        	
        }

        // return true otherwise*/
        return true;
    }

    
    
    
    /** This method tests if there are valid moves left for a player and a dice result
     * @param board Game board
     * @param player Player whose turn it is
     * @param dice dice result
     * @return true if vaild turns exist, false otherwise
     */
    
     public static boolean doValidMovesExsist(Tile[] board, Player player, int dice)
     
     {
         for(Piece piece:player.pieces)
         
         {
             if(isValidMove(board,piece,dice)) 
            	 
            	 return true;
         }

         	return false;
     }
	
	
	
	
}
