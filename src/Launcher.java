import javax.swing.*;
import java.awt.*;


public class Launcher {

	public static void main(String[] args) {
		Dimension dim;
		dim = new Dimension(1000, 800);
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Bombernite");
		Board board = new Board(10,10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400, 10);
		frame.setPreferredSize(dim);
		frame.pack();
		frame.setResizable(true);
		frame.setVisible(true);
		frame.add(board);
	}

}
