
// 5/10/2018 - Guillaume Bozon
// Classe permettant de gerer les differents types d'objet sur la case
// Version : 1.0.0

import javax.swing.*;
import java.awt.Color;

public abstract class Entity extends JLabel {

	// Attribut ----------------------------------------------------------------------------------------
	boolean crossable;
	Color color;
	Coord coord;
	TypeEntity typeEntity;
	
	//Méthode ------------------------------------------------------------------------------------------
	void die(){
		
	}
}
