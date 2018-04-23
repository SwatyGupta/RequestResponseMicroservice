package com.hdx.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hdx.model.TransactionResponse;

@Component
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public AmqpTemplate getAmqpTemplate() {
		return amqpTemplate;
	}

	public void setAmqpTemplate(AmqpTemplate amqpTemplate) {
		this.amqpTemplate = amqpTemplate;
	}
	
	@Value("${response.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${response.rabbitmq.routingkey}")
	private String routingkey;	
	String kafkaTopic = "java_in_use_topic";
	
	public void send(TransactionResponse response) {
		amqpTemplate.convertAndSend(exchange, routingkey, response);
		System.out.println("Send msg = " + response.toString()+"a");
	    
	}
}