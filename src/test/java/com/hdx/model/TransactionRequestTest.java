package com.hdx.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.hdx.model.TransactionRequest;

public class TransactionRequestTest {

    
	@Test
    public void testGetTransacDateTime() {
    	TransactionRequest tResp = new TransactionRequest();
		tResp.setTransactionDate("21/12/2017 8:02pm");
        assertTrue(tResp.getTransactionDate() == "21/12/2017 8:02pm");
    }
    
    @Test
    public void testGetTransacDateTime2() {
    	TransactionRequest tResp = new TransactionRequest();
		tResp.setTransactionDate("11/12/2017 8:02pm");
        assertFalse(tResp.getTransactionDate() == "21/12/2017 8:03pm");
    }
    
    @Test
    public void testGetTransacTime() {
    	TransactionRequest tResp = new TransactionRequest();
		tResp.setTransactionTime("8:02pm");
        assertTrue(tResp.getTransactionTime() == "8:02pm");
    }
    
    @Test
    public void testGetTransacTime2() {
    	TransactionRequest tResp = new TransactionRequest();
		tResp.setTransactionTime("4:02am");
        assertFalse(tResp.getTransactionTime() == "8:02pm");
    }
    
    @Test
    public void testGetTransacType() {
    	TransactionRequest tResp = new TransactionRequest();
		tResp.setTransactionType("Noa");
        assertTrue(tResp.getTransactionType() == "Noa");
    }
    
    @Test
    public void testGetTransacType2() {
    	TransactionRequest tResp = new TransactionRequest();
		tResp.setTransactionType("Noa2");
        assertFalse(tResp.getTransactionType() == "Noa3");
    }
    
    @Test
    public void testGetpatientFirstName() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setPatientFirstName("PatientFName");
        assertTrue(tResp.getPatientFirstName() == "PatientFName");
    }
    
    @Test
    public void testGetpatientFirstName2() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setPatientFirstName("PatientFName");
        assertFalse(tResp.getPatientFirstName() == "PatientFName2");
    }
    
    @Test
    public void testGetpatientLastName() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setPatientLastName("PatientLName");
        assertTrue(tResp.getPatientLastName() == "PatientLName");
    } 
    
    @Test
    public void testGetpatientLastName2() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setPatientLastName("PatientLName");
        assertFalse(tResp.getPatientLastName() == "PatientLName2");
    }
    
    @Test
    public void testGetPayer() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setPayer("Aetna");
        assertTrue(tResp.getPayer() == "Aetna");
    } 
    
    @Test
    public void testGetPayer2() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setPayer("Aetna");
        assertFalse(tResp.getPayer() == "AetnaHMO");
    }

    
    @Test
    public void testGetServiceProvider() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setServiceProvider("EMHealthSystem");
        assertTrue(tResp.getServiceProvider() == "EMHealthSystem");
    }
    
    @Test
    public void testGetServiceProvider2() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setServiceProvider("EMHealthSystem");
        assertFalse(tResp.getServiceProvider() == "Downtown");
    }
    
    @Test
    public void testGetAdmissionDate() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setAdmissionDate("13th Feb,18");
        assertTrue(tResp.getAdmissionDate() == "13th Feb,18");
    }
    
    @Test
    public void testGetAdmissionDate2() {
     	TransactionRequest tResp = new TransactionRequest();
		tResp.setAdmissionDate("13th Feb,18");
        assertFalse(tResp.getAdmissionDate() == "14th Feb,18");
    }
    
 
    
}
