import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Board extends JPanel {
	private int width;
	private int length;
	private Map<Coord, Case> map = new HashMap<Coord, Case>();

	public Board(int width, int length) {
		this.width = width;
		this.length = length;
		this.createBoard();

	}

	private void createBoard() {

		Case square = null;
		Coord coord = null;
		this.setLayout(new GridLayout(width, length));
		for (int width_temp = 0; width_temp < width; width_temp++) {
			for (int length_temp = 0; length_temp < length; length_temp++) {
				coord = new Coord(width_temp, length_temp);
				square = new Case(coord, new ImageIcon("image.png"));
				this.add(square);

			}
		}
	}

}
