package com.rafaelgude.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rafaelgude.hruser.entities.User;
import com.rafaelgude.hruser.repositories.UserRepository;

@RefreshScope
@RestController
@RequestMapping("/users")
public class UserResource {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		return ResponseEntity.ok(repository.findById(id).get());
	}
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		return ResponseEntity.ok(repository.findByEmail(email));
	}


}