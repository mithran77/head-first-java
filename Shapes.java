import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Shape
{
    public void rotate()
    {

    }

    public void playSound(String song)
    {
	Media hit = new Media(new File(song).toURI().toString());
	MediaPlayer mediaPlayer = new MediaPlayer(hit);
	mediaPlayer.play();
    }
}

public class Circle extends Shape
{
    public String circleSong = "Pink.mp3";

    public void playSound(String circleSong)
    {
	super.playSound(circleSong);
    }

}

public class Square extends Shape
{
    public String squareSong = "IDontWantToMissAThing.mp3";

    public void playSound(String squareSong)
    {
	super.playSound(squareSong);
    }
}

public class Triangle extends Shape
{
    public String triangleSong = "Crazy.mp3";

    public void playSound(String triangleSong)
    {
	super.playSound(triangleSong);
    }
}

public class Amoeba extends Shape
{
    public String amoebaSong = "HoleInMySoul.mp3";

    public void playSound(String amoebaSong)
    {
	super.playSound(amoebaSong);
    }
}
