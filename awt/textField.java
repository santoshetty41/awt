import java.awt.Frame;
import java.awt.TextField;

public class textField {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(600,500);
        f.setLocation(60,50);
        f.setTitle("My Frame");

        TextField tf = new TextField("Santosh");
        f.add(tf);

    }
}
