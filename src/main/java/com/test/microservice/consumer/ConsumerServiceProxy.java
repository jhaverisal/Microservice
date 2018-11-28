package com.test.microservice.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.PathVariable;

import com.test.microservice.model.UserM;

@FeignClient(name="user-service")
@RibbonClient(name="user-service")
public interface ConsumerServiceProxy {

	@GetMapping("/user/find/{id}")
	public UserM retrieveUserDetails(@PathVariable Integer id);
}
