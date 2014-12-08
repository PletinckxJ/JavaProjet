/** Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * Cette classe d�crit une pi�ce de type Roi.
 * @author HE201148
 */
public class Roi extends Piece {
	/**
	 * Constructeur du roi.
	 * @param l : ligne de la pi�ce.
	 * @param c : colonne de la pi�ce.
	 * @param color : couleur de la pi�ce.
	 */
	public Roi(int l, int c, String color) {
		super(l, c, "Roi", color);
	}
	/**
	 * Cette m�thode renvoie vrai si le roi ne bouge que d'un en ligne, en colonne ou en diagonale, sinon elle renvoie faux.
	 * @param l : ligne d'arriv�e de la pi�ce.
	 * @param c : colonne d'arriv�e de la pi�ce.
	 */
	public boolean deplacement(int l, int c) {
		// V�rification de la positon d'arriv�e �tant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7) && !deplacementNul(l, c)) {
			// On v�rifie que le roi ne bouge que d'une case vers le haut ou le bas, vers la gauche ou la droite, ou en diagonale.
			return ((Math.abs(l-getLigne()) == 1) && (c == getColonne())) || ((Math.abs(c-getColonne()) == 1) && (l == getLigne())) || ((Math.abs(l-getLigne()) == 1) && (Math.abs(c-getColonne()) == 1));
		} else {
			return false;
		}
	}

}
