import java.util.stream.IntStream;
import java.util.ArrayList;

public class DotComBust
{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    String userGuess;

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

	//Print Instructions
	System.out.println("Your goal is to sink three dot coms.");
	System.out.println("google.com, facebook.com and yahoo.com");
	System.out.println("Try to sink them all in the fewest number of guesses");

	// Place each DotCom on the grid
        for(DotCom dotComToSet : dotComList)
        {
	    dotComToSet.setLocationCells(helper.placeDotCom(3));
	}
     }

    public void startPlaying()
    {
	while (!dotComList.isEmpty())
	{
	    String userGuess = helper.getUserInput("Enter a guess : ");
	    checkUserGuess(userGuess);
	}
	finishGame();
    }

    public void checkUserGuess(String userGuess)
    {
	//Find out if there is a hit or a kill on any dot com instance
	numOfGuesses++;
	String result = "Miss";
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
		break;
	    }
	    System.out.println(result);
	}
    }

    public void finishGame()
    {
        System.out.println("All DotComs are dead, your stock is now worthless.");
	if (numOfGuesses <= 18)
	{
	    System.out.println("It only took you " + numOfGuesses + " guesses.");
	    System.out.println("You got out before your options sank.");
	}
	else
	{
	    System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
	    System.out.println("Fish are dancing with your options");
	}
    }

    public static void main(String[] args)
    {
	DotComBust game = new DotComBust();
	game.setUpGame();
	game.startPlaying();
    }

}
