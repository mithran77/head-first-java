import java.util.stream.IntStream;
import java.util.ArrayList;

public class SimpleDotCom
{
    private ArrayList<Integer> locationCells = new ArrayList<Integer>();

    //private ArrayList<Integer> guessedCells = new ArrayList<Integer>();
    private int numberOfHits = 0;
    //boolean contains = false;

    public String checkYourself(String userGuess)
    {
	int guess = Integer.parseInt(userGuess);
	String result = "Miss";

	if (locationCells.contains(guess))
	{
	    result = "Hit";
	    locationCells.remove(locationCells.indexOf(guess));
	}

	if (locationCells.isEmpty())
	{
	    result = "Kill";
	}

	System.out.println(result);
	return result;

    }

    public void setLocationCells(ArrayList<Integer> locs)
    {
	locationCells = locs;
    }

}
