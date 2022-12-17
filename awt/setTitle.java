import java.awt.Frame;

public class setTitle extends Frame{
    public static void main(String[] args) {

        setTitle f = new setTitle("My Title");
        f.setVisible(true);
        f.setSize(700,500);

       // f.setTitle("My Title");

    }

    // using Constructor
    public setTitle(String name)
    {
        super(name);
    }
}
