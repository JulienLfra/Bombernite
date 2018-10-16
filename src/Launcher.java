import javax.swing.*;
import java.awt.*;


public class Launcher implements Observer {


	JFrame frame = new JFrame("Bombernite");
	Board board;
	Home home;

	public static void main(String[] args) {
		Launcher t = new Launcher();
		t.init();
		}

	private void init() {
		Dimension dim;
		dim = new Dimension(1000, 800);
		// TODO Auto-generated method stub
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400, 10);
		frame.setPreferredSize(dim);
		board = new Board(10,10);
		frame.add(board);
		frame.pack();
		frame.setResizable(true);
		frame.setVisible(true);
//		home = new Home(10,10);
//		home.addObserver(this);
//		frame.add(home);
	}


	@Override
	public void updateBoard(ObservableJPanel observableJPanel, Object object) {
		if(object != null) {
			System.out.println("C'est parti!");
			board = new Board(10,10);
			frame.add(board);
//			frame.set
		}
	}
}
