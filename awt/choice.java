import java.awt.Frame;
import java.awt.Choice;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class choiceClass extends Frame implements WindowListener
{
	Choice c;
	
	choice()
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
		
		obj.addWindowListener(new WindowListener()
		{
			public void windowActivated(WindowEvent e)
			{

			}
			public void windowDeactivated(WindowEvent e)
			{

			}
			public void windowIconified(WindowEvent e)
			{

			}
			public void windowDeiconified(WindowEvent e)
			{

			}
			public void windowOpened(WindowEvent e)
			{

			}
			public void windowClosed(WindowEvent e)
			{

			}
			public void windowClosing(WindowEvent e)
			{
				obj.dispose();
			}

			
		});
	}


	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}
}