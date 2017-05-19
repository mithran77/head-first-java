import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BeTheCompiler395
{

    JFrame frame;
    JButton b;

    public static void main(String[] args)
    {
	BeTheCompiler395 gui = new BeTheCompiler395();
	gui.go();
    }
    
    public void go()
    {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	b = new JButton("A");
	b.addActionListener(new BListener());

	frame.getContentPane().add(BorderLayout.SOUTH, b);
	
	frame.setSize(200, 100);
	frame.setVisible(true);

    }

    class BListener implements ActionListener
    {
	public void actionPerformed(ActionEvent event)
	{
	    if (b.getText().equals("A"))
	    {
		b.setText("B");
	    }
	    else
	    {
		b.setText("A");
	    }
	}
    }
}
