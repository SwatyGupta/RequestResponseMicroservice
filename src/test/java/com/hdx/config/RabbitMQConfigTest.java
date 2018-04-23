package com.hdx.config;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;


import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;


import com.hdx.config.RabbitMQConfig;

public class RabbitMQConfigTest {
	RabbitMQConfig rabbitMQConfig  = new RabbitMQConfig();
	
	 @Test
     public void rabbitTemplate() {
		 RabbitMQConfig spy;
		 spy = Mockito.spy(rabbitMQConfig);
		ConnectionFactory connectionFactory = null;
         RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
         doReturn(rabbitTemplate).when(spy).instantiateRabbitTemplate(connectionFactory);
         assertEquals(rabbitTemplate,  spy.rabbitTemplate(connectionFactory));
     }
}
