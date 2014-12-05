/** Classe cr��e par le groupe de Thomas Pick� et Julien Pletinckx pour le projet de java 
 * 
 */
package projetJava;

/**
 * 
 *	Cette classe est une classe pi�ce servant � d�finir les caract�ristiques principales de chaque pi�ce d'un jeu d'�chec.
 * @author HE201148
 */
public abstract class Piece {
	/**
	 * Cette variable est la variable qui d�finit sur quelle ligne est positionn�e la pi�ce.
	 */
	private int ligne;
	/**
	 * Cette variable est la variable qui d�finit sur quelle colonne est positionn�e la pi�ce.
	 */
	private int colonne;
	/**
	 * Cette variable est le nom de la pi�ce (type).
	 */
	private String nom;
	/**
	 * Cette variable est la couleur de la pi�ce.
	 */
	private String couleur;
	/**
	 * Constructeur � nul.
	 */
	public Piece() {
		setLigne(0);
		setColonne(0);
		setNom("");
		setCouleur("");
	}
	/**
	 * Constructeur � variables donn�es.
	 * @param l : num�ro de la ligne.
	 * @param c : num�ro de la colonne.
	 * @param n : nom de la pi�ce.
	 * @param coul : couleur de la pi�ce.
	 */
	public Piece(int l, int c, String n, String coul) {
		setLigne(l);
		setColonne(c);
		setNom(n);
		setCouleur(coul);
	}
	/**
	 * M�thode abstraite de d�placement de la pi�ce.
	 * @param l : ligne d'arriv�e de la pi�ce.
	 * @param c : colonne d'arriv�e de la pi�ce.
	 * @return : vrai ou faux si le d�placement est possible ou non.
	 */
	abstract boolean deplacement(int l, int c);
	/**
	 * M�thode renvoyant la valeur de ligne.
	 * @return num�ro de la ligne sur laquelle est la pi�ce.
	 */
	public int getLigne() {
		return ligne;
	}
	/**
	 * M�thode servant � d�finir la valeur de la ligne.
	 * @param l : num�ro de la ligne sur laquelle est la pi�ce (0 =< c >= 7).
	 */
	public void setLigne(int l) {
		this.ligne = l;
	}
	/**
	 * M�thode renvoyant la valeur de colonne.
	 * @return num�ro de la colonne sur laquelle est la pi�ce.
	 */
	public int getColonne() {
		return colonne;
	}
	/**
	 * M�thode servant � d�finir le num�ro de la colonne.
	 * @param c : num�ro de la colonne sur laquelle est la pi�ce (0 =< c >= 7).
	 */
	public void setColonne(int c) {
		this.colonne = c;
	}
	/**
	 * M�thode renvoyant le nom de la pi�ce.
	 * @return : le nom de la pi�ce.
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * M�thode d�finissant la valeur du nom de la pi�ce.
	 * @param n : nom de la pi�ce.
	 */
	public void setNom(String n) {
		this.nom = n;
	}
	/**
	 * M�thode renvoyant la couleur de la pi�ce.
	 * @return la couleur de la pi�ce.
	 */
	public String getCouleur() {
		return couleur;
	}
	/**
	 * M�thode d�finissant la valeur de la couleur de la pi�ce.
	 * @param c : la couleur de la pi�ce.
	 */
	public void setCouleur(String c) {
		if ((c == "noir") || (c == "blanc")) {
			this.couleur = c;
		}
	}

}
