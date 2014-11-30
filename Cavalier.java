/** Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 *
 * Cette classe définit une pièce de type cavalier.
 * @author HE201148
 */
public class Cavalier extends Piece {
	/**
	 * Constructeur du cavalier.
	 * @param l : ligne de la pièce.
	 * @param c : colonne de la pièce.
	 * @param color : couleur de la pièce.
	 */
	public Cavalier(int l, int c, String color) {
		super(l, c, "Cavalier", color);
	}
	/**
	 * Cette méthode renvoie vrai si le cavalier bouge bien soit de deux cases verticales et une horizontale soit l'inverse. Sinon elle renvoie faux.
	 * @param l : ligne d'arrivée de la pièce.
	 * @param c : colonne d'arrivée de la pièce.
	 */
	public boolean deplacement(int l, int c) {
		// Vérification de la positon d'arrivée étant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7)) {
			// On vérifie bien que le cavalier ne bouge que de deux cases horizontal et une verticale ou l'inverse.
			return ((Math.abs(l-getLigne())) == 2 && (Math.abs(c-getColonne())) == 1) || ((Math.abs(l-getLigne())) == 1 && (Math.abs(c-getColonne())) == 2);
		} else {
			return false;
		}
	}

}
