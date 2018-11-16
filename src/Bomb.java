import java.awt.Color;

// 5/10/2018 - Guillaume Bozon
// Classe fille permettant de créer une bombe classique
// Version : 1.1.0

public class Bomb extends Entity {

	// Attribut
	// ----------------------------------------------------------------------------------------
	boolean exist;
	int range;

	// Constructeur
	// -----------------------------------------------------------------------------------
	Bomb() {
		crossable = false;
		color = Color.BLACK;
		coord = new Coord(5, 0);
		typeEntity = TypeEntity.BOMB;
		exist = true;
		range = 1;
	}

	// Méthode
	// ------------------------------------------------------------------------------------------
	
	// fonction permettant d'intialiser le timer avant explosion
	void bombPlaced(){
		TimerGame timer = new TimerGame();
		timer.schedule(timer.getTimerTask(), 3000);
		kill();
		
	}
	
	// Fonction permettant de tuer une entitée, correspond à l'explosion de la bombe
	void kill(){ 
		int i = 0; 
		boolean blockDestructible = false;
		System.out.println("Time Up");
/*
		//Explosion Nord 
		do{ 
			blockDestructible = checkCoord(0,i);
			if(blockDestructible == true) {
				Coord coordTarget = new Coord(0,i);
				killEntity(coordTarget); // coordonnées de l'entitée à détruire et son type
			}
			i++;
		}while(i < range || blockDestructible == true);
*/
	}
	
	/*void killEntity(Coord coord) {
		Entity entity = searchEntity(coord);
		entity.die();
	}*/


	public String toString() {
		return "Bomb [exist=" + exist + ", range=" + range + ", crossable="
				+ crossable + ", color=" + color + ", coord=" + coord
				+ ", typeEntity=" + typeEntity + "]";
	}
}
