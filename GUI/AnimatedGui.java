import javax.swing.*;
import java.awt.*;

public class AnimatedGui
{
    int x = 70;
    int y = 70;

    public static void main(String[] args)
    {
	AnimatedGui aniGui = new AnimatedGui();
	aniGui.go();
    }

    public void go()
    {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	MyDrawPanel drawPanel = new MyDrawPanel();
	frame.getContentPane().add(drawPanel);

	frame.setSize(300, 300);
	frame.setVisible(true);

	for(int i = 0; i < 100; i++)
	{
	    x++;
	    y++;

	    drawPanel.repaint();

	    try
	    {
		Thread.sleep(50);
	    }
	    catch(Exception exception)
	    {
		exception.printStackTrace();
	    }

	}
    }

    class MyDrawPanel extends JPanel
    {
	public void paintComponent(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    g.setColor(Color.orange);
	    g.fillOval(x, y, 40, 40);
	}
    }

}
