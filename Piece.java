/** Classe créée par le groupe de Thomas Pické et Julien Pletinckx pour le projet de java 
 * 
 */

package projetJava;

/**
 * Cette classe est une classe pièce servant à définir les caractéristiques principales de chaque pièce d'un jeu d'échec.
 * @author HE201148
 */
public abstract class Piece {
	
	/**
	 * Cette variable est la variable qui définit sur quelle ligne est positionnée la pièce.
	 */
	private int ligne;
	
	/**
	 * Cette variable est la variable qui définit sur quelle colonne est positionnée la pièce.
	 */
	private int colonne;
	
	/**
	 * Cette variable est le nom de la pièce (type).
	 */
	private String nom;
	
	/**
	 * Cette variable est la couleur de la pièce.
	 */
	private String couleur;
	
	/**
	 * Constructeur à nul.
	 */
	public Piece() {
		setLigne(0);
		setColonne(0);
		setNom("");
		setCouleur("");
	}
	
	/**
	 * Constructeur à variables données.
	 * @param l : numéro de la ligne.
	 * @param c : numéro de la colonne.
	 * @param n : nom de la pièce.
	 * @param coul : couleur de la pièce.
	 */
	public Piece(int l, int c, String n, String coul) {
		setLigne(l);
		setColonne(c);
		setNom(n);
		setCouleur(coul);
	}
	
	/**
	 * Méthode abstraite de déplacement de la pièce.
	 * @param l : ligne d'arrivée de la pièce.
	 * @param c : colonne d'arrivée de la pièce.
	 * @return : vrai ou faux si le déplacement est possible ou non.
	 */
	abstract boolean deplacement(int l, int c);
	
	public boolean deplacementNul(int l, int c) {
		return (l == getLigne() && c == getColonne());
	}
	
	/**
	 * Méthode renvoyant la valeur de ligne.
	 * @return numéro de la ligne sur laquelle est la pièce.
	 */
	public int getLigne() {
		return ligne;
	}
	
	/**
	 * Méthode servant à définir la valeur de la ligne.
	 * @param l : numéro de la ligne sur laquelle est la pièce (0 =< c >= 7).
	 */
	public void setLigne(int l) {
		this.ligne = l;
	}
	
	/**
	 * Méthode renvoyant la valeur de colonne.
	 * @return numéro de la colonne sur laquelle est la pièce.
	 */
	public int getColonne() {
		return colonne;
	}
	
	/**
	 * Méthode servant à définir le numéro de la colonne.
	 * @param l : numéro de la colonne sur laquelle est la pièce (0 =< c >= 7).
	 */
	public void setColonne(int c) {
		this.colonne = c;
	}
	
	/**
	 * Méthode renvoyant le nom de la pièce.
	 * @return : le nom de la pièce.
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Méthode définissant la valeur du nom de la pièce.
	 * @param n : nom de la pièce.
	 */
	public void setNom(String n) {
		this.nom = n;
	}
	
	/**
	 * Méthode renvoyant la couleur de la pièce.
	 * @return la couleur de la pièce.
	 */
	public String getCouleur() {
		return couleur;
	}
	
	/**
	 * Méthode définissant la valeur de la couleur de la pièce.
	 * @param c : la couleur de la pièce.
	 */
	public void setCouleur(String c) {
		if ((c == "noir") || (c == "blanc")) {
			this.couleur = c;
		}
	}

}
