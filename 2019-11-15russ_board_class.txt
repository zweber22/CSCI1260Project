//russ board class

//test

/**
*Group Names
*Zachary Weber
*Ramiro Rodriguez
*Russ Stipelcovich
*
*Project Description
*
*Our group is going to be making a board game heavily based on the 5000 year old game, The Royal Game of Ur.
*
*•	The game will launch and the user will be presented with two options, to either start a new game or to quit, which will close the applicaiton. Once the user clicks on new game, the user will see the game board with a row of seven, round white pieces to the top and seven, round black pieces to the bottom of the board. The user will also see a menu bar at the top of the window, with different options for the user to select, such as a “Rules” button. Below the board the user will see a dice roller as well as a button to pass their turn to the opponent either at the end of their turn, or if they cannot move any pieces with the number they rolled.
*•	The user will always go first at the start of the game
*•	The goal of the game is to race the other player to get all your pieces off the board before they get all of theirs off the board
*•	To move, the player will roll four dice, each with four sides. Each dice only has one number on it, the number one. The max number a user can get from a roll is a Four.
*•	Once the player has rolled, they can click on their piece to see if they can move their piece. If they can move the piece, a red circle will appear on the board where the piece can move based on the number that they rolled. If there is no option available, a message will apear telling the user that there is no movement option and to pass their turn. 
*•	The pieces will move in a elliptical shape around the board (see picture below). The first four tiles as well as the last two tiles that the user will move their pieces on are considered a “safe” space. The opponent cannot enter those tiles and vice versa. All the other tiles that run through the middle of the board are a “combat” zone.
*•	If the user rolls a number that would land their piece on a tile that the opponent currently occupies and they choose to move their piece to that tile, the opponents piece will be knocked off the board and will be forced to restart from the beginning. The users piece will then occupy the tile that the opponent was knocked off of.
*•	There will be around five (subject to change between now and the final product) special tiles that the user can land on. These tiles will enable them to roll again and either move the same piece or move a completely different piece. While four of these tiles are in the “safe” space for each player, one of them is in the middle of the board and can be occupied by either user. The tile in the middle also serves as another “safe” space for the players. Pieces that stay on this tile cannot be knocked off the board by an opponents piece as long as the piece stays on that tile.
*•	To get a piece off of the board, the user must roll the exact number of moves that it would take to move the piece off the board. For example, if the user has a piece one tile away from the end of the board, the user MUST roll a one to get that piece off of the board
*•	Once a player gets all their pieces off of the board,  a window will open with a message that will be displayed. The message will either read “You Win” or “You Lose” depending on whether or not the user won or lost. After a brief pause, the user will be presented with the option to either play again, which will start a new game, or to quit, which will close the application.
*
*Picture of the game board 
*The blue area represents the “safe” spaces. The green area represents the “combat” area.
*/



/**
 *  This UrGameBoard class (Model in the MVC pattern) is the primary class of the "Game of Ur" application. 
 *  "Game of Ur" is a very simple, GUI based 2-Player board game.  One to Two players 
 *  can play the board game agains each other.  And, one player can also play against the
 *  a computer AI.
 * 
 *  To play the Game of Ur, create an instance of this UrGameBoard and call the "Start"
 *  method.
 * 
 *  This main class creates and initialises the game board, sets up the players, and 
 *  initialiezes the first Turn and Dice Roll.
 *
 *
 *
 * @assignment:  CSCI1260-201 Final Project Due 2019.12.02
 * @authors  Zach Weber, Ramiro Rodriguez, Russ Stipelcovich
 * @version 2019.11.15
 */

public class UrGameBoard 
{
    private ArrayList<GameBoard> gameBoard;
	private Players player1;
    private Players player2;
	private GameBoard space1;  //set up just 4 spaces initially; actual game will have 20 spaces.
	private GameBoard space2;
	private GameBoard space3;
	private GameBoard space4;
    private String message;
    /**
     * Default Constructor.  Create the GameModel and initialise two players.
     */
    public UrGameBoard() 
    {
        this.gameBoard = new ArrayList();
		this.player1 = player1;
		this.player2 = player2;
		createGameBoard();
        createPlayer1();
		
    }

