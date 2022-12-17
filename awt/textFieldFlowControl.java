import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;

public class textFieldFlowControl {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(600,500);
        f.setLocation(80,50);
        f.setTitle("My Frame");

        // FlowLayout fl = new FlowLayout();
        // f.setLayout(fl);
        f.setLayout(new FlowLayout());
        
        TextField tf1 = new TextField("Santosh");
        f.add(tf1);
        TextField tf2 = new TextField("Santosh");
        f.add(tf2);
        TextField tf3 = new TextField("Santosh");
        f.add(tf3);

        
    }
}
