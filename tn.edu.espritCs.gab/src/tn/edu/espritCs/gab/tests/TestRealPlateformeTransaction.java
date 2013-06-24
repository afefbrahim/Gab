package tn.edu.espritCs.gab.tests;

import junit.framework.Assert;

import org.junit.Test;

import tn.edu.espritCs.gab.dao.TransactionDao;
import tn.edu.espritCs.gab.domain.Transaction;
import tn.edu.espritCs.gab.technical.UtilJdbc;



public class TestRealPlateformeTransaction {
	private TransactionDao transactionDao = new TransactionDao();
	@Test
	public void testHetliConnetionMrigle() {
		UtilJdbc utilJdbc = new UtilJdbc();
		utilJdbc.nouveauconnexion();
	}

	@Test
	public void testAddTransaction() {
		Transaction transaction = new Transaction(777,"Depot", "77777", "2009/01/08 10:40:01");
		Assert.assertTrue(transactionDao.addTransaction(transaction));
	}
	@Test
	public void testFindTransactionById() {
		Transaction transaction =transactionDao.findTransactionById(9291761);
		Assert.assertEquals("Depot", transaction.getType());
	}
	@Test
	public void testUpdateTransaction() {
		Transaction transaction =transactionDao.findTransactionById(9291761);
		transaction.setType("Ok");
		transaction.setSolde("85201");
		transaction.setDate("2001/01/11");

		Assert.assertTrue(transactionDao.updateTransaction(transaction));
	}
	@Test
	public void testDeleteTransaction() {
		
		Assert.assertTrue(transactionDao.deleteTransaction(9291761));
	}
	
	
}
