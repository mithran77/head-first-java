import java.util.ArrayList;
import java.util.*;

public class DotCom
{
    private ArrayList<String> locationCells;// = new ArrayList<String>();
    private String name;

    public String checkYourself(String userGuess)
    {
	String result = "Miss";
	System.out.println(locationCells.get(0));

	if (locationCells.contains(userGuess))
	{
	    result = "Hit";
	    locationCells.remove(locationCells.indexOf(userGuess));
	}

	if (locationCells.isEmpty())
	{
	    result = "Kill";
	    System.out.println("Ouch! you sunk " + name + " : (");
	}

	//System.out.println(result);
	return result;

    }

    public void setLocationCells(ArrayList<String> locs)
    {
	locationCells = locs;
    }

    public void setName(String n)
    {
	name = n;
    }

    public String getName()
    {
	return name;
    }

}
