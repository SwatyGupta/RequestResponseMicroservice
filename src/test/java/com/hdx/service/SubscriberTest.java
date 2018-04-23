package com.hdx.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hdx.model.TransactionRequest;
import com.hdx.model.TransactionResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriberTest {
	@Autowired
	RabbitMQSender rabbitMQSender;
	
	Subscriber subscriber = new Subscriber();
	
@Test
    public void testAdmissionDate() {
		Subscriber spy;
		spy = Mockito.spy(subscriber);
		spy.setRabbitMQSender(rabbitMQSender);
    	TransactionRequest tReq = new TransactionRequest();
    	tReq.setAdmissionDate("22/1/2018");
    	tReq.setPatientFirstName("Div");
    	tReq.setPatientLastName("Mish");
    	tReq.setPayer("Aetna");
    	tReq.setServiceProvider("ILS");
    	tReq.setTransactionDate("22/05/2018");
    	tReq.setTransactionTime("12:12:00");
    	tReq.setTransactionType("NOA");
    	TransactionResponse tRespnse = new TransactionResponse();
    	doReturn(tRespnse).when(spy).instantiateTransactionResponse(); 
    	spy.receivedMessage(tReq); 
        assertEquals("Div",tRespnse.getPatientFirstName());
        assertEquals("Mish",tRespnse.getPatientLastName());
        assertEquals("Aetna",tRespnse.getPayer());
        assertEquals("ILS",tRespnse.getServiceProvider());
        assertEquals("22/1/2018",tRespnse.getAdmissionDate());
        assertEquals("22/05/2018",tRespnse.getTransactionDate());
        assertEquals("12:12:00",tRespnse.getTransactionTime());
        assertEquals("NOA",tRespnse.getTransactionType());
}
	
}
