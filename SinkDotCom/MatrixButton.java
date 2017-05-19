import javax.swing.*;
import java.awt.*;

class MatrixButton extends JButton
{
    private static final long serialVersionUID = -8557137756382038055L;
    private final String rowCol;

    public MatrixButton(String rowCol)
    {
	super();
	this.rowCol = rowCol;
    }

    public String getRowCol()
    {
	return rowCol;
    }

}
