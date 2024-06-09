package com.examen.demo.service;

import com.examen.demo.model.Animal;
import org.springframework.stereotype.Service;

import java.util.List;



public interface IAnimalService {
     //listar
     List<Animal> Get();
    Animal FindAnimalById(Integer id);
    //guardar
     Animal Save(Animal entity);
    //actualizar  mascotas por id
     Integer update(Integer id, Animal animal);
    //elinar  mascotas
      Integer delete(Integer codAnimal);










}
