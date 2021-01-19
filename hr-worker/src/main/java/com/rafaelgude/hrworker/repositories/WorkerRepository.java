package com.rafaelgude.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelgude.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
