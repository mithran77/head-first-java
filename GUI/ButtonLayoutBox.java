import javax.swing.*;
import java.awt.*;

public class ButtonLayoutBox
{
    JFrame frame;
    JPanel panel;

    public static void main(String[] args)
    {
	ButtonLayoutBox bl = new ButtonLayoutBox();
	bl.go();
    }

    public void go()
    {
	frame = new JFrame();
	panel = new JPanel();

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.setBackground(Color.darkGray);
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

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
