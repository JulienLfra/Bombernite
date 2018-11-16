import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.io.File;

public class Entity extends JPanel {

    public ImageIcon image;
    boolean crossable;
	Color color;
	Coord coord;
	TypeEntity typeEntity;

    public Entity() {
    	try {
    		this.image = new ImageIcon(
    				ImageIO.read(
    						new File("/fs03/share/users/guillaume.bozon/home/Documents/Programmation/Java POO/Bombernite Battle Royale/Graphismes/Vide.gif")));
        } catch (Exception e) {
        	System.out.println(e);
        }
        this.repaint();

        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setOpaque(true);
        
        this.crossable = true;
    	this.color = color.LIGHT_GRAY;
    	this.coord = new Coord(0,0);
    	this.typeEntity = TypeEntity.EMPTY;
    }
    
    public Entity(Coord coordCase) {
        try {
        	this.image = new ImageIcon(
                    ImageIO.read(
                    		new File("/fs03/share/users/guillaume.bozon/home/Documents/Programmation/Java POO/Bombernite Battle Royale/Graphismes/Vide.gif")));
        } catch (Exception e) {
            System.out.println(e);
        }
        this.repaint();

        this.setLayout(new BorderLayout());
        this.setVisible(true);
        this.setOpaque(true);

        this.crossable = true;
        this.color = color.LIGHT_GRAY;
        this.coord = coordCase;
        this.typeEntity = TypeEntity.EMPTY;
    }
    
    public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	
	void die(){
		this.crossable = true;
		this.coord = new Coord(-1,-1);
		this.typeEntity = TypeEntity.EMPTY;
	}
}