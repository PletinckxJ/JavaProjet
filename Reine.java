/**Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * Classe qui décrit une pièce de type Reine.
 * @author HE201148
 */
public class Reine extends Piece {
	/**
	 * Constructeur de la reine.
	 * @param l : ligne de la pièce.
	 * @param c : colonne de la pièce.
	 * @param color : couleur de la pièce.
	 */
	public Reine(int l, int c, String color) {
		super(l, c, "Reine", color);
	}
	/**
	 * Méthode renvoyant vrai si la reine bouge bien comme une tour ou comme un fou.
	 * @param l : ligne d'arrivée de la pièce.
	 * @param c : colonne d'arrivée de la pièce. 
	 */
	public boolean deplacement (int l, int c) {
		// Vérification de la positon d'arrivée étant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7) && !deplacementNul(l, c)) {
			// On vérifie bien que la reine suit le comportement du fou ou de la tour.
			return (((l-getLigne())*(c-getColonne()) == 0)) || (Math.abs(l-getLigne()) == Math.abs(c-getColonne()));
		} else {
			return false;
		}
	}

}
