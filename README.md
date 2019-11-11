# CSCI1260Project - The Royal Game of Ur

![image](https://user-images.githubusercontent.com/50677289/68560332-ae630680-040e-11ea-84c0-c0090c555173.png)

## History 
"The Royal Game of Ur, also known as the Game of Twenty Squares or simply the Game of Ur, is a two-player strategy race board game that was first played in ancient Mesopotamia during the early third millennium BC. The game was popular across the Middle East among people of all social strata and boards for playing it have been found at locations as far away from Mesopotamia as Crete and Sri Lanka. The Game of Ur received its name because it was first rediscovered by the English archaeologist Sir Leonard Woolley during his excavations of the Royal Cemetery at Ur between 1922 and 1934. Copies of the game have since been found by other archaeologists across the Middle East."
(https://en.wikipedia.org/wiki/Royal_Game_of_Ur, 11.10.2019)

## Rules
The Royal Game of Ur is played with two sets of seven, round tokens or peices, four tetrahedral dice, and is played on a board consisting of 20 tiles.
  
Each player gets seven tokens. Seven white pieces and seven black pieces. Normally the player with the white pieces would go first, but for the purposes of this project (since it will only be against ai), the player will go first

The Game is played with four tetrahedral dice. Each dice has two white and two black corners. The dice result is the sum of all white corners facing upwards. Possible results are:
- 0 with likelihood 1/16
- 1 with likelihood 4/16
- 2 with likelihood 6/16
- 3 with likelihood 4/16
- 4 with likelihood 1/16

(For the pruposes of this project, unless we can do it before the deadline, we will simply implement a basic dice roller with the same probabilities for the outcomes instead)

If the number the player rolls will not allow them to move any of their peices, that turn is passed on to the ai and vice versa.

**Board**  
The board has 20 tiles. There are six tiles for both players on each side of the board that are considered "safe" zones (represented by the blue area) and eight shared tiles down the middle of the board that are the "combat" zone (represented by the green area). 5 of the tiles are special tiles that allow the user to roll again. If your token lands on one of them you can roll the dice again. The layout can be seen here:
![image](https://user-images.githubusercontent.com/50677289/68560412-e9fdd080-040e-11ea-93ee-a39fde062ab7.png)

The special tile in the center of the board is also considered a "safe" zone. Any peice on that tile cannot be taken off the board. If you land on the same tile as your opponent, your opponents peice gets taken from the board and has to start back at the beginning.

To get a tile off the board, the user must roll the exact number it would take to get off the board. For exmple, if a players peice has made the trip around the board and is now on the very last tile, the player must roll a one to get the peice off the board. 

Whoever gets all their peices of of the board first wins the game.
