import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class Case extends JPanel {
	private Coord coord;
	private Entite entite;

	public Case(Coord coord) {
		this.coord = coord;
		this.setLayout(new BorderLayout());
		this.add(entite);

	}

	private void createEntity(int x, int y, int typeEntity) {
		Entite entite = new Entite(typeEntity);
	}
}
