package tn.edu.espritCs.gab.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.gab.dao.GabDao;
import tn.edu.espritCs.gab.domain.Gab;
import tn.edu.espritCs.gab.technical.UtilJdbc;



public class TestRealPlateformeGab {
	private GabDao gabDao = new GabDao();
	@Test
	public void testHetliConnetionMrigle() {
		UtilJdbc utilJdbc = new UtilJdbc();
		utilJdbc.nouveauconnexion();
	}

	@Test
	public void testAddGab() {
		Gab gab = new Gab("dhou", "77777");
		Assert.assertTrue(gabDao.addGab(gab));
	}
	@Test
	public void testFindGabById() {
		Gab gab =gabDao.findGabById(1);
		Assert.assertEquals("dhou", gab.getNom());
	}
	@Test
	public void testUpdateGab() {
		Gab gab =gabDao.findGabById(2);
		gab.setNom("dadou");
		gab.setSolde("85201");

		Assert.assertTrue(gabDao.updateGab(gab));
	}
	@Test
	public void testDeleteGab() {
		
		Assert.assertTrue(gabDao.deleteGab(7));
	}
	
	
}
