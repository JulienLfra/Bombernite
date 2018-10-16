import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Board extends JPanel {
	private int width;
	private int length;
	int tableau [][] ;
	private Map<Coord, Case> map = new HashMap<Coord, Case>();

	public Board(int width, int length) {
		this.width = width;
		this.length = length;
		tableau[0][0]=0;
		for(int i=1;i<10;i++) {
			for (int j = 1; j < 10; j++) {
				tableau[i][j] =1;
			}
		}
		for(int i=0;i<10;i++) {
			for (int j = 0; j < 10; j++) {
				createEntity(i,j,tableau[i][j]);
			}
		}
		this.createBoard();

	}

	private void createEntity(int x, int y, int typeEntity) {
				Entite entite = new Entite(typeEntity);
	}

	private void createBoard() {

		Case square = null;
		Coord coord = null;
		this.setLayout(new GridLayout(width, length));
		for (int width_temp = 0; width_temp < width; width_temp++) {
			for (int length_temp = 0; length_temp < length; length_temp++) {
				coord = new Coord(width_temp, length_temp);
				square = new Case(coord);
				this.add(square);

			}
		}
	}

}
