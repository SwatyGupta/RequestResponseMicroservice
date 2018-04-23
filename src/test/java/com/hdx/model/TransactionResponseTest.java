package com.hdx.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.hdx.model.TransactionResponse;

public class TransactionResponseTest {

        
    @Test
    public void testGetTransactionDate() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setTransactionDate("20/04/2018");
        assertTrue(tResp.getTransactionDate() == "20/04/2018");
    }
    
    @Test
    public void testGetTransactionDate2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setTransactionDate("17/04/2018");
        assertFalse(tResp.getTransactionDate() == "18/04/2018");
    }
    
    @Test
    public void testGetTransactionTime() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setTransactionTime("8:02pm");
        assertTrue(tResp.getTransactionTime() == "8:02pm");
    }
    
    @Test
    public void testGetTransactionTime2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setTransactionTime("6:02am");
        assertFalse(tResp.getTransactionTime() == "8:04pm");
    }
    
    @Test
    public void testGetTransactionType() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setTransactionType("Noa");
        assertTrue(tResp.getTransactionType() == "Noa");
    }
    
    @Test
    public void testGetTransactionType2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setTransactionType("Noa2");
        assertFalse(tResp.getTransactionType() == "Noa3");
    }
    
    @Test
    public void testGetpatientFirstName() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setPatientFirstName("PatientFName");
        assertTrue(tResp.getPatientFirstName() == "PatientFName");
    }
    
    @Test
    public void testGetpatientFirstName2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setPatientFirstName("PatientFName2");
        assertFalse(tResp.getPatientFirstName() == "PatientFName3");
    }
    
    @Test
    public void testGetpatientLastName() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setPatientLastName("PatientLName");
        assertTrue(tResp.getPatientLastName() == "PatientLName");
    } 
    
    @Test
    public void testGetpatientLastName2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setPatientLastName("PatientLName2");
        assertFalse(tResp.getPatientLastName() == "PatientLName3");
    }
    
    @Test
    public void testGetPayer() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setPayer("Aetna");
        assertTrue(tResp.getPayer() == "Aetna");
    } 

    @Test
    public void testGetPayer2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setPayer("AetnaCommercial");
        assertFalse(tResp.getPayer() == "AetnaHmo");
    }
  
    
    @Test
    public void testGetServiceProvider() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setServiceProvider("EMHealthSystem");
        assertTrue(tResp.getServiceProvider() == "EMHealthSystem");
    }
    
    @Test
    public void testGetServiceProvider2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setServiceProvider("Cigna");
        assertFalse(tResp.getServiceProvider() == "Downtown");
    }
    
    @Test
    public void testGetAdmissionDate() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setAdmissionDate("13th Feb,18");
        assertTrue(tResp.getAdmissionDate() == "13th Feb,18");
    }
    
    @Test
    public void testGetAdmissionDate2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setAdmissionDate("15th Feb,18");
        assertFalse(tResp.getAdmissionDate() == "14th Feb,18");
    }
    
    @Test
    public void testGetFacilityTypeCode() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setFacilityTypeCode("1111");
        assertTrue(tResp.getFacilityTypeCode() == "1111");
    } 
    
    @Test
    public void testGetFacilityTypeCode2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setFacilityTypeCode("11111");
        assertFalse(tResp.getFacilityTypeCode() == "11112");
    }

    @Test
    public void testGetCertificationActionCode() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setCertificationActionCode("1112");
        assertTrue(tResp.getCertificationActionCode() == "1112");
    }
    
    @Test
    public void testGetCertificationActionCode2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setCertificationActionCode("11112");
        assertFalse(tResp.getCertificationActionCode() == "11113");
    }
    
    @Test
    public void testGetReviewIdentificationNumber() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setReviewIdentificationNumber("1113");
        assertTrue(tResp.getReviewIdentificationNumber() == "1113");
    }
    
    @Test
    public void testGetReviewIdentificationNumber2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setReviewIdentificationNumber("11113");
        assertFalse(tResp.getReviewIdentificationNumber() == "11114");
    }
    
    @Test
    public void testGetReviewDecisionReasonCode() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setReviewDecisionReasonCode("1114");
        assertTrue(tResp.getReviewDecisionReasonCode() == "1114");
    }
    
    @Test
    public void testGetReviewDecisionReasonCode2() {
    	TransactionResponse tResp = new TransactionResponse();
		tResp.setReviewDecisionReasonCode("11114");
        assertFalse(tResp.getReviewDecisionReasonCode() == "11115");
    }
}
