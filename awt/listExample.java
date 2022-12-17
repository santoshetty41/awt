import java.awt.Frame;
import java.awt.List;
import java.awt.FlowLayout;

class listExample extends Frame
{
	
	listExample()
	{
		setVisible(true);
		setSize(700,600);
		setTitle("List");
		setLayout(new FlowLayout());
		
		List l = new List(3,true);
		l.add("Maths");
		l.add("Science");
		l.add("English");
		l.add("Physics");
		l.add("Eco");
		l.add("Java");
		
		add(l);
	}
	
	public static void main(String[] args)
	{
		listExample obj = new listExample();
	}
}