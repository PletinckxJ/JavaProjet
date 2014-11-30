/** Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe décrit une pièce de type Roi.
 * @author HE201148
 */
public class Roi extends Piece {
	/**
	 * Constructeur du roi.
	 * @param l : ligne de la pièce.
	 * @param c : colonne de la pièce.
	 * @param color : couleur de la pièce.
	 */
	public Roi(int l, int c, String color) {
		super(l, c, "Roi", color);
	}
	/**
	 * Cette méthode renvoie vrai si le roi ne bouge que d'un en ligne, en colonne ou en diagonale, sinon elle renvoie faux.
	 * @param l : ligne d'arrivée de la pièce.
	 * @param c : colonne d'arrivée de la pièce.
	 */
	public boolean deplacement(int l, int c) {
		// Vérification de la positon d'arrivée étant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7)) {
			// On vérifie que le roi ne bouge que d'une case vers le haut ou le bas, vers la gauche ou la droite, ou en diagonale.
			return ((Math.abs(l-getLigne()) == 1) && (c == getColonne())) || ((Math.abs(c-getColonne()) == 1) && (l == getLigne())) || ((Math.abs(l-getLigne()) == 1) && (Math.abs(c-getColonne()) == 1));
		} else {
			return false;
		}
	}

}
