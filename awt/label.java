import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.FlowLayout;

class A extends Frame
{
    A()
    {
        setVisible(true);
        setTitle("Label");
        setSize(500,600);
        setLayout(new FlowLayout());

        TextField t1 = new TextField(10);
        Label l1 = new Label("NAME :- ");
        add(l1);     // First add Label
        add(t1);   //  Then add TextField


        TextField t2 = new TextField(10);
        Label l2 = new Label("NUMBER :- ");
        add(l2);     // First add Label
        add(t2);   //  Then add TextField

    }
}
public class label {
    public static void main(String[] args)
    {
      A a = new A();
    }

}
