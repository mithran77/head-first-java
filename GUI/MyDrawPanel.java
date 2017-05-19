import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel
{
    // Simple colour
    // public void paintComponent(Graphics g)
    // {
    // 	g.setColor(Color.orange);
    // 	g.fillRect(20, 50, 100, 100);
    // }

    // Gradient
    // public void paintComponent(Graphics g)
    // {
    // 	Graphics2D g2d = (Graphics2D) g;
    // 	GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
	
    // 	g2d.setPaint(gradient);
    // 	g2d.fillOval(70, 70, 100, 100);
    // }

    // Random gradient
    public void paintComponent(Graphics g)
    {
    	Graphics2D g2d = (Graphics2D) g;

    	int red = (int) (Math.random() * 255);
    	int green = (int) (Math.random() * 255);
    	int blue = (int) (Math.random() * 255);
    	Color startColor = new Color(red, green, blue);

    	red = (int) (Math.random() * 255);
    	green = (int) (Math.random() * 255);
    	blue = (int) (Math.random() * 255);
    	Color endColor = new Color(red, green, blue);

    	GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);

    	g2d.setPaint(gradient);
    	//g2d.fillOval(90, 70, 100, 100);
    	g2d.fillOval(70, 70, 100, 100);
    }

    // gif in pane
    // public void paintComponent(Graphics g)
    // {

    // 	Image image = new ImageIcon("phil.gif").getImage();
    // 	g.drawImage(image, 10, 10, this);
    // }


}
