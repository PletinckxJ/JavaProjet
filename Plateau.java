/** Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe d�finit un plateau de jeu d'�chec.
 * @author HE201148
 */
public class Plateau {
	/**
	 * Tableau contenant les 64 cases de l'�chiquier (8 lignes et 8 colonnes).
	 */
	private Case[][] echiquier = new Case[8][8];
	/**
	 * Constructeur � nul.
	 */
	public Plateau() {
		setEchiquier(null);
	}
	/**
	 * Constructeur � variable donn�e.
	 * @param e : le plateau de jeu.
	 */
	public Plateau(Case[][] e) {
		setEchiquier(e);
	}
	/**
	 * M�thode initialisant le plateau de jeu.
	 */
	
	public void initialiser() {
		// initialise les deux rang�es de pions de diff�rentes couleurs.
		for(int i = 0; i < 8; i++) {
		echiquier[1][i] = new Case(new Pion(1, i, "blanc"));
		echiquier[6][i] = new Case(new Pion(6, i, "noir"));
		}
		// Initialise les rang�es de pi�ces sp�ciales dans les deux couleurs.
		for (String couleur="blanc"; !couleur.equals("noir"); couleur = "noir") {
			for (int j = 0; j != 7; j = 7) {
				echiquier[j][0] = new Case(new Tour(j, 0, couleur));
				echiquier[j][1] = new Case(new Cavalier(j, 1, couleur));
				echiquier[j][2] = new Case(new Fou(j, 2, couleur));
				echiquier[j][3] = new Case(new Reine(j, 3, couleur));
				echiquier[j][4] = new Case(new Roi(j, 4, couleur));
				echiquier[j][5] = new Case(new Fou(j, 5, couleur));
				echiquier[j][6] = new Case(new Cavalier(j, 6, couleur));
				echiquier[j][7] = new Case(new Tour(j, 7, couleur));
			}

		}
		

	}
	/**
	 * M�thode se chargeant de dire si le chemin de mouvement de la pi�ce est correct ou non.
	 * @param ligneDep : position de la ligne de d�part.
	 * @param colDep : poisiton de la colonne de d�part.
	 * @param ligneArr : position de la ligne d'arriv�e.
	 * @param colArr : position de la colonne d'arriv�e.
	 * @return vrai si le chemin est possible pour la pi�ce, faux si elle ne peut pas aller � cette case l�.
	 */
	public boolean chemin(int ligneDep, int colDep, int ligneArr, int colArr) {
		Piece depart = echiquier[ligneDep][colDep].getPiece();
		// Tout d'abord on regarde si la case d'arrive est prise ou non et si la pi�ce sur la case d'arriv�e est de m�me couleur ou non
		if (!echiquier[ligneArr][colArr].estPrise() || echiquier[ligneArr][colArr].getPiece().getCouleur() != depart.getCouleur()) { 
			// On v�rifie que ce n'est pas un cavalier car il peut sauter au dessus des pi�ces.
			if(!(depart instanceof Cavalier)) {
				// On v�rifie que la pi�ce n'est pas un pion car si ce n'est pas v�rifi�, le pion va agir comme un roi pour le programme.
				if (!(depart instanceof Pion)) {
					// Variable servant � d�finir dans quel sens le trajet va se faire (avant, arri�re, nul).
					int deplacementY, deplacementX;
					if (ligneArr - ligneDep < 0) {
						deplacementY = -1;
					} else if (ligneArr - ligneDep == 0) {
						deplacementY = 0;
					} else {
						deplacementY = 1;
					}
					if (colArr - colDep < 0) {
						deplacementX = -1;
					} else if (colArr - colDep == 0) {
						deplacementX = 0;
					} else {
						deplacementX = 1;
					}
					// V�rification du chemin
					for(int i = ligneDep + deplacementY, j = colDep + deplacementX; i < ligneArr || j < colArr; i += deplacementY, j += deplacementX) {
						if (echiquier[i][j].estPrise()) {
							return false;
						}
					}
					return true;
						
				} else 
				// Si c'est un pion, on v�rifie que le chemin d'arriv�e est pris ou pas par un pion peu importe sa couleur.
				return !echiquier[ligneArr][colArr].estPrise();
			} else 
			// Le cavalier peut sauter au dessus des pions de son �quipe.
			return true;
		} else 
			// Si la case est prise ou que le pion est de m�me couleur, la m�thode renvoie faux d'office.
			return false;
	}
	/**
	 * M�thode se chargeant de dire si le pion peut prendre la pi�ce en diagonale.
	 * @param ligneDep : position de la ligne de d�part.
	 * @param colDep : poisiton de la colonne de d�part.
	 * @param ligneArr : position de la ligne d'arriv�e.
	 * @param colArr : position de la colonne d'arriv�e.
	 * @return vrai si le pion peut s'emparer de la pi�ce, faux sinon.
	 */
	
	public boolean capturePion(int ligneDep, int colDep, int ligneArr, int colArr) {
		// On regarde que la pi�ce de d�part est bien un pion.
		if (echiquier[ligneDep][colDep].getPiece() instanceof Pion) {
			// On regarde que la pi�ce d'arriv�e existe et est de couleur diff�rente.
			if ((echiquier[ligneArr][colArr].getPiece().getCouleur() != echiquier[ligneDep][colDep].getPiece().getCouleur()) && echiquier[ligneArr][colArr].estPrise()) {
				return true;
				
			} 
			// Sinon retourne faux.
			return false;
		}
		// Sinon retourne faux.
		return false;
	}
	
	/**
	 * M�thode renvoyant le contenu des 64 cases de l'�chiquier.
	 * @return les 64 cases du plateau.
	 */
	public Case[][] getEchiquier() {
		return echiquier;
	}
	/**
	 * M�thode d�finissant les 64 cases de l'�chiquier.
	 * @param e : les 64 cases de l'�chiquier.
	 */
	public void setEchiquier(Case[][] e) {
		echiquier = e;
	}

}
