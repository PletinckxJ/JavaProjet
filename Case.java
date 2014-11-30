/**Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe définit une case d'un plateau d'échec.
 * @author HE201148
 */
public class Case {
	/**
	 * Variable définissant la pièce étant sur la case.
	 */
	private Piece piece;
	/**
	 * Constructeur à nul, la case est sans pièce dessus (vide).
	 */
	public Case() {
		setPiece(null);
	}
	/**
	 * Constructeur à variable donnée.
	 * @param p : la pièce étant sur la case au départ.
	 */
	public Case(Piece p ) {
		setPiece(p);
	}
	
	/**
	 * Cette méthode sert à savoir si la case est occupée par une pièce.
	 * @return vrai si la case est occupée, faux sinon.
	 */
	public boolean estPrise() {
		if (piece != null) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Cette méthode renvoie les caractéristiques de la pièce appartenant à la case.
	 * @return la pièce étant sur la case.
	 */
	public Piece getPiece() {
		return piece;
	}
	/**
	 * Cette méthode définit la pièce appartenant à la case.
	 * @param p : la pièce de la case.
	 */
	public void setPiece(Piece p) {
		this.piece = p;
	}
}
