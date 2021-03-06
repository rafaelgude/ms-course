package com.rafaelgude.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rafaelgude.hrpayroll.entities.Worker;

@FeignClient(name = "hr-worker", path = "/workers")
@Component
public interface WorkerFeignClient {

	@GetMapping("/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
	
}
