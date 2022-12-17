import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

class J extends Frame{

    Button b2;
    Button b3;
    public J()
    {
        setVisible(true);
        setSize(700,400);

        setLayout(new FlowLayout());
        Button b1 = new Button("logIn");
        add(b1);

        b2 = new Button();
        add(b2);
        b2.setLabel("SignUp");   // Add text in button

        b3 = new Button("Try");
        add(b3);

       // b3.setVisible(false);    // hide button visibility

        System.out.println(b3.getLabel());

    }
}

public class button {
    public static void main(String[] args)
    {
        J obj = new J();
    }
}
