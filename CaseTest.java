package projetJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaseTest {

	@Test
	public void test() {
		Piece piece1 = new Pion(0, 0, "blanc");
		Case case1 = new Case(piece1);
		Case case2 = new Case();
		assertEquals(true, case1.estPrise());
		assertEquals(false, case2.estPrise());
		
		
		Cavalier cavalier1 = new Cavalier(0, 0, "blanc");
		Cavalier cavalier2 = new Cavalier(4, 2, "blanc");
		assertEquals(true, cavalier1.deplacement(1, 2));
		assertEquals(false, cavalier1.deplacement(-1, -2));
		assertEquals(true, cavalier2.deplacement(5, 4));
		assertEquals(false, cavalier2.deplacement(1, 2));
		assertEquals(false, cavalier1.deplacement(0, 0));
		assertEquals(false, cavalier2.deplacement(4, 2));
		assertEquals(true, cavalier2.deplacement(2, 1));
		assertEquals(true, cavalier1.deplacementNul(0, 0));
		assertEquals(false, cavalier1.deplacementNul(1, 1));
		
		
		Fou fou1 = new Fou(0, 0, "blanc");
		Fou fou2 = new Fou(4, 2, "noir");
		assertEquals(true, fou1.deplacement(4, 4));
		assertEquals(false, fou1.deplacement(0, 0));
		assertEquals(false, fou1.deplacement(0, 1));
		assertEquals(false, fou1.deplacement(1, 0));
		assertEquals(false, fou1.deplacement(2, 4));
		assertEquals(true, fou2.deplacement(3, 1));
		assertEquals(false, fou2.deplacement(4, 2));
		assertEquals(false, fou1.deplacement(-4, -4));
		assertEquals(true, fou1.deplacementNul(0, 0));
		assertEquals(false, fou1.deplacementNul(1, 1));
		
		
		Pion pion1 = new Pion(6, 3, "blanc");
		Pion pion2 = new Pion(1, 4, "noir");
		assertEquals(true, pion1.deplacement(4, 3));
		assertEquals(true, pion1.deplacement(5, 3));
		assertEquals(false, pion1.deplacement(3, 3));
		assertEquals(false, pion1.deplacement(4, 2));
		assertEquals(false, pion1.deplacement(7, 3));
		assertEquals(false, pion1.deplacement(6, 3));
		assertEquals(true, pion2.deplacement(2, 4));
		assertEquals(true, pion2.deplacement(3, 4));
		assertEquals(false, pion2.deplacement(1, 4));
		assertEquals(false, pion2.deplacement(0, 4));
		assertEquals(false, pion2.deplacement(4, 4));
		assertEquals(false, pion2.deplacement(2, 3));
		assertEquals(false, pion2.deplacement(-1, 4));
		assertEquals(true, pion1.deplacementNul(6, 3));
		assertEquals(false, pion1.deplacementNul(1, 1));
		
		
		Reine reine = new Reine(0, 0, "blanc");
		assertEquals(true, reine.deplacement(0, 6));
		assertEquals(true, reine.deplacement(6, 6));
		assertEquals(true, reine.deplacement(6, 0));
		assertEquals(false, reine.deplacement(0, 0));
		assertEquals(false, reine.deplacement(1, 6));
		assertEquals(false, reine.deplacement(6, 1));
		assertEquals(false, reine.deplacement(-1, -1));
		assertEquals(true, reine.deplacementNul(0, 0));
		assertEquals(false, reine.deplacementNul(1, 1));
		
		
		Roi roi = new Roi(4, 3, "noir");
		assertEquals(true, roi.deplacement(4, 2));
		assertEquals(true, roi.deplacement(4, 4));
		assertEquals(true, roi.deplacement(5, 3));
		assertEquals(true, roi.deplacement(3, 3));
		assertEquals(true, roi.deplacement(5, 4));
		assertEquals(true, roi.deplacement(3, 2));
		assertEquals(true, roi.deplacement(5, 2));
		assertEquals(true, roi.deplacement(3, 4));
		assertEquals(false, roi.deplacement(4, 3));
		assertEquals(false, roi.deplacement(6, 3));
		assertEquals(false, roi.deplacement(2, 3));
		assertEquals(false, roi.deplacement(4, 1));
		assertEquals(false, roi.deplacement(4, 6));
		assertEquals(false, roi.deplacement(6, 1));
		assertEquals(false, roi.deplacement(0, 7));
		assertEquals(false, roi.deplacement(7, 7));
		assertEquals(false, roi.deplacement(0, 0));
		assertEquals(true, roi.deplacementNul(4, 3));
		assertEquals(false, roi.deplacementNul(1, 1));
		
		
		Tour tour = new Tour(2, 5, "blanc");
		assertEquals(true, tour.deplacement(0, 5));
		assertEquals(true, tour.deplacement(1, 5));
		assertEquals(true, tour.deplacement(5, 5));
		assertEquals(true, tour.deplacement(2, 7));
		assertEquals(true, tour.deplacement(2, 6));
		assertEquals(true, tour.deplacement(2, 0));
		assertEquals(false, tour.deplacement(2, 5));
		assertEquals(false, tour.deplacement(3, 6));
		assertEquals(false, tour.deplacement(1, 4));
		assertEquals(false, tour.deplacement(4, 6));
		assertEquals(true, tour.deplacementNul(2, 5));
		assertEquals(false, tour.deplacementNul(1, 1));
		
		
		Plateau p = new Plateau();
		p.initialiser();
		assertEquals(true, p.chemin(1, 1, 2, 1));
		assertEquals(true, p.chemin(1, 1, 3, 1));
		assertEquals(false, p.chemin(1, 1, 4, 1)); 
		assertEquals(true, p.chemin(0, 1, 2, 0));
		assertEquals(false, p.chemin(0, 0, 4, 0));
		assertEquals(false, p.chemin(0, 0, 1, 0));
		assertEquals(false, p.chemin(0, 0, 0, 0));
		p.getEchiquier()[2][2].setPiece(new Tour(2, 2, "blanc"));
		assertEquals(false, p.chemin(1, 2, 2, 2));
		assertEquals(false, p.chemin(1, 1, 2, 2));
		assertEquals(true, p.chemin(6, 2, 5, 2));
		assertEquals(true, p.chemin(6, 2, 4, 2));
		p.getEchiquier()[4][0].setPiece(new Pion(4, 0, "blanc"));
		assertEquals(true, p.chemin(4, 0, 3, 0));
		assertEquals(false, p.chemin(4, 0, 2, 0));
		assertEquals(false, p.chemin(4, 0, 5, 0));
		p.getEchiquier()[2][3].setPiece(new Pion(2, 3, "blanc"));
		assertEquals(true, p.capturePion(2, 3, 1, 2));
		assertEquals(true, p.capturePion(2, 3, 1, 4));
		assertEquals(true, p.capturePion(1, 2, 2, 3));
		assertEquals(true, p.capturePion(1, 4, 2, 3));
		assertEquals(false, p.capturePion(2, 3, 1, 3));
		assertEquals(false, p.capturePion(1, 3, 2, 3));
		p.getEchiquier()[2][3].setPiece(new Pion(2, 3, "noir"));
		assertEquals(false, p.capturePion(2, 3, 1, 2));
		assertEquals(false, p.capturePion(2, 3, 1, 4));
		assertEquals(false, p.capturePion(1, 2, 2, 3));
		assertEquals(false, p.capturePion(1, 4, 2, 3));
		assertEquals(false, p.capturePion(2, 3, 1, 3));
		assertEquals(false, p.capturePion(1, 3, 2, 3));
	}

}
