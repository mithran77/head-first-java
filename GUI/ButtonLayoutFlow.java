import javax.swing.*;
import java.awt.*;

public class ButtonLayoutFlow
{
    JFrame frame;
    JPanel panel;

    public static void main(String[] args)
    {
	ButtonLayoutFlow bl = new ButtonLayoutFlow();
	bl.go();
    }

    public void go()
    {
	frame = new JFrame();
	panel = new JPanel();

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setBackground(Color.darkGray);

	JButton button = new JButton("shock me");
	JButton buttonTwo = new JButton("bliss");
	JButton buttonThree = new JButton("huh");

	panel.add(button);
	panel.add(buttonTwo);
	panel.add(buttonThree);

	frame.getContentPane().add(BorderLayout.EAST, panel);
	frame.setSize(300, 300);
	frame.setVisible(true);
    }

}
