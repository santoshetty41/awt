import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;

class K extends Frame implements ActionListener
{
    Button b1;
    Button b2;
   public K()
    {
        setVisible(true);
        setSize(600,500);
        setTitle("EventListener");

        setLayout(new FlowLayout());

        b1 = new Button("Log In");
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("Sign Up");
        add(b2);
        b2.addActionListener(this);

    }
        public void actionPerformed(ActionEvent e)
        {
           //  System.out.println("Login Button Clicked ");
            Object source = e.getSource();
            //  System.out.println(e);
            if(source == b1)
            {
                System.out.println("Log in button clicked");
            }
            if(source == b2)
            {
                System.out.println("Sign up button clicked");
            }

        }

}

public class actionListener2 {
    public static void main(String[] args)
        {
            K obj = new K();
        }

}
