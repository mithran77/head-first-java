import java.util.stream.IntStream;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DotComBustGui implements ActionListener
{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    String userGuess;
    String result;
    MatrixButton[][] buttons = new MatrixButton[7][7];
    JPanel gamePanel;
    JLabel textLabel;
    ArrayList<MatrixButton> hitButtons = new ArrayList<MatrixButton>();

    public void setUpGame()
    {
	//Create 3 DotComs
	DotCom dc1 = new DotCom();
	DotCom dc2 = new DotCom();
	DotCom dc3 = new DotCom();

	// Names
	dc1.setName("facebook.com");
	dc2.setName("google.com");
	dc3.setName("yahoo.com");

	// Add to DotComList
	dotComList.add(dc1);
	dotComList.add(dc2);
	dotComList.add(dc3);

	// Place each DotCom on the grid
        for(DotCom dotComToSet : dotComList)
        {
	    dotComToSet.setLocationCells(helper.placeDotCom(3));
	}

     }

    public void checkUserGuess(String userGuess)
    {
	//Find out if there is a hit or a kill on any dot com instance
	numOfGuesses++;
	result = "Miss";
	for(DotCom dotComToTest : dotComList)
	{
	    result = dotComToTest.checkYourself(userGuess);
	    if (result == "Hit")
	    {
		System.out.println(result);
		break;
	    }
	    if (result == "Kill")
	    {
		dotComList.remove(dotComToTest);
		textLabel.setText("Ouch! you sunk " + dotComToTest.getName() + " : (");
		break;
	    }
	    System.out.println(result);
	}
    }

    public void finishGame()
    {
	String result = "<html>All DotComs are dead, your stock is now worthless.<br>";
	if (numOfGuesses <= 18)
	{
	    result += "It only took you " + numOfGuesses + " guesses.<br>";
	    result += "You got out before your options sank.</html>";
	    //textLabel.setText("It only took you " + numOfGuesses + " guesses.");
	    //System.out.println("You got out before your options sank.");
	}
	else
	{
	    result += "Took you long enough. " + numOfGuesses + " guesses.<br>";
	    result += "Fish are dancing with your options.</html>";
	    //textLabel.setText("Took you long enough. " + numOfGuesses + " guesses.");
	    //System.out.println("Fish are dancing with your options");
	}
	textLabel.setText(result);
    }

    public void launchGui()
    {
	JFrame frame = new JFrame();
	frame.setTitle("Sink A Dot Com");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	gamePanel = new JPanel();
	textLabel = new JLabel();

        gamePanel.setLayout(new GridLayout(7, 7));
	for(int i = 0; i < 7; i++)
	{
	    for(int j = 0; j < 7; j++)
	    {
		String rowCol = Character.toString((char)(97 + i)) + String.valueOf(j);
		buttons[i][j] = new MatrixButton(rowCol);
		buttons[i][j].addActionListener(this);		
		gamePanel.add(buttons[i][j]);
	    }
	}
	frame.getContentPane().add(gamePanel);
	frame.getContentPane().add(BorderLayout.SOUTH, textLabel);
	textLabel.setText("<html>"
			  + "Your goal is to sink three dot coms.<br>"
			  + "google.com, facebook.com and yahoo.com <br>"
			  + "Try to sink them all in the fewest number of guesses.</html>");

	frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event)
    {
	MatrixButton button = (MatrixButton) event.getSource();
	String rowCol = button.getRowCol();
	checkUserGuess(rowCol);

	if (result.equals("Hit") || result.equals("Kill"))
	{
	    button.setEnabled(false);
	    button.setBackground(Color.red);
	}

	if (dotComList.isEmpty())
	{
	    finishGame();
	}

    }

    public static void main(String[] args)
    {
	DotComBustGui game = new DotComBustGui();
	game.setUpGame();
	game.launchGui();
	//game.startPlaying();
    }

}
