/**Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe d�finit une pi�ce de type Tour.
 * @author HE201148
 */
public class Tour extends Piece{
	/**
	 * Constructeur de la tour.
	 * @param l : ligne de la pi�ce.
	 * @param c : colonne de la pi�ce.
	 * @param color : couleur de la pi�ce.
	 */
	public Tour(int l, int c, String color) {
		super(l, c, "Tour", color);
		
	}
	/**
	 * Cette m�thode renvoie vrai si le d�placement de la tour n'est qu'en vertical ou qu'en horizontal, si jamais il y a un d�placement dans les deux sens, elle renvoie faux.
	 * @param l : ligne d'arriv�e de la pi�ce.
	 * @param c : colonne d'arriv�e de la pi�ce.
	 */
	public boolean deplacement(int l, int c) {
		// V�rification de la positon d'arriv�e �tant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7)) {
		// La tour ne se d�place que dans un sens, l'autre d�placement (horizontal ou vertical) se doit d'�tre 0 donc.
		return ((l-getLigne())*(c-getColonne()) == 0);
		} else {
			return false;
		}
	}
}
