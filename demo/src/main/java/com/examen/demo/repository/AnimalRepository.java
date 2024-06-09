package com.examen.demo.repository;

import com.examen.demo.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository  extends JpaRepository<Animal , Integer> {
}
