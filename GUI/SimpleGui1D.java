import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class SimpleGui1D implements ActionListener
{
    JFrame frame;

    public static void main(String[] args)
    {
	SimpleGui1D gui = new SimpleGui1D();
	gui.go();
    }

    public void go()
    {

	frame = new JFrame();
	JButton button = new JButton("Change color");
	MyDrawPanel displayPanel = new MyDrawPanel();

	button.addActionListener(this);
	frame.setLayout(new BorderLayout());

	frame.getContentPane().add(BorderLayout.SOUTH, button);
	frame.getContentPane().add(BorderLayout.CENTER, displayPanel);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300, 300);
	frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event)
    {
	frame.repaint();
    }

}
