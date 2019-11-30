/**
 * ---------------------------------------------------------------------------
 * File name: RollDice.java
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
public class RollDice
{

	 /** This method rolls 4 binary dice and returns the sum of the values
     * @return: 0 with probability 1/16
     *          1 with probability 4/16
     *          2 with probability 6/16
     *          3 with probability 4/16
     *          4 with probability 1/16
     */
    private static int rollDice()
    {
        return ((Math.random()<0.5)?1:0)+((Math.random()<0.5)?1:0)+
        				((Math.random()<0.5)?1:0)+((Math.random()<0.5)?1:0);
    }
	
	
}
