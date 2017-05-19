public class BeerSong
{
    public static void main(String[] args)
    {
	int bottleCount = 99;
	String word = "bottles";
	
	while(bottleCount > 0)
	{
	    if(bottleCount == 1)
	    {
		word = "bottle";
	    }
	  
	    System.out.println(bottleCount + " " + word + " of beer on the wall.");
	    System.out.println(bottleCount + " " + word + " of beer.");
	    System.out.println("Take one down.");
	    System.out.println("Pass it around.");
	    bottleCount -= 1;
	}

	if (bottleCount == 0)
	{
	    System.out.println("No more bottles of beer on the wall.");
	}
    }
}
