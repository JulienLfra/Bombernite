import java.awt.*;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Case extends JPanel {
	private Coord coord;
	private ImageIcon image;

	public Case(Coord coord, ImageIcon image) {
		this.coord = coord;
		this.image = image;
		//Entity est abstract, constructeur d'une classe
		// this.Entity = new Entity(Color.RED);
		this.add(new JLabel(image));
		this.setLayout(new BorderLayout());
	}
}
