// 5/10/2018 - Guillaume Bozon
// Classe fille permettant de créer un squelette d'un personnage ou d'un monstre
// Version : 1.0.1

public abstract class Character extends Entity {

	// Attribut
	// ----------------------------------------------------------------------------------------
	boolean alive;

	// Méthode
	// ------------------------------------------------------------------------------------------
	void move(Direction direction) {
		Coord nextCase;
		boolean moveOK = false;

		switch (direction) {

		case NORTH:
			nextCase = new Coord(this.coord.getX(), this.coord.getY() - 1);
			break;

		case SOUTH:
			nextCase = new Coord(this.coord.getX(), this.coord.getY() + 1);
			break;

		case WEST:
			nextCase = new Coord(this.coord.getX() - 1, this.coord.getY());
			break;

		case EAST:
			nextCase = new Coord(this.coord.getX() + 1, this.coord.getY());
			break;

		}
		System.out.println("Le personnage c'est déplacé en : " + direction);
		//moveOK = checkCoord(nextCase);

		if (moveOK == true) {
			//this.coord = nextCase;
		}
	}
}