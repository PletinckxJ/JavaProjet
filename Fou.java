/**Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe décrit une pièce de type Fou.
 * @author HE201148
 */
public class Fou extends Piece{
	/**
	 * Constructeur du fou.
	 * @param l : ligne de la pièce.
	 * @param c : colonne de la pièce.
	 * @param color : couleur de la pièce.
	 */
	public Fou(int l, int c, String color) {
		super(l, c, "Fou", color);
	}
	/**
	 * Cette méthode renvoie vrai si le déplacement du fou est bien en diagonal (le déplacement en x et y sont les mêmes) sinon il renvoie faux.
	 * @param l : ligne d'arrivée de la pièce.
	 * @param c : colonne d'arrivée de la pièce.
	 */
	public boolean deplacement(int l, int c) {
		// Vérification de la positon d'arrivée étant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7)) {
			// On vérifie bien que le déplacement est en diagonale et non horizontal ou vertical.
			return (Math.abs(l-getLigne()) == Math.abs(c-getColonne()));
		} else {
			return false;
		}
	}
}
