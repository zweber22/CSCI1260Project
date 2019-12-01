/**
 * ---------------------------------------------------------------------------
 * File name: UrGameBoard.java - Bare Bones to create JPanel for Zach to hook to.
 * Project name: FinalGameOfUr
 * ---------------------------------------------------------------------------
 * Creator's name and email: Russ Stipelcovich, stipelcovich@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 29, 2019
 * ---------------------------------------------------------------------------
 */

package package1;


import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class

public class UrGameBoard extends JFrame

{
	

	private static final long serialVersionUID = 1L;


	private final int WINDOW_WIDTH = 400;   // Window width
	private final int WINDOW_HEIGHT = 200;  // Window height
	
	
    protected static JPanel board;

	
	public UrGameBoard()
    
	{
		
		      board = createAndShowBoard();
		   
	}

//	public void actionPerformed(ActionEvent e)
//	{
//       
//          	player1Piece1.setEnabled(true);
//            
//	}
   	
	
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
		      add(button4);  // Goes into row 2, column 1
		      add(button5);  // Goes into row 2, column 2
		      add(button6);  // Goes into row 2, column 3
		      add(button7);  // Goes into row 1, column 1
		      add(button8);  // Goes into row 1, column 2
		      add(button9);  // Goes into row 1, column 3
		      add(button10);  // Goes into row 2, column 1
		      add(button11);  // Goes into row 2, column 2
		      add(button12);  // Goes into row 2, column 3
		      add(button13);  // Goes into row 2, column 2
		      add(button14);  // Goes into row 2, column 3

		      // Display the window.
		      setVisible(true);
		      
		      return board;
		}
	    
	 
	 //  Zach the main is here just to test code.  You can delete or comment out
	 //  once you have called and connected to the UrGameBoard class through UI.
	 
	 public static void main(String[] args)
	   {
	      new UrGameBoard();
	   }
	 
}	
