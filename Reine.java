/**Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Classe qui d�crit une pi�ce de type Reine.
 * @author HE201148
 */
public class Reine extends Piece {
	/**
	 * Constructeur de la reine.
	 * @param l : ligne de la pi�ce.
	 * @param c : colonne de la pi�ce.
	 * @param color : couleur de la pi�ce.
	 */
	public Reine(int l, int c, String color) {
		super(l, c, "Reine", color);
	}
	/**
	 * M�thode renvoyant vrai si la reine bouge bien comme une tour ou comme un fou.
	 * @param l : ligne d'arriv�e de la pi�ce.
	 * @param c : colonne d'arriv�e de la pi�ce. 
	 */
	public boolean deplacement (int l, int c) {
		// V�rification de la positon d'arriv�e �tant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7)) {
			// On v�rifie bien que la reine suit le comportement du fou ou de la tour.
			return (((l-getLigne())*(c-getColonne()) == 0)) || (Math.abs(l-getLigne()) == Math.abs(c-getColonne()));
		} else {
			return false;
		}
	}

}
