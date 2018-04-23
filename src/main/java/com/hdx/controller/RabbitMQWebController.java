package com.hdx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hdx.service.RabbitMQSender;

@RestController
@RequestMapping(value = "/javainuse-rabbitmq/")
public class RabbitMQWebController {

//	@Autowired
//	RabbitMQSender rabbitMQSender;
//
//	@GetMapping(value = "/producer")
//	public String producer(@RequestParam("empName") String empName,@RequestParam("empId") String empId) {
//	
//
//
//		return "Message sent to the RabbitMQ JavaInUse Successfully";
//	}
//
}

