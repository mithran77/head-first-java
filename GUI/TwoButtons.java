import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TwoButtons
{

    private JFrame frame;
    private JLabel label;
    private JButton colorButton;
    private JButton labelButton;

    public static void main(String[] args)
    {
	TwoButtons gui = new TwoButtons();
	gui.go();
    }

    public void go()
    {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	colorButton = new JButton("Change color");
	colorButton.addActionListener(new ColorListener());

	labelButton = new JButton("Change label");
	labelButton.addActionListener(new LabelListener());

	label = new JLabel("I'm a label");
	MyDrawPanel panel = new MyDrawPanel();

	frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
	frame.getContentPane().add(BorderLayout.EAST, labelButton);
	frame.getContentPane().add(BorderLayout.WEST, label);
	frame.getContentPane().add(BorderLayout.CENTER, panel);

	frame.setSize(600, 600);
	frame.setVisible(true);
    }

    public class ColorListener implements ActionListener
    {
	public void actionPerformed(ActionEvent event)
	{
	    frame.repaint();
	}
    }

    public class LabelListener implements ActionListener
    {
	public void actionPerformed(ActionEvent event)
	{
	    label.setText("Changed text of the label!");
	}
    }

}
