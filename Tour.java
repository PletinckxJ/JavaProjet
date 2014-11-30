/**Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe définit une pièce de type Tour.
 * @author HE201148
 */
public class Tour extends Piece{
	/**
	 * Constructeur de la tour.
	 * @param l : ligne de la pièce.
	 * @param c : colonne de la pièce.
	 * @param color : couleur de la pièce.
	 */
	public Tour(int l, int c, String color) {
		super(l, c, "Tour", color);
		
	}
	/**
	 * Cette méthode renvoie vrai si le déplacement de la tour n'est qu'en vertical ou qu'en horizontal, si jamais il y a un déplacement dans les deux sens, elle renvoie faux.
	 * @param l : ligne d'arrivée de la pièce.
	 * @param c : colonne d'arrivée de la pièce.
	 */
	public boolean deplacement(int l, int c) {
		// Vérification de la positon d'arrivée étant bien dans le plateau (entre 0 et 7 donc).
		if((0 <= l && l <= 7) && (0 <= c && c <= 7)) {
		// La tour ne se déplace que dans un sens, l'autre déplacement (horizontal ou vertical) se doit d'être 0 donc.
		return ((l-getLigne())*(c-getColonne()) == 0);
		} else {
			return false;
		}
	}
}
