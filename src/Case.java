import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class Case extends JPanel {
	private Coord coord;
	private Entity entity;

	public Case(Coord coord) {
		this.coord = coord;
		this.entity = new Entity(coord);
		this.setLayout(new BorderLayout());
		this.add(entity);
	}

	public Coord getCoord() {
		return coord;
	}
}
