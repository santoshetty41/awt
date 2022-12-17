import java.awt.*;
import java.awt.event.*;

public class checkbox extends Frame implements ActionListener{

    public static void main(String[] args)
    {
        checkbox cb = new checkbox();
        cb.addWindowListener(new myWL());

    }


    Checkbox c1, c2, c3;
    Button btn;
    Label msg;
    private checkbox()
    {
        setTitle("Checkbox");
        setVisible(true);
        setSize(600,500);
        setLayout(new GridLayout(5,1,10,10));

        init();
        add(msg);
        add(c1);
        add(c2);
        add(c3);
        add(btn);

        btn.addActionListener(this);

    }
    private void init()
    {
        c1 = new Checkbox("Java");
        c2 = new Checkbox("Python");
        c3 = new Checkbox("C++");
        msg = new Label("Enter your Choise : ");
        btn = new Button("OK");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("BUTTON CLICK");
        System.out.println(c1.getLabel()+"-->"+c1.getState());   // get state true or false
        System.out.println(c2.getLabel()+"-->"+c2.getState());
        System.out.println(c3.getLabel()+"-->"+c3.getState());
    }
}
class myWL implements WindowListener
{
    public void windowActivated(WindowEvent ev){};
    public void windowDeactivated(WindowEvent ev){};
    public void windowIconified(WindowEvent ev){};
    public void windowOpened(WindowEvent ev){};
    public void windowDeiconified(WindowEvent ev){};
    public void windowClosed(WindowEvent ev){};
    public void windowClosing(WindowEvent ev)
    {
//        System.out.println("Window closed");
        ev.getWindow().dispose();
    }

}
