import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextArea1 implements ActionListener
{
    JTextArea text;

    public static void main(String[] args)
    {
	TextArea1 ta1 = new TextArea1();
	ta1.go();
    }

    public void go()
    {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	JButton button = new JButton("Just click it");
	button.addActionListener(this);
	text = new JTextArea(10, 20);

	text.setLineWrap(true);
	JScrollPane scrollable = new JScrollPane(text);

	scrollable.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scrollable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

	panel.add(scrollable);

	frame.getContentPane().add(BorderLayout.CENTER, panel);
	frame.getContentPane().add(BorderLayout.SOUTH, button);

	frame.setSize(300, 300);
	frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent event)
    {
	text.append("button clicked \n");
    }

}
