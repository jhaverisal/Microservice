package com.test.microservice.consumer;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.microservice.consumer.ConsumerServiceProxy;
import com.test.microservice.model.UserM;


@RestController
//@RequestMapping("/")
public class ConsumerController {

	@Autowired
	private ConsumerServiceProxy proxy;
	private Logger logger;
	
	
	@GetMapping("/test")
	public String testing() {
		return "my test msg";
	}
	
	@GetMapping("/user-consumer/find-user/{id}")
	public UserM retrieveUserDetails(@PathVariable Integer id) {
		//logger.info("in the controller");
		UserM resp=proxy.retrieveUserDetails(id);
		return new UserM(resp.getUserId(),resp.getFname(),resp.getLname(),resp.getEmailId(),resp.getAddress(),resp.getUserName(),
				resp.getPassword(),resp.getType());
	}
}
