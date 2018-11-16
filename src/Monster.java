//5/10/2018 - Julien Laurencin & Marianne Gras
//Classe fille permettant de créer un monstre
//Version : 1.1.0

import java.awt.Color;

public class Monster extends Character {
	
	// Attribut
	// ------------------------------------------------------------------------------------------
	boolean crossable;
	Color color;
	Coord coord;
	boolean alive;
	Coord objectif;
	boolean mode;
	TypeEntity typeEntity;
	boolean tab_danger[][] = new boolean[10][10];
	int tab_chemin[][]= new int[10][10];
	char tab_direction[][]= new char[10][10];
	boolean tab_obstacle[][]= new boolean[10][10];

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
		init_tab_cheminDir();
		
		// Remplis le tab_obstacle et le tab_danger
		for (int x =0; x<10; x++)
		{
			for (int y=0;y<10;y++)
			{
				
				// Pour tab_obstacle, true signifie qu'il y a un obstacle
				if (entitédenotreTabGeneralALAPOS(XY) == TypeEntity.WALL 
						|| entitédenotreTabGeneralALAPOS(XY) == TypeEntity.MONSTER 
						|| entitédenotreTabGeneralALAPOS(XY) == TypeEntity.BOMB
						|| entitédenotreTabGeneralALAPOS(XY) == TypeEntity.BRICK
						|| entitédenotreTabGeneralALAPOS(XY) == TypeEntity.PLAYER)
				{
					tab_obstacle[x][y]=true;
					
				}
				// Pour tab_danger, true signifie qu'il y a un danger
				if (entitédenotreTabGeneralALAPOS(XY) == TypeEntity.DEFLAGRATION 					
						|| entitédenotreTabGeneralALAPOS(XY) == TypeEntity.BOMB)
				{
					tab_danger[x][y]=true;
					
				}
			}
			
		}
		
		// trouver le chemin le plus court vers une zone safe
		
		
	}

	@Override
	public String toString() {
		return "Monster [alive=" + alive + ", crossable=" + crossable
				+ ", color=" + color + ", coord=" + coord + ", typeEntity="
				+ typeEntity + "]";
	}
	
	// Fonction permettant de
	void init_tab_cheminDir()
	{
		for (int x =0; x<10; x++)
		{
			for (int y=0;y<10;y++)
			{
				tab_chemin[x][y]= 0;
				tab_direction[x][y]='0';
				tab_obstacle[x][y]=false;
				tab_danger[x][y]=false;
			}
		}
	}

}
