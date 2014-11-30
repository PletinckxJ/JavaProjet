/**Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe est la classe définissant un pion dans un jeu d'échec.
 * @author HE201148
 */
public class Pion extends Piece {
	/**
	 * Constructeur du pion.
	 * @param l : position sur une ligne.
	 * @param c : position sur la colonne.
	 * @param color : couleur du pion.
	 */
	public Pion(int l, int c, String color) {
		super(l, c, "Pion", color );
	}
	/**
	 * Cette méthode renvoie vrai si le pion bouge d'une case ou deux vers l'avant et faux si il ne peut pas ou veut bouger à gauche ou à droite.
	 * @param l : ligne d'arrivée de la pièce.
	 * @param c : colonne d'arrivée de la pièce.
	 */
	public boolean deplacement(int l, int c) {
		// Vérification de la positon d'arrivée étant bien dans le plateau (entre 0 et 7 donc) ainsi que le fait que le pion ne se déplace pas horizontalement.
		if((0 <= l && l <= 7) && (0 <= c && c <= 7) && (c-getColonne() == 0)) {
			// Si le pion est blanc, son déplacement est positif
			if (getCouleur() == "blanc") {
				// On test si le déplacement est de 1, de 2 si il est sur la ligne de départ et si la ligne est bien au dessus du pion (vers le haut).
				return (l-getLigne() == 1 || (l-getLigne() == 2 && getLigne() == 1)) && l >= getLigne(); 
			} else {
				// On test si le déplacement est bien vers le bas.
				return (l-getLigne() == -1 || (l-getLigne() == -2 && getLigne() == 6)) && l <= getLigne(); 
			}
		} else {
			return false;
		}
		
	}

}
