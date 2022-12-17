import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class L extends Frame implements ActionListener
{

    TextField tf2;
    TextField tf1;
    L()
    {
        setTitle("Assignment");
        setVisible(true);
        setSize(150,500);
        setLocation(200,50);

        setLayout(new FlowLayout(FlowLayout.CENTER, 30,30));

        Dimension d = new Dimension(100,60);

        tf1 = new TextField("Santosh",15);
        tf1.setEditable(false);
        tf1.setBackground(Color.CYAN);
        tf1.setForeground(Color.BLACK);
        add(tf1);

        tf2 = new TextField("Naresh",15);
        tf2.setEditable(false);tf2.setBackground(Color.CYAN);
        tf2.setForeground(Color.BLACK);
        add(tf2);

        Button b = new Button("Change");
        b.setPreferredSize(d);
        b.setBackground(Color.YELLOW);
        b.setForeground(Color.RED);
        add(b);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        // System.out.println("Button Clicked");
        String text1 = tf1.getText();
        String text2 = tf2.getText();

        tf1.setText(text2);
        tf2.setText(text1);


    }
}

public class assignment1 {
    public static void main(String[] args)
    {
        L obj =new L();
    }
}
