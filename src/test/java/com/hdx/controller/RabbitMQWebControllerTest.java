/*package com.userinterface.controller;

import com.userinterface.UserInterfaceMicroserviceTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class RabbitMQWebControllerTest extends UserInterfaceMicroserviceTest{
	@Autowired
	private WebApplicationContext webApplicationContext;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testEmployee() throws Exception {
		mockMvc.perform(get("/producer")).andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"));
				//.andExpect(jsonPath("$.firstName").value("pt1")).andExpect(jsonPath("$.lastName").value("pt1Lastname"));
				//.andExpect(jsonPath("$.dob").value("20/12/1993")).andExpect(jsonPath("$.serviceProvider").value("EMHealthSystem"))
				//.andExpect(jsonPath("$.payer").value("Aetna")).andExpect(jsonPath("$.admissionDate").value("13/4/2018"));

	}
}
*/