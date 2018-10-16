// 5/10/2018 - Guillaume Bozon
// Classe fille permettant de créer un monstre
// Version : 1.0.0

public class Monster extends Character {
	
	// Attribut
	// ------------------------------------------------------------------------------------------
	

	// Constructeur
	// ------------------------------------------------------------------------------------------
	Monster() {
		crossable = false;
		color = color.BLUE;
		coord = new Coord(9,9);
		typeEntity = TypeEntity.MONSTER;
		alive = true;
	}

	Monster(int x, int y) {
		crossable = false;
		color = color.BLUE;
		coord = new Coord(x, y);
		typeEntity = TypeEntity.MONSTER;
		alive = true;
	}

	// Méthode
	// ------------------------------------------------------------------------------------------
	void move() {

	}

	@Override
	public String toString() {
		return "Monster [alive=" + alive + ", crossable=" + crossable
				+ ", color=" + color + ", coord=" + coord + ", typeEntity="
				+ typeEntity + "]";
	}

}
