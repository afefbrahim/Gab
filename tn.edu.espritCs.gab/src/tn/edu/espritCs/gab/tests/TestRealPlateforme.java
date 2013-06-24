package tn.edu.espritCs.gab.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.gab.dao.ClientDao;
import tn.edu.espritCs.gab.domain.Client;
import tn.edu.espritCs.gab.technical.UtilJdbc;



public class TestRealPlateforme {
	private ClientDao clientDao = new ClientDao();
	@Test
	public void testHetliConnetionMrigle() {
		UtilJdbc utilJdbc = new UtilJdbc();
		utilJdbc.nouveauconnexion();
	}

	@Test
	public void testAddClient() {
		Client client = new Client("541230", "af", "aib", "2356", "555", "afef.ibrahim@gmail.com", "20548963");
		Assert.assertTrue(clientDao.addClient(client));
	}
	@Test
	public void testFindClientByCin() {
		Client client =clientDao.findClientByCin(123);
		Assert.assertEquals("af", client.getNom());
	}
	@Test
	public void testUpdateClient() {
		Client client =clientDao.findClientByCin(22);
		client.setNom("afef");
		client.setPrenom("ibrahim");
		client.setNum_compt("8888");
		client.setNum_tel("11189999");
		client.setEmail("dhouha.ibrahim@gmail.com");
		client.setSolde("95200000");
		Assert.assertTrue(clientDao.updateClient(client));
	}
	@Test
	public void testDeleteClient() {
		
		Assert.assertTrue(clientDao.deleteClient(123));
	}
	
	
}
