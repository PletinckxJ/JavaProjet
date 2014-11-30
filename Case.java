/**Cette classe a �t� cr��e pour le projet de java par T.Pick� et J.Pletinckx.
 * 
 */
package projetJava;

/**
 * 
 * Cette classe d�finit une case d'un plateau d'�chec.
 * @author HE201148
 */
public class Case {
	/**
	 * Variable d�finissant la pi�ce �tant sur la case.
	 */
	private Piece piece;
	/**
	 * Constructeur � nul, la case est sans pi�ce dessus (vide).
	 */
	public Case() {
		setPiece(null);
	}
	/**
	 * Constructeur � variable donn�e.
	 * @param p : la pi�ce �tant sur la case au d�part.
	 */
	public Case(Piece p ) {
		setPiece(p);
	}
	
	/**
	 * Cette m�thode sert � savoir si la case est occup�e par une pi�ce.
	 * @return vrai si la case est occup�e, faux sinon.
	 */
	public boolean estPrise() {
		if (piece != null) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Cette m�thode renvoie les caract�ristiques de la pi�ce appartenant � la case.
	 * @return la pi�ce �tant sur la case.
	 */
	public Piece getPiece() {
		return piece;
	}
	/**
	 * Cette m�thode d�finit la pi�ce appartenant � la case.
	 * @param p : la pi�ce de la case.
	 */
	public void setPiece(Piece p) {
		this.piece = p;
	}
}
