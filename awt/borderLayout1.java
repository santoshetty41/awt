import java.awt.*;

class O extends Frame
{
    Panel east, west, north, south, center;
    O(String st)
    {
        setTitle(st);
        setVisible(true);
        setSize(500,600);
        //  FlowLayout fl = new FlowLayout(FlowLayout.CENTER);

            //  adding panels
        east = new Panel();
        east.setBackground(Color.RED);

        west = new Panel();
        west.setBackground(Color.BLUE);

        north = new Panel();
        north.setBackground(Color.YELLOW);

        south = new Panel();
        south.setBackground(Color.green);

        center = new Panel();
        center.setBackground(Color.pink);


        BorderLayout bl = new BorderLayout(10,10);
        setLayout(bl);
        add(east,BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);


            // for chamge size of panels
        east.setPreferredSize(new Dimension(100,100));
        west.setPreferredSize(new Dimension(100,100));
        north.setPreferredSize(new Dimension(100,100));
        south.setPreferredSize(new Dimension(100,100));
        center.setPreferredSize(new Dimension(100,100));


    }
}
public class borderLayout1 {
    public static void main(String[] args)
    {
        O obj = new O("Border Layout");
    }



}
