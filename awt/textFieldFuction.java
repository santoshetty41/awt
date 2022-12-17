import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;

class F extends Frame
{
    public F()
    {
        setTitle("My Title");
        setSize(500,400);
        setVisible(true);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);
        TextField t1 = new TextField("text 1");
        TextField t2 = new TextField("text 2");
        TextField t3 = new TextField("text 3");
        add(t1);
        add(t2);
        add(t3);

        t1.setEditable(false);
        System.out.println(t1.isEditable());

        t1.setText("Santosh");
        System.out.println("Text is : "+ t1.getText());
    }
}

public class textFieldFuction {
    public static void main(String[] args)
    {
        F obj = new F();
    }
}
