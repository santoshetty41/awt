package assign2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends Frame implements ActionListener
{
    Button b1, b2, b3, b4, b5;
    TextField t1, t2, t3;

    frame()
    {
        setVisible(true);
        setTitle("ASSIGNMENT 2");
        setBounds(100,100,210,400);
        setBackground(Color.GRAY);
        setLayout(new FlowLayout());

        intilizeElem();
        addElem();
        actionClick();


    }

    private void actionClick() {
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());

        int ans = 0;

       Button b = (Button) e.getSource();
//        System.out.println(b);

        if(b == b1)
        {
          ans = n1 + n2;
        }
        else if(b == b2)
        {
            ans = n1 - n2;

        }
        else if(b == b3)
        {
            ans = n1 * n2;
        }
        else if(b == b4)
        {
            ans = n1 / n2;
        }
        else
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }

        //System.out.println(ans);
//        String newAns = String.valueOf(ans);
        t3.setText(String.valueOf(ans));
    }


    private void addElem() {
        //  Text Added
        add(t1);
        add(t2);
        add(t3);

        //  Button Added
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

    }

    private void intilizeElem() {
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);

        b1 = new Button("SUM");
        b2 = new Button("SUB");
        b3 = new Button("MUL");
        b4 = new Button("DIV");
        b5 = new Button("RESET");
    }
}
