/**
 * ---------------------------------------------------------------------------
 * File name: Turn.java
 * Project name: FinalGameOfUr
 * ---------------------------------------------------------------------------
 * Creator's name and email: Russ Stipelcovich, stipelcovich@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 29, 2019
 * ---------------------------------------------------------------------------
 */

package GOUClassFiles;


/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Nov 29, 2019
 * <hr>
 * @author Russ Stipelcovich
 */
public class Turn
{

	private int currentPlayer;
    
	private int otherPlayer;
	
	Tile gameBoard;
	
	
	
	 /** This method takes care of one players turn.
     * It first changes the active player for the next turn,
     * then rolls a dice, then ask what the player wants do do, if there is a possible move
     * and finally makes that move, if possible
     *
     * @param player player whos turn it is;
     * @return true if player has won, false otherwise
     */
    
	private boolean turn(Player currentplayer)
	{
              
        //change active player; change back in move() if you land on a double roll.
        
        currentPlayer = otherPlayer;

        //roll Dice
        
        int dice = ((Math.random()<0.5)?1:0)+((Math.random()<0.5)?1:0)+
            				((Math.random()<0.5)?1:0)+((Math.random()<0.5)?1:0);
       				
        //rollDice();
        
        //output.print("Dice: "+dice+"\n");

        // move token if valid move exists
        
        if(!doValidMovesExsist(gameBoard, currentPlayer, dice))
        {
        	return false;
        }

        //move otherwise. throw error if move is not possible
        
        move(player, player.turn(board, this.player[activePlayer].getTokens(), dice), dice);
            
        //throw new Error("Illegal Move ("+player.getID());


        //check if player has won
        
        if(finishedTokens[player.getID()].size()==7)
        {
            output.print(player.getName() + " won!\n");

           return true;
        }

        return false;
    }
	
	
	
}