    /**
     * Initialize the gameBoard spaces
     */
    private void createGameBoard(ArrayList<GameBoard> gameBoard)
    {
        
        // create the board spaces - 4 spaces initially.
        gameBoard.add(space1);
		gameBoard.add(space2);
		gameBoard.add(space3);
		gameBoard.add(space4);
		
        
        // initialise the reference of the View class.
        
		public void registerView(View v)
				
		{
		
		this.v = v;  //View will be a separate class that is updated after each turn.
		
		}

    //setters and getters
	
	public int getPlayer1()
	
	{
		return player1;
	
	}
	
	public int getPlayer2()
	
	{
		return player2;
	
	}
	
	
	public void setPlayer1(int player1)
	
	{
		this.player1 = player1;
	
	}
	
	public void setPlayer2()
	
	{
		this.player2 = player2;
		
	
	}
	
	
	public ArrayList<GameBoard> getGameBoard()
	
	{
		return gameBoard;
	
	}
	
	public void setGameBoard()
	
	{
	
	this.gameBoard = gameBoard;
	
	}
	
	
	public String getMessage()
	
	{
		return message;
	
	}
	
	
	
	
	public void setMessage(String message)
	
	{
		this.message = message;
	
	}
	
	
	
	
	/**
     *  Function to update the board model.  Main play routine.  Loops until end of play.
     */
    public void playMove() 
    {            
        printWelcome();  //This will become a JPanel of some sort

        // Enter the main Turn loop.  Here we repeatedly take Turn and
        // execute them until the game is over.
                
        boolean finished = false;  //Method to be coded to see if there is a winner or end
        while (! finished) {
            Turn turn = Turn.take.turn(); //Method to be coded 
            finished = Turn.gameOver(); //Method to be coded 
			updateGameBoardView();//Method to be coded for updating View class.
			printWecome();  //Next Player's turn
        }
        System.out.println("Thank you for playing the Game of Ur.  Good bye.");
    }

    /**
     * Print out the start of turn message for the player.
     */
    private void printWelcome() //This will become JPanel of some sort
    {
        System.out.println();
        System.out.println("Welcome to the Game of Ur!");
        System.out.println("Game of Ur is an very old 2-Player Board Game, much like Backgammon.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        System.out.println("You are playing the 2-Player Game" + player1.getName()) "\n"
			+ player2.getName();
        
        
    }

    /**
     * Given a roll of the dice, process (that is: execute) the Move.
     * @param player1 or player2 turn.
     * @return Move completed (true or false).
     */
    private boolean nextRoll(Turn nextTurn) 
    {
        boolean moveComplete = false;

        if(nextTurn.isReadyToRoll()) {
            System.out.println("Player rolls" + dice.getCount();");
            return false;
        }

        String whatIsNextTurn = Turn.getwhatIsNextTurn();
        if ()) {
            ();
        }
        else if ()) {
            ??();
        }
        else if () {
            ?? = quit();
        }

        return nextRoll;
    }

    // implementations of player moves:

    /**
     * Print out the moves available to player1 or player2.
     *  
     * c
     */
    private void printAvailableMoves() //This will be a JPanel of some sort.
    {
        System.out.println("");
        System.out.println("");
        System.out.println();
        System.out.println("");
        System.out.println("");
    }

    /** 
     * 
     * 
     */
    private void moveNotAvailable(Command command) 
    {
        if() {
        
           
        }
    }

    /** 
     * "Quit" was entered. Close and/or save the game board
     * and player positions.
     * @return true, if this command quits the game, or saves the game, false otherwise.
     */
    private boolean quit(GameBoard gameOver) 
    {
        if(())
		{
            System.out.println("");
            return false;
        }
        else if
		{
            return true;  // signal that we want to quit
        }
		
		else
		{
		
		resetModel() // reset board to begin a new game
		
		}
		
		
    }
}
