import java.awt.*;
import java.awt.event.*;

public class windowListenerEx extends Frame {
    public static void main(String[] args) {
        windowListenerEx wl = new windowListenerEx();

        wl.addWindowListener(new myWindowListener());

    }
    private windowListenerEx()
    {
        setTitle("Window Listener");
        setVisible(true);
        setSize(400,600);

    }
}
class myWindowListener implements WindowListener
{
    public void windowActivated(WindowEvent ev)
    {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent ev)
    {
        System.out.println("Window Deactivated");
    }

    public void windowOpened(WindowEvent ev)
    {
        System.out.println("Window Opened");
    }

    public void windowIconified(WindowEvent ev)
    {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent ev)
    {
        System.out.println("Window Deiconified");
    }

    public void windowClosed(WindowEvent ev)
    {
        System.out.println("Window Closed");
    }

    public void windowClosing(WindowEvent ev)
    {
        System.out.println("Window Closing");
       // System.out.println(ev.getWindow());
       //System.out.println(ev.getSource());

        ev.getWindow().dispose();
    }
}
