import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// 5/10/2018 - Guillaume Bozon
// Classe fille permettant de créer un personnage utilisé par un joueur
// Version : 1.0.0

public class Player extends Character implements KeyListener{

	// Attribut
	// ------------------------------------------------------------------------------------------
	int speed;
	int range;
	int nbBombs;

	// Constructeur
	// ------------------------------------------------------------------------------------------
	Player() {
		crossable = false;
		color = color.BLUE;
		coord = new Coord(0, 0);
		typeEntity = TypeEntity.PLAYER;
		alive = true;
		speed = 0;
		range = 1;
		nbBombs = 1;
	}

	Player(int x, int y) {
		crossable = false;
		color = color.BLUE;
		coord = new Coord(x, y);
		typeEntity = TypeEntity.PLAYER;
		alive = true;
		speed = 0;
		range = 1;
		nbBombs = 1;
	}

	// Méthode
	// ------------------------------------------------------------------------------------------
	void move() {

	}

	@Override
	public String toString() {
		return "Player [speed=" + speed + ", range=" + range + ", nbBombs="
				+ nbBombs + ", alive=" + alive + ", crossable=" + crossable
				+ ", color=" + color + ", coord=" + coord + ", typeEntity="
				+ typeEntity + "]";
	}

	void attack() {

	}

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("keyCode : " + keyCode);
        switch (keyCode) {

            case 90:
                move(Direction.NORTH);
                break;

            case 83:
                move(Direction.SOUTH);
                break;

            case 68:
                move(Direction.EAST);
                break;

            case 81:
                move(Direction.WEST);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
