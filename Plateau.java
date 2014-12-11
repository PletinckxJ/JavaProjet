/** Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe définit un plateau de jeu d'échec.
 * @author HE201148
 */
public class Plateau {
	/**
	 * Tableau contenant les 64 cases de l'échiquier (8 lignes et 8 colonnes).
	 */
	private Case[][] echiquier = new Case[8][8];
	/**
	 * Constructeur à nul.
	 */
	public Plateau() {
		echiquier = new Case[8][8];
		for (int ligne = 0; ligne <= 7; ligne++)
			for (int colonne = 0; colonne <= 7; colonne++)
				echiquier[ligne][colonne] = new Case();
	}
	/**
	 * Constructeur à variable donnée.
	 * @param e : le plateau de jeu.
	 */
	public Plateau(Case[][] e) {
		setEchiquier(e);
	}
	/**
	 * Méthode initialisant le plateau de jeu.
	 */
	
	public void initialiser() {
		String couleur = new String();
		couleur = "noir";
		// initialise les deux rangées de pions de différentes couleurs.
		for(int i = 0; i < 8; i++) {
		echiquier[1][i].setPiece(new Pion(1, i, "noir"));
		echiquier[6][i].setPiece(new Pion(6, i, "blanc"));
		}
		// Initialise les rangées de pièces spéciales dans les deux couleurs.
		for (int j = 0; j < 8 ; j = j + 7) {
			echiquier[j][0].setPiece(new Tour(j, 0, couleur));
			echiquier[j][1].setPiece(new Cavalier(j, 1, couleur));
			echiquier[j][2].setPiece(new Fou(j, 2, couleur));
			echiquier[j][3].setPiece(new Reine(j, 3, couleur));
			echiquier[j][4].setPiece(new Roi(j, 4, couleur));
			echiquier[j][5].setPiece(new Fou(j, 5, couleur));
			echiquier[j][6].setPiece(new Cavalier(j, 6, couleur));
			echiquier[j][7].setPiece(new Tour(j, 7, couleur));
			couleur = "blanc";
		}
		

	}
	/**
	 * Méthode se chargeant de dire si le chemin de mouvement de la pièce est correct ou non.
	 * @param ligneDep : position de la ligne de départ.
	 * @param colDep : poisiton de la colonne de départ.
	 * @param ligneArr : position de la ligne d'arrivée.
	 * @param colArr : position de la colonne d'arrivée.
	 * @return vrai si le chemin est possible pour la pièce, faux si elle ne peut pas aller à cette case là.
	 */
	public boolean chemin(int ligneDep, int colDep, int ligneArr, int colArr) {
		Piece depart = echiquier[ligneDep][colDep].getPiece();
		// Tout d'abord on regarde si la case d'arrive est prise ou non et si la pièce sur la case d'arrivée est de même couleur ou non
		if ((!echiquier[ligneArr][colArr].estPrise() || echiquier[ligneArr][colArr].getPiece().getCouleur() != depart.getCouleur()) && depart.deplacement(ligneArr, colArr)) { 
			// On vérifie que ce n'est pas un cavalier car il peut sauter au dessus des pièces.
			if(!(depart instanceof Cavalier)) {
				// On vérifie que la pièce n'est pas un pion car si ce n'est pas vérifié, le pion va agir comme un roi pour le programme.
				if (!(depart instanceof Pion)) {
					// Variable servant à définir dans quel sens le trajet va se faire (avant, arrière, nul).
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
					// Vérification du chemin
					for(int i = ligneDep + deplacementY, j = colDep + deplacementX; i < ligneArr || j < colArr; i = i + deplacementY, j = j + deplacementX) {
						if (echiquier[i][j].estPrise()) {
							return false;
						}
					}
					return true;
						
				} else 
				// Si c'est un pion, on vérifie que le chemin d'arrivée est pris ou pas par un pion peu importe sa couleur.
				return !echiquier[ligneArr][colArr].estPrise();
			} else 
			// Le cavalier peut sauter au dessus des pions de son équipe.
			return true;
		} else 
			// Si la case est prise ou que le pion est de même couleur, la méthode renvoie faux d'office.
			return false;
		
	}
	/**
	 * Méthode se chargeant de dire si le pion peut prendre la pièce en diagonale.
	 * @param ligneDep : position de la ligne de départ.
	 * @param colDep : poisiton de la colonne de départ.
	 * @param ligneArr : position de la ligne d'arrivée.
	 * @param colArr : position de la colonne d'arrivée.
	 * @return vrai si le pion peut s'emparer de la pièce, faux sinon.
	 */
	
	public boolean capturePion(int ligneDep, int colDep, int ligneArr, int colArr) {
		// On regarde que la pièce de départ est bien un pion.
		if (echiquier[ligneDep][colDep].getPiece() instanceof Pion) {
			// On regarde si la case d'arrivée est bien prise (pour éviter le null)
			if (echiquier[ligneArr][colArr].estPrise()) {
				// On regarde que la pièce d'arrivée existe et est de couleur différente.
				if (echiquier[ligneArr][colArr].getPiece().getCouleur() != echiquier[ligneDep][colDep].getPiece().getCouleur()) {
					return ((ligneArr - ligneDep) * Math.abs(colArr - colDep)) == (echiquier[ligneDep][colDep].getPiece().getCouleur().equals("blanc") ? -1 : 1);
				} 
				// Sinon retourne faux.
				return false;
			} 
			// Sinon retourne faux.
			return false;
			} else {
				return false;
			}
	}
	
	/**
	 * Méthode renvoyant le contenu des 64 cases de l'échiquier.
	 * @return les 64 cases du plateau.
	 */
	public Case[][] getEchiquier() {
		return echiquier;
	}
	/**
	 * Méthode définissant les 64 cases de l'échiquier.
	 * @param e : les 64 cases de l'échiquier.
	 */
	public void setEchiquier(Case[][] e) {
		echiquier = e;
	}

}