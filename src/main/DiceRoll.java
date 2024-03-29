// ---------------------------------------------------------------------------
// File name: DiceRoll
// Project name: FinalGameOfUr
// ---------------------------------------------------------------------------
// Creator’s name and email: Ramiro Rodriguez, rodriguezr@etsu.edu					
//	Creation Date:	11/27/19		
// Date of Last Modification: 11/29/19		
// ---------------------------------------------------------------------------



/**
 * Class Name: DiceRoll <br>
 * Class Purpose: Rolls all of a single player's dice then returns 
 * a message that informs the user of the number that each die landed on <br>
 *
 * <hr>
 * Date created: 11/27/19 <br>
 * Date last modified: 11/29/19
 * @author Ramiro Rodriguez
 */
 
 public class DiceRoll implements tile
 {
	private int die1;	//1st die of 7
	private int die2;	//2nd die of 7
	private int die3;	//3rd die of 7
	private int die4;	//4th die of 7
	private int die5;	//5th die of 7
	private int die6;	//6th die of 7
	private int die7;	//7th die of 7
	
	private int number1; //number rolled for die 1
	private int number2; //number rolled for die 2
	private int number3; //number rolled for die 3
	private int number4; //number rolled for die 4
	private int number5; //number rolled for die 5
	private int number6; //number rolled for die 6
	private int number7; //number rolled for die 7
	
	
    public static void main(String args[]) 
    { 
        int max = 4; 
        int min = 0; 
        int range = max - min + 1; 
  
        // generates a random number between 0 to 4 for die 1
        for (int i = 0; i < 5; i++)
		{ 
			int rand = (int)(Math.random() * range) + min; 
			number1 == rand;

        } 
		
		 // generates a random number between 0 to 4 for die 2
        for (int i = 0; i < 5; i++)
		{ 
			int rand = (int)(Math.random() * range) + min; 
			number2 == rand;

        } 
		
		 // generates a random number between 0 to 4 for die 3
        for (int i = 0; i < 5; i++)
		{ 
			int rand = (int)(Math.random() * range) + min; 
			number3 == rand;

        } 
		
		 // generates a random number between 0 to 4 for die 4
        for (int i = 0; i < 5; i++)
		{ 
			int rand = (int)(Math.random() * range) + min; 
			number4 == rand;

        } 
		
		 // generates a random number between 0 to 4 for die 5
        for (int i = 0; i < 5; i++)
		{ 
			int rand = (int)(Math.random() * range) + min; 
			number5 == rand;

        } 
		
		 // generates a random number between 0 to 4 for die 6
        for (int i = 0; i < 5; i++)
		{ 
			int rand = (int)(Math.random() * range) + min; 
			number6 == rand;

        } 
		
		 // generates a random number between 0 to 4 for die 7
        for (int i = 0; i < 5; i++)
		{ 
			int rand = (int)(Math.random() * range) + min; 
			number7 == rand;

        } 
		
    }// end main
	
	
 }// end public class DiceRoll
