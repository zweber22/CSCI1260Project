/**
 * ---------------------------------------------------------------------------
 * File name: UrGameBoard.java
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

public class UrGameBoard

{
    /** This is the game board. it manages all tiles
     * @see Tile */
	
	
    private Tile[] gameBoard;

    
    /** ID of player whose turn it currently is*/
    
    
    Player player1;
    
    Player player2;
      
    
//    private int currentPlayer;
    
//    private int otherPlayer;
    
	/**
	 * Constructor - Parameterized to initialize Players and display Board Tiles.     
	 * The constructor of UrGameBoard manages the game setup and state. It initializes the game board,
     * the players, pieces, and the tiles.
     * @param player1 First player
     * @param player2 Second player
     *
	 * <hr>
	 * Date created: Nov 29, 2019 
	 *
	 * 
	 * @param player1
	 * @param player2
	 * @param view Updates the View GUI
	 */
	
	public UrGameBoard(int player1, int player2)
    {
    	//Setup Players
    
		this.player1 = new Player(1);
	    
	    this.player2 = new Player(2);
    
    //Setup Game Board
    //create board tiles
        
	    gameBoard = new Tile[14];
	    
	    for(int i = 0; i < (gameBoard.length); i++)
	    {
	        //; tiles 4, 8 and 13 are double roll tiles, tiles 1-4 and 13-14 are private.
	    	
	        gameBoard[i] = new Tile(i, ((i==3)||(i==7)||(i==12)), (i<=3||i>=13));
	      

	        System.out.println(gameBoard[i]);
	    }
	    
	    System.out.println(player1);
		
		System.out.println(player2);
		
//		System.out.println(player1.playerPieces.toString());
//		
//		System.out.println(player2.playerPieces.toString());
		
		System.out.println(gameBoard[0].getPlayerIdPieceId());
    }  

	
//	This method takes care of the gameloop. It runs in an infinite while loop until the game is won.
//	It calls turn() for the currently active player.
//    public void run()
//    {
//        gameloop:
//        while(true)
//        
//        {
//		Player turns
//		also: test if player has already won
        	
//      if(turn(currentPlayer))
//      {
//           break gameloop;
//      }

//		Output current state of the game
//      output.printBoard(board, player);// To be integrated with GUI

 
	
//		turn(activePlayer)
	

}

