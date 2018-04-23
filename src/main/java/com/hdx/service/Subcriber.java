package com.hdx.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hdx.model.TransactionRequest;
import com.hdx.model.TransactionResponse;

@Component
public class Subcriber {

	@Autowired
	RabbitMQSender rabbitMQSender;
	
	@RabbitListener(queues="${noa.rabbitmq.queue}")
    public void recievedMessage(TransactionRequest request) {
        System.out.println("Recieved Message: " + request);
        
        TransactionResponse response=new TransactionResponse();
        response.setTransactionDate(request.getTransactionDate());
        response.setTransactionTime(request.getTransactionTime());
        response.setTransactionType(request.getTransactionType());
        response.setPatientFirstName(request.getPatientFirstName());
        response.setPatientLastName(request.getPatientLastName());
        response.setPayer(request.getPayer());
        response.setServiceProvider(request.getServiceProvider());
        response.setAdmissionDate(request.getAdmissionDate());
        response.setFacilityTypeCode("21");
        response.setReviewDecisionReasonCode("AH65435237");
        response.setReviewIdentificationNumber("8765430200");
        response.setCertificationActionCode("A6");
    	rabbitMQSender.send(response);
    }
}