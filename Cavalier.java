/** Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * Cette classe d�finit une pi�ce de type cavalier.
 * @author HE201148
 */
public class Cavalier extends Piece {
	/**
	 * Constructeur du cavalier.
	 * @param l : ligne de la pi�ce.
	 * @param c : colonne de la pi�ce.
	 * @param color : couleur de la pi�ce.
	 */
	public Cavalier(int l, int c, String color) {
		super(l, c, "Cavalier", color);
	}
	/**
	 * Cette m�thode renvoie vrai si le cavalier bouge bien soit de deux cases verticales et une horizontale soit l'inverse. Sinon elle renvoie faux.
	 * @param l : ligne d'arriv�e de la pi�ce.
	 * @param c : colonne d'arriv�e de la pi�ce.
	 */
	public boolean deplacement(int l, int c) {
		// V�rification de la positon d'arriv�e �tant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7) && !deplacementNul(l, c)) {
			// On v�rifie bien que le cavalier ne bouge que de deux cases horizontal et une verticale ou l'inverse.
			return ((Math.abs(l-getLigne())) == 2 && (Math.abs(c-getColonne())) == 1) || ((Math.abs(l-getLigne())) == 1 && (Math.abs(c-getColonne())) == 2);
		} else {
			return false;
		}
	}

}
