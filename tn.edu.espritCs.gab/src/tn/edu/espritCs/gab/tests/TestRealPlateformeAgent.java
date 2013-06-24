package tn.edu.espritCs.gab.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.gab.dao.AgentDao;
import tn.edu.espritCs.gab.domain.Agent;
import tn.edu.espritCs.gab.technical.UtilJdbc;



public class TestRealPlateformeAgent {
	private AgentDao agentDao = new AgentDao();
	@Test
	public void testHetliConnetionMrigle() {
		UtilJdbc utilJdbc = new UtilJdbc();
		utilJdbc.nouveauconnexion();
	}

	@Test
	public void testAddAgent() {
		Agent agent = new Agent("444", "dadou", "ibr", "2356", "555");
		Assert.assertTrue(agentDao.addAgent(agent));
	}
	@Test
	public void testFindAgentByCin() {
		Agent agent =agentDao.findAgentByCin("777");
		Assert.assertEquals("dddd", agent.getNom());
	}
	@Test
	public void testUpdateAgent() {
		Agent agent =agentDao.findAgentByCin("777");
		agent.setNom("mam");
		agent.setPrenom("aib");
		agent.setLogin("222");
		agent.setPwd("111");
		Assert.assertTrue(agentDao.updateAgent(agent));
	}
	@Test
	public void testDeleteAgent() {
		
		Assert.assertTrue(agentDao.deleteAgent("444"));
	}
	
	
}
