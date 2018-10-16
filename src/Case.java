import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class Case extends JPanel {
	private Coord coord;
	private Entite entite;

	public Case(Coord coord) {
		this.coord = coord;
		this.entite = new Entite();
		this.setLayout(new BorderLayout());
		this.add(entite);
	}
}
