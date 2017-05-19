import java.util.ArrayList;
import java.util.Scanner;

class GameLaunch
{
    public static void main(String [] args)
    {
	SimpleDotCom dot = new SimpleDotCom();
	int cell = (int) (Math.random() * 7);
	ArrayList<Integer> cellLocations = new ArrayList<Integer>();
	// List<Integer> cellLocations = new ArrayList<Integer>();
	String result = "Miss";
	String guessedNumber;
	int guessCounter = 0;
	Scanner reader = new Scanner(System.in);

	// Find the cell locations of DotCom
	if (cell == 6)
	    {
		cellLocations.add(cell - 2);
		cellLocations.add(cell - 1);
		cellLocations.add(cell);
	    }
	else if (cell == 0)
	    {
		cellLocations.add(cell);
		cellLocations.add(cell + 1); 
		cellLocations.add(cell + 2);
	    }
	else
	    {
		cellLocations.add(cell - 1);
		cellLocations.add(cell);
		cellLocations.add(cell + 1);
	    }
	dot.setLocationCells(cellLocations);

	while (result != "Kill")
	    {	
		System.out.print("Guess a number : ");
		guessedNumber = reader.next();
		guessCounter ++;
		result = dot.checkYourself(guessedNumber);
	    }
	System.out.println("Congrats you took " + guessCounter + " guesses");
    }
}
