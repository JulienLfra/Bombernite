import java.awt.Color;

// 5/10/2018 - Guillaume Bozon
// Classe fille permettant de créer une bombe classique
// Version : 1.0.0

public class Bomb extends Entity {
	
	// Attribut ----------------------------------------------------------------------------------------
	boolean exist;
	int range;
	
	// Constructeur -----------------------------------------------------------------------------------
	Bomb(){
		crossable = false;
		color = Color.BLACK;
		coord = new Coord(5,0);
		typeEntity = TypeEntity.BOMB;
		exist = true;
		range = 1;
	}
	
	//Méthode ------------------------------------------------------------------------------------------
	void die(){
		exist = false;
	}
	
	// NON FINI - A Tester et completer
	/*void kill(){
		int i = 0;
		boolean	blockDestructible = false;
		
		//Explosion Nord
		do{
			blockDestructible = checkCoord(0,i);
			if(blockDestructible == true){
				killEntity(Coord(0,i), typeEntity); // coordonnées de l'entitée à détruire et son type
			}
			i++;
		}while(i < range || blockDestructible == true);
		
		//Explosion Est
		i = 0;
		do{
			blockDestructible = checkCoord(i,0);
			if(blockDestructible == true){
				killEntity(Coord(i,0), typeEntity); // coordonnées de l'entitée à détruire et son type
			}
			i++;
		}while(i < range || blockDestructible == true);
		
		//Explosion Sud
		i = 0;
		do{
			blockDestructible = checkCoord(0,-i);
			if(blockDestructible == true){
				killEntity(Coord(0,-i), typeEntity); // coordonnées de l'entitée à détruire et son type
			}
			i++;
		}while(i < range || blockDestructible == true);
		
		//Explosion Ouest
		i = 0;
		do{
			blockDestructible = checkCoord(-i,0);
			if(blockDestructible == true){
				killEntity(Coord(-i,0), typeEntity); // coordonnées de l'entitée à détruire et son type
			}
			i++;
		}while(i < range || blockDestructible == true);
	}*/
		  
	public String toString() {
		return "Bomb [exist=" + exist + ", range=" + range + ", crossable="
				+ crossable + ", color=" + color + ", coord=" + coord
				+ ", typeEntity=" + typeEntity + "]";
	}
}
