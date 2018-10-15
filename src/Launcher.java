import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JFrame;


public class Launcher {

	public static void main(String[] args) {
		Dimension dim;
		dim = new Dimension(1000, 800);
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Bombernite");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400, 10);
		frame.setPreferredSize(dim);
		frame.pack();
		frame.setResizable(true);
		Board board = new Board(10,10);
		frame.setVisible(true);		
		frame.add(board);
		
		
		
		
		

	}

}
