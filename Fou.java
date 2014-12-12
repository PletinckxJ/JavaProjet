/**Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */

package projetJava;

/**
 * Cette classe d�crit une pi�ce de type Fou.
 * @author HE201148
 */
public class Fou extends Piece{
	
	/**
	 * Constructeur du fou.
	 * @param l : ligne de la pi�ce.
	 * @param c : colonne de la pi�ce.
	 * @param color : couleur de la pi�ce.
	 */
	public Fou(int l, int c, String color) {
		super(l, c, "Fou", color);
	}
	
	/**
	 * Cette m�thode renvoie vrai si le d�placement du fou est bien en diagonal (le d�placement en x et y sont les m�mes) sinon elle renvoie faux.
	 * @param l : ligne d'arriv�e de la pi�ce.
	 * @param c : colonne d'arriv�e de la pi�ce.
	 */
	public boolean deplacement(int l, int c) {
		// V�rification de la positon d'arriv�e �tant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7) && !deplacementNul(l, c)) {
			// On v�rifie bien que le d�placement est en diagonale et non horizontal ou vertical.
			return (Math.abs(l-getLigne()) == Math.abs(c-getColonne()));
		} else {
			return false;
		}
	}
	
}
