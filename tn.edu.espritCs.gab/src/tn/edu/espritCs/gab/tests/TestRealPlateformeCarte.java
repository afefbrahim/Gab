package tn.edu.espritCs.gab.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.gab.dao.CarteDao;
import tn.edu.espritCs.gab.domain.Carte;
import tn.edu.espritCs.gab.technical.UtilJdbc;



public class TestRealPlateformeCarte {
	private CarteDao carteDao = new CarteDao();
	@Test
	public void testHetliConnetionMrigle() {
		UtilJdbc utilJdbc = new UtilJdbc();
		utilJdbc.nouveauconnexion();
	}

	@Test
	public void testAddCarte() {
		Carte carte = new Carte(666, 666, "2014-08-03", "2015-04-03", 
				"valide");
		Assert.assertTrue(carteDao.addCarte(carte));
	}
	@Test
	public void testFindCarteByNum() {
		Carte carte =carteDao.findCarteByNum(88);
		Assert.assertEquals(111, carte.getPwd());
	}
	@Test
	public void testUpdateCarte() {
		Carte carte =carteDao.findCarteByNum(144);
		carte.setPwd(18888);
		carte.setDate_validite("2015-03-03");
		carte.setDate_confiscation("2017-03-03");
		carte.setEtat("ttttttttt");
		Assert.assertTrue(carteDao.updateCarte (carte));
	}
	@Test
	public void testDeleteCarte () {
		
		Assert.assertTrue(carteDao.deleteCarte(555));
	}
	
	
}
