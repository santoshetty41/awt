import java.awt.Frame;
import java.awt.Choice;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class choiceClass extends Frame
{
	Choice c;
	
	choiceClass()
	{
		setVisible(true);
		setSize(500,600);
		setTitle("Choice");
		
		c = new Choice();
		c.add("Maths");
		c.add("Science");
		c.add("English");
		add(c);
		
		
		
	}
	
	public static void main(String[] args)
	{
	choiceClass obj = new choiceClass();
	}
	
}