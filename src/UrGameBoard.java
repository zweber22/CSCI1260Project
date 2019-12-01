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

package package1;


import javax.swing.*;

import java.awt.*;

/**
 * CSCI 1260 Final Project - Game of Ur 2-Player Board Game with GUI Interface
 *
 * Team Zach:  Zach Weber, Ramiro Rodriguez, and Russ Stipelcovich
 * 
 * The UrGameBoard class was written by Russ and is used to create the game board of tiles.
 * The class also builds a JPanel of JButtons that represents the GUI interface to the UI class.
 *  
 * <hr>
 * Date created: Nov 27, 2019
 * <hr>
 * @author Russ Stipelcovich
 */


public class UrGameBoard extends JFrame

{
	//This is the game board. it manages all tiles.
		
    private Tile[] gameBoard;

    
    //ID of players in the game.
        
    Player player1;
    
    Player player2;
      
    
    //ID of player whose turn it currently is.
    
    private int currentPlayer;
   
    
    //ID of other player whose turn will be next.
    
    private int otherPlayer;

    
    //This code is added because either JFrame or the superclass/super-interfaces of
    //JFrame implement the Serializable interface.
    
	private static final long serialVersionUID = 1L;


	private final int WINDOW_WIDTH = 400;   // Window width
	private final int WINDOW_HEIGHT = 200;  // Window height
	
	
    protected static JPanel board;

		
	/**
	 * Constructor - Parameterized to initialize Players and display Board Tiles.     
	 * The constructor of UrGameBoard manages the game setup and state. It initializes
	 * the game board, the players, pieces, and the tiles.  It also builds a JPanel of
	 * JButtons that represents the GUI interface to the UI class.
	 *
	 * 
	 * Date created: Nov 29, 2019 
	 *
	 * 
	 * @param player1
	 * @param player2
	 */
	
	public UrGameBoard(int player1, int player2)
    {
    	//Setup Players
    
		this.player1 = new Player(1);
	    
	    this.player2 = new Player(2);
 
	    
        //Setup Game Board and create board tiles.
        
	    gameBoard = new Tile[14];
	    
	    for(int i = 0; i < (gameBoard.length); i++)
	    {
	        // tiles 4, 8 and 13 are double roll tiles, tiles 1-4 and 13-14 are private.
	    	
	        gameBoard[i] = new Tile(i, ((i==3)||(i==7)||(i==12)), (i<=3||i>=13));
	      

	        //The System.out.println method is for diagnostic purposes during checking.
	        
	        System.out.println(gameBoard[i]);
	    }      

	    
	        // Builds a JPanel of JButtons that represents the GUI interface to the UI class.
	    
	        board = createAndShowBoard();

	        
	        //The System.out.println method is for diagnostic purposes during checking.
	    
	        System.out.println(player1);
		
		    System.out.println(player2);
    }
	
			//End of the Constructor.
	
	

	/** This method creates the JPanel board JButtons that represent the 
	 * tiles; it interfaces with the UI class.
   	 * 
   	 * 
   	 * Date created: Nov 27, 2019
   	 * 
     * @param playerId int that should be added to the playPieces ArrayList.
     */
	 private JPanel createAndShowBoard()
	 {
	       // Set the title bar text.
		 
	       setTitle("Game of Ur Board");

	       
	       // Set the size of the window.
	         
	       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	       
	       // Specify an action for the close button.
	      
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	       
	       // Add a GridLayout manager to the content pane.
	      
	       setLayout(new GridLayout(2, 7));

	       
	       // Create 14 buttons.
	       
	       JButton button1 = new JButton("Tile 1");
	       JButton button2 = new JButton("Tile 2");
	       JButton button3 = new JButton("Tile 3");
	       JButton button4 = new JButton("Tile 4");
	       JButton button5 = new JButton("Tile 5");
	       JButton button6 = new JButton("Tile 6");
	       JButton button7 = new JButton("Tile 7");
	       JButton button8 = new JButton("Tile 8");
	       JButton button9 = new JButton("Tile 9");
	       JButton button10 = new JButton("Tile 10");
	       JButton button11 = new JButton("Tile 11");
	       JButton button12 = new JButton("Tile 12");
	       JButton button13 = new JButton("Tile 13");
	       JButton button14 = new JButton("Tile 14");

	       
	       // Add the six buttons to the content pane.
	       
	       add(button1);  // Goes into row 1, column 1
	       add(button2);  // Goes into row 1, column 2
	       add(button3);  // Goes into row 1, column 3
	       add(button4);  // Goes into row 1, column 4
	       add(button5);  // Goes into row 1, column 5
	       add(button6);  // Goes into row 1, column 6
	       add(button7);  // Goes into row 1, column 7
	       add(button8);  // Goes into row 2, column 1
	       add(button9);  // Goes into row 2, column 2
	       add(button10);  // Goes into row 2, column 3
	       add(button11);  // Goes into row 2, column 4
	       add(button12);  // Goes into row 2, column 5
	       add(button13);  // Goes into row 2, column 6
	       add(button14);  // Goes into row 2, column 7

	       
	       // Display the window.
	       
	       setVisible(true);
	      
	       return board;
	 }
	
}
