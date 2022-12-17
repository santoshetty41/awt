import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Color;

class D extends Frame
{
    D()
    {

      setVisible(true);
      setSize(600,400);
      FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
      setLayout(fl);

      Button b1 = new Button("btn 1");
      Button b2 = new Button("btn 2");
      Button b3 = new Button("btn 3");



             // Dimension

        Dimension d = new Dimension(100,50);
        b1.setPreferredSize(d);   // set Dimension in btn 1
        b2.setPreferredSize(d);   // set Dimension in btn 2
        b3.setPreferredSize(d);   // set Dimension in btn 3


               // Background And Foreground

        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.RED);


      add(b1);
      add(b3);
      add(b2);
    }
}

public class BtnDimention {
    public static void main(String[] args) {
        D obj = new D();
    }
}
