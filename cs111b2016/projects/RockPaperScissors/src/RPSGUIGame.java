import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;


public class RPSGUIGame extends JFrame {


	private JButton rockButton, paperButton, scissorsButton;
	private JLabel statusC, statusU, statusT, statusB;
	public ImageIcon rockImage, paperImage, scissorsImage;
	private JLabel compPlay, userPlay;
	private JLabel outcome;

	private RPS game;

	private static double betAmount;


	private static final String BET_ASK = "Would you like to bet?";
	private static final String BET_AMOUNT_PROMPT = "How much would you like to bet?";

	public RPSGUIGame() {

		super("Rock, Paper, Scissors, Go!");
		setSize(450, 300);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(Color.black);
		setResizable(false);

		// create a game object
		// pass bet parameter - Extra credit :D
		game = new RPS( betAmount );


		// Can make those images show. Tried many paths without success. :(
		rockImage = new ImageIcon("rock.jpg");
		paperImage = new ImageIcon("paper.jpg");
		scissorsImage = new ImageIcon("scissors.jpg");

		compPlay = new JLabel();
		compPlay.setVerticalTextPosition(SwingConstants.BOTTOM);
		compPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		compPlay.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		compPlay.setForeground(Color.cyan);
		userPlay = new JLabel();
		userPlay.setVerticalTextPosition(SwingConstants.BOTTOM);
		userPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		userPlay.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		userPlay.setForeground(Color.orange);

		outcome = new JLabel();
		outcome.setHorizontalTextPosition(SwingConstants.CENTER);
		outcome.setForeground(Color.pink);

		JPanel imageOutcomePanel = new JPanel();
		imageOutcomePanel.setBackground(Color.black);
		imageOutcomePanel.setLayout(new BorderLayout());
		imageOutcomePanel.add(compPlay, BorderLayout.WEST);
		imageOutcomePanel.add(userPlay, BorderLayout.EAST);
		imageOutcomePanel.add(outcome, BorderLayout.SOUTH);


		statusC = new JLabel("Computer Wins: " + game.getCWins());
		statusU = new JLabel("User Wins: " + game.getUWins());
		statusT = new JLabel("Ties: " + game.getTies());
		statusB = new JLabel("Balance: " + game.getBalance());
		statusC.setForeground(Color.white);
		statusU.setForeground(Color.white);
		statusT.setForeground(Color.white);
		statusB.setForeground(Color.green);
		JPanel statusPanel = new JPanel();
		statusPanel.setBackground(Color.black);
		statusPanel.add(statusC);
		statusPanel.add(statusU);
		statusPanel.add(statusT);

		// Show balance if bet
		if( game.isWillingToBet() ) {
			statusPanel.add(statusB);
		}

		// the play and status panels are nested in a single panel
		JPanel gamePanel = new JPanel();
		gamePanel.setPreferredSize(new Dimension(350, 350));
		gamePanel.setBackground(Color.DARK_GRAY);
		gamePanel.add(imageOutcomePanel);
		gamePanel.add(statusPanel);

		// creates the buttons and displays them in a control panel;
		// one listener is used for all three buttons
		rockButton = new JButton("Play Rock");
		rockButton.addActionListener(new GameListener());
		paperButton = new JButton("Play Paper");
		paperButton.addActionListener(new GameListener());
		scissorsButton = new JButton("Play Scissors");
		scissorsButton.addActionListener(new GameListener());

		JPanel controlPanel = new JPanel();
		controlPanel.add(rockButton);
		controlPanel.add(paperButton);
		controlPanel.add(scissorsButton);
		controlPanel.setBackground(Color.black);

		// the gaming and control panel are added to the window
		contentPane.add(gamePanel, BorderLayout.CENTER);
		contentPane.add(controlPanel, BorderLayout.SOUTH);

		setVisible(true);
	}

