package com.rafaelgude.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelgude.hrpayroll.entities.Payment;
import com.rafaelgude.hrpayroll.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentResource {

	@Autowired
	private PaymentService service;
	
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		return ResponseEntity.ok(service.getPayment(workerId, days));
	}
	
}