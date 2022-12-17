import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class window extends Frame implements ActionListener
{
	
	Button btn;
	Label l;
	TextField num;
	window()
	{
		setVisible(true);
		setSize(180,200);
		setLocation(200,100);
		
		setLayout(new GridLayout(3,1));
		btn = new Button("Check");
		btn.addActionListener(this);
		l = new Label("Enter your guess number Here");
		num = new TextField();


		init();

	}

	private void init() {
		add(l);
		add(num);
		add(btn);
	}

	public void actionPerformed(ActionEvent e)
		{
			fun();


		}

	private void fun() {
		//System.out.println("Button Click");\
		Random ranNumber = new Random();
		int rand = ranNumber.nextInt(100);

		int n = getText();

		System.out.println(rand);


		boolean check = false;


		while(check != true){
			int n1 = getText();
			check = checkNumber(n1, rand);


		}
	}

	private int getText() {
		int n = Integer.parseInt(num.getText());
		//num.setText("");
		System.out.println(n);
		return n;
	}

	private boolean checkNumber(int n, int rand) {
		System.out.println("CHECKNUMBER");
		if(n == rand){
			System.out.println("congratulation");
			return true;
		}
		else if(n > rand)
		{
			System.out.println("number is greater");
			return false;
		}
		else if(n < rand)
		{
			System.out.println("number is less");
			return false;

		}
		return false;
	}

	public static void main(String[] args)
	{
		window obj = new window();
		
		obj.addWindowListener(new WindowListener()
		{
			@Override
			public void windowOpened(WindowEvent e) {

			}

			@Override
			public void windowClosing(WindowEvent e) {
				obj.dispose();
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
			
		});
		

	}
	
	
}