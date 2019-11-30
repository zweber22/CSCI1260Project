/**
 * ---------------------------------------------------------------------------
 * File name: PieceMove.java
 * Project name: FinalGameOfUr
 * ---------------------------------------------------------------------------
 * Creator's name and email: Russ Stipelcovich, stipelcovich@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 29, 2019
 * ---------------------------------------------------------------------------
 */

package GOUClassFiles;

import java.util.ArrayList;

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Nov 29, 2019
 * <hr>
 * @author Russ Stipelcovich
 */
public class PieceMove
{

	
	Player currentPlayer;
    
	Player otherPlayer;
	
	Tile gameBoard;
	
	ArrayList<Piece> playerPieces;
	
	int tileId;
	
	
    /** This method moves piece a piece if possible
     * @param player Player whose turn it is
     * @param piece Piece that should be moved
     * @param dice Number of fields to move
     * @return true if move is successful, false otherwise
     */
    private boolean move(Player currentPlayer, Piece piece, int dice)
    {
        //Don't move if dice is zero
    
    	if(dice == 0)
    	{
    		return true;
    	}

        //Don't move if there are no vaild moves
        
    	if(!doValidMovesExist(gameBoard, playerPieces, dice))
    	{
    		return true;
    	}

        
        if(currentPlayer.getPlayerId() != piece.getPlayerId())
        	
        	return false;

        //check if move is valid
        
        if(!isValidMove(gameBoard, piece, dice))
        {
        	return false;
        }

        //test if tile reached the end
        
        if(piece.getTileId()!=null && piece.getTileId().getTileId()+dice==14)
        {
            piece.getTileId().removePiece(piece);
            
            //finishedPieces[player.getTileId()].add(piece);
            
            //player.removePiece(piece);
            
            return true;
        }

        //calculate new tile ID
        
        Tile newTile;
        
        if(piece.getTileId() == null)
        {  
        	//If piece is not on board yet
        	
            newTile = gameBoard[dice-1];
            
        }
        
        else
        {     //If piece is already on board
        	
            newTile = gameBoard[piece.getTileId().getID() + dice];
        }

        //Change active player back if you land on a double roll
        
        if(newTile.isRollAgain())
        {
            currentPlayer = player.getID();
        }

        //actually move piece
        
        if(piece.getTileId()!=null)
        {
        	piece.getTileId().removePiece(piece);
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
    
    public static boolean isValidMove(Tile[] gameBoard, Piece piece, int dice)
    {
        //move is always valid if dice is zero*/
    	
        if(dice == 0)
        { 
        	return true;
        	}

        //calculate new tile ID
        
        int newTileID;
        
        //test if piece is not on board yet
        
        if(piece.getTileId()==null)
        {
            newTileID = dice-1;
        }
        
        else
        {
            newTileID = piece.getTileId().getTileId() + dice;
        }

        //test if player reached the goal
        
        if(newTileID == 14)
        {
        	return true;
        }

        //test if player moved out of board area
        
        else if(newTileID > 14)
        {
        	return false;
        }

        //find new Tile
        
        Tile newTile = gameBoard[newTileID];

        //test if tile is blocked by own piece
        
        if(newTile.isOccupiedByOwn(piece.getPlayerId()))
        {
        	return false;
        }

        //test if other player is on safespot
        
        if(!newTile.isPrivate() && newTile.isRollAgain() &&
        				newTile.isOccupiedByOtherPlayerId(piece.getPlayerId()))
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
     * @return true if valid turns exist, false otherwise
     */
    
     public static boolean doValidMovesExist(Tile[] gameBoard, ArrayList<Piece> playerPieces, int dice)
     {
         for(Piece piece : playerPieces)
         {
             if(isValidMove(gameBoard, piece, dice))
            	 
            	 return true;
         }

         return false;
     }
	
	
	
	
}
