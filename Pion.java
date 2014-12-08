/**Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * Cette classe est la classe d�finissant un pion dans un jeu d'�chec.
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
	 * Cette m�thode renvoie vrai si le pion bouge d'une case ou deux vers l'avant et faux si il ne peut pas ou veut bouger � gauche ou � droite.
	 * @param l : ligne d'arriv�e de la pi�ce.
	 * @param c : colonne d'arriv�e de la pi�ce.
	 */
	public boolean deplacement(int l, int c) {
		// V�rification de la positon d'arriv�e �tant bien dans le plateau (entre 0 et 7 donc) ainsi que le fait que le pion ne se d�place pas horizontalement.
		if((0 <= l && l <= 7) && (0 <= c && c <= 7) && (c-getColonne() == 0) && !deplacementNul(l, c)) {
			// Si le pion est blanc, son d�placement est positif
			if (getCouleur() == "blanc") {
				// On test si le d�placement est de 1, de 2 si il est sur la ligne de d�part et si la ligne est bien au dessus du pion (vers le haut).
				return ((l-getLigne() == -1 || (l-getLigne() == -2 && getLigne() == 6))) && l <= getLigne(); 
			} else {
				// On test si le d�placement est bien vers le bas.
				return (l-getLigne() == 1 || (l-getLigne() == 2 && getLigne() == 1)) && l >= getLigne(); 
			}
		} else {
			return false;
		}
		
	}

}
