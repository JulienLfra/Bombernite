import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends ObservableJPanel {

    private int width;
    private int length;
    private JButton button = new JButton("Jouer!");


    public Home(int width, int length) {
        this.width = width;
        this.length = length;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//
                //setChanged pour lancer le notifyObservers!!!
//                Home.this.setChanged();
                Home.this.notifyObservers(true);
            }
        });
        this.createHome();
    }

    private void createHome() {
        GridBagConstraints grid = new GridBagConstraints();
        grid.weightx = 10;
        grid.weighty = 20;
        grid.fill = GridBagConstraints.CENTER;
        this.setLayout(new GridBagLayout());
        this.add(button,grid);
    }
}
