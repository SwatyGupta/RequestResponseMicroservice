package com.hdx.service;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.hdx.model.TransactionRequest;
import com.hdx.model.TransactionResponse;


public class RabbitMQSenderTest {
	
	RabbitMQSender rabbitMQSender  = new RabbitMQSender();
	
	TransactionResponse tReq = new TransactionResponse();
	
	 @Test
    public void rabbitTemplate() {
		 RabbitTemplate amqpTemplate = Mockito.mock(RabbitTemplate.class);
		 RabbitMQSender spy;
		 spy = Mockito.spy(rabbitMQSender);
		 spy.setAmqpTemplate(amqpTemplate);
		 spy.send(tReq);
		 verify(spy, times(1)).send(tReq);
    }

}
