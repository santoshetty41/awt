import java.awt.*;
import java.awt.event.*;

class I extends Frame
{
    Button b1;
    Button b2;
    public I()
    {
        setSize(600,500);
        setTitle("Action Listener");
        setVisible(true);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1 = new Button("Login");
        add(b1);

        b1.addActionListener(new MyAction());
    }
}
class MyAction implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Button Click");
        }
}

public class actionListener1 {
    public static void main(String[] args)
    {
        I obj = new I();
    }
}
