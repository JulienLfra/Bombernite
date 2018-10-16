import java.awt.*;
import java.awt.event.*;

public class KeyDemo extends Frame implements KeyListener
{
    public KeyDemo() {
       addKeyListener(this);                   // link the frame with KL

        // window closing
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0); }});
        setSize(300,300);
        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int test = e.getKeyCode();
        System.out.println("Clavier : " + test);
        if(test == 68){
            System.out.println("direction est");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String snrao[])
    {
        new KeyDemo();
    }
}