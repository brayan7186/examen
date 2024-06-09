package com.examen.demo.service;

import com.examen.demo.model.Animal;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IAnimalService {
     //listar
     List<Animal> Get();
    //guardar
     Animal Save(Animal entity);
    //actualizar  mascotas por id
     Integer update(Integer id, Animal animal);
    //elinar  mascotas
      Integer delete(Integer codAnimal);










}