	// determines which button was clicked and updates the game accordingly
	private class GameListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Object source = event.getSource();
			int intUserMove = updateUserMoveDisplay( source, event);
			int intComputerMove = updateComputerMoveDisplay();
			updateStatusDisplay( source, intUserMove, intComputerMove );
		}

		private int updateUserMoveDisplay( Object source, ActionEvent event){
			int intUserMove = 0;

			//Images not working :(
			if( source == rockButton ) {
				userPlay.setIcon( rockImage );
				intUserMove = game.ROCK;
			}
			else if ( source == paperButton ) {
				userPlay.setIcon( paperImage );
				intUserMove = game.PAPER;
			}
			else { // source == scissorsImage
				userPlay.setIcon( scissorsImage );
				intUserMove = game.SCISSORS;
			}
			userPlay.setText("You selected : ");

			return intUserMove;
		}

		//update the computer's move
		private int updateComputerMoveDisplay() {
			int intComputerMove = game.ComputerPlay();
			//Images not working. :(
			if (intComputerMove == game.ROCK) {
				compPlay.setIcon(rockImage);
			} else if (intComputerMove == game.PAPER) {
				compPlay.setIcon(paperImage);
			} else {
				compPlay.setIcon(scissorsImage);
			}
			compPlay.setText("Computer's move : ");

			return intComputerMove;
		}

		private String formatBalance( double balance ) {
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			return formatter.format(balance);
		}

		private void showColorizedBalance() {
			statusB.setForeground(( game.getBalance() >= 0 ) ? Color.green : Color.red);
			statusB.setText("Balance: " + formatBalance(game.getBalance()));
		}


		private void setOutcomeMessages( char winner ) {
			if( winner == 'u') outcome.setForeground( Color.green );
			else outcome.setForeground( Color.red );

			outcome.setText( game.getOutcomeMessage() );
			statusC.setText("Computer Wins: " + game.getCWins());
			statusU.setText("User Wins: " + game.getUWins());
			statusT.setText("Ties: " + game.getTies());
		}

		private void updateStatusDisplay(Object source, int intUserMove, int intComputerMove) {
			char winner = game.findWinner( intComputerMove, intUserMove );
			setOutcomeMessages( winner );
			if( game.isWillingToBet() ) {
				showColorizedBalance();
			}
		}
	}

	private static void displayError( String errorMessage ) {
		JOptionPane.showMessageDialog(null, errorMessage, "Invalid Input Error!", JOptionPane.ERROR_MESSAGE);
	}


	private static String promptForInput( String promptMessage ) {
		return JOptionPane.showInputDialog (null, promptMessage,
				"Rock-Paper-Scissors", JOptionPane.QUESTION_MESSAGE);
	}

	// wanna bet?
	private static boolean isBet(String betAsk) {
		int answer = JOptionPane.showConfirmDialog ( null, betAsk);
		boolean betConfirmed = false;

		if ( answer == JOptionPane.YES_OPTION ) betConfirmed = true;
		else if ( answer == JOptionPane.NO_OPTION ) betConfirmed = false;
		else System.exit(0);

		return betConfirmed;
	}


	private static void processBetInput(String betAmountPrompt) {
		boolean validInput = false;
		while( ! validInput ) {
			String betInput = promptForInput( betAmountPrompt );


			if ( betInput.isEmpty() ) {
				betInput = "0.0";
			} else {
				if ( betInput.charAt(0) == '$' ) {
					betInput = betInput.substring( 1, betInput.length());
				}
			}

			try {
				betAmount = Double.parseDouble( betInput );
				if( betAmount != 0 ){
					if ( betAmount < 0 ) throw new NegativeNumberException();
				}
				validInput = true;
			} catch (NumberFormatException nfe) {
				displayError( "Enter a valid amount." );
			} catch (NegativeNumberException nne) {
				displayError( "The bet amount must be positive" );
			}
		}
	}

	public static void main(String args[]) {
		if ( isBet( BET_ASK ) ) {
			processBetInput( BET_AMOUNT_PROMPT );
		}
		else {
			betAmount = 0.0;
		}

		RPSGUIGame frame = new RPSGUIGame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static class NegativeNumberException extends Exception { }
}