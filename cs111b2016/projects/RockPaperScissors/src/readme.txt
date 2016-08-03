For this project, create a Rock, Paper, Scissors (RPS) game that allows a user to play RPS against the computer. If you’re not familiar with RPS, check out the Wikipedia page: http://en.wikipedia.org/wiki/Rock-paper-scissors

The game works this way:

In a single round:
The user clicks a button to make their move (rock, paper, or scissors).
The program randomly generates a move for the computer.
The moves are displayed as images.
The program determines and displays the outcome of this one round.
The user can play as many rounds as they want.
The program keeps track of and displays the number of computer wins, user wins, and ties across all rounds.
Part 1: The RPS Game (50 points)

Write a class (RPSGame) that represents the game.
This class only represents the game.
This class does not interact with the user at all.
The RPSGame object is described by three characteristics. These are the instance data variables:
number of computer wins
number of user wins
number of ties
Include appropriate getters and setters.
Include constants to represent the possible moves (rock, paper, or scissors) and the possible outcomes of a single round (user win, computer win, or tie).
Use these constants to make your code more readable.
For example, if you are using ints to store the moves, it's more clear to test whether userMove==ROCK than userMove==1.
You can decide what type of data to use for the constants (String, int, or something else).
Write a generateComputerPlay method that generates a random move by the computer.
Write a findWinner method that takes in two moves as parameters (the user move and the computer move) and determines the outcome (user wins, computer wins, or tie).
Determining the winner will require you to compare a lot of possible match-ups through a series of nested conditionals.
The method should update the instance data (number of computer wins, number of user wins, and number of ties) depending on the outcome.
Part 2: The GUI (50 points)

Write the GUI program to interact with the user.
This class will create an object of type RPSGame and invoke the methods from that class to run the game.
The constructor sets up the display and create the instance of RPSGame.
Because I don’t want you to spend the majority of your time thinking through the layout, I have provided a shell file you can use as a starting point.
You are not required to use this- if you want to start from scratch, you are welcome to do so. You are also welcome to make changes to the shell.
Your code goes inside the listener class.
The listener classes responds to the user selecting a move, invokes the appropriate methods in the RPS game class, and then updates the display.
Do not write all of the code inside the single listener class method. Write helper methods that are invoked from the listener class to break up and organize the code.
Here is some pseudocode for the listener class. You are not required to follow this algorithm.
get the move from the user by determining which button was clicked

update the display of the user’s move

generate a move by the computer by invoking a method on the RPSGame object

update the display of the computer’s move

determine the outcome (the winner) by invoking a method on the RPS object

update the display of the outcome

get the updated game stats (number of computer wins, number of user wins, and number of ties) by invoking methods on the RPS object

update the display of the outcome

You can use my images or use your own.
Part of this assignment is making sure that each class handles the appropriate tasks.
The RPSGame class should only handle the game- it shouldn't have any interaction with the user.
The RPSGUI class should only interact with the user- it doesn't really know how to play the game at all.
The GUI only knows how to get info from the user, send that info to the game, get info back from the game, and display that info to the user.
Make sure you preserve this object-oriented idea throughout your program!
Extra Credit A- Betting (15 points)

Add support for betting.
In RPSGame:
Add instance data to represent the amount the user is betting (the same amount on each match) and the user’s balance of money. Write appropriate getters and setters for these instance data.
In the findWinner method, when the number of wins/losses is updated, also update the user’s balance by adding or subtracting their bet amount.
In the GUI program:
Use the JOptionPane class to ask the user about betting prior to the game starting. This code should go inside the main method.
Use the JOptionPane.showConfirmDialog method to determine whether the user wants to bet.
If the user wants to bet, use the JOptionPane.showInputDialog method to find out how much the user wants to bet.
Change the RPSGUIGame constructor so that it takes one parameter: the bet amount.
Create a new JLabel to display the user’s balance. I recommend adding the label to the statusPanel. You can choose another place if you want.
If the user is betting, when the display of the stats is updated, update the display of the balance.
If the user is not betting, no money information should be displayed during the game.
Extra Credit B- Text-Based Program (15 points)

Write a text-based driver program that allows the user to play through the console (instead of through a GUI).
Use only text input and output.
Use the same RPSGame class that you used with the GUI- do not have a second, different RPSGame class.
Here is some pseudocode for your main method. You are not required to follow this algorithm:
create an instance of the RPSGame

while the user wants to keep playing:

read in the move from the user

generate a move by the computer by invoking a method on the RPSGame object

determine the outcome (the winner) by invoking a method on the RPS object

get the updated game stats (number of computer wins, number of user wins, and number of ties) by invoking methods on the RPS object

print out the outcome and game stats to the user

find out if the user wants to keep playing

Notes and Submission

For full credit, follow good principles of programming and object-oriented design.
Use comments to provide a brief explanations where appropriate.
You can complete only Extra Credit A, only Extra Credit B, or both.
If completing both, your text-based program may or may not support betting- it's up to you.
I have provided an executable jar sample file.
You can download this file and then double-click on it to run the program.
Note: You must have the image files in the same folder as the JAR file in order for them to be displayed.
To run the sample text-based version, use the command: java -jar RPSConsole.jar
To submit your program, zip all .java files and the images files (even if you are using my provided images) together and upload the zip file.
If submitting as a group, submit one assignment only through one group member's Insight account. Put the names of all group members in Java comments at the top of each Java file.