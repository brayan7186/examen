package com.examen.demo.service.Impl;

import com.examen.demo.model.Animal;
import com.examen.demo.repository.AnimalRepository;
import com.examen.demo.service.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

 @Service
public class AnimalService   implements IAnimalService {

    AnimalRepository _animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        _animalRepository = animalRepository;
    }


    //get
    @Override
    public List<Animal> Get() {
        return _animalRepository.findAll();
    }

    //post
    @Override
    public Animal Save(Animal entity) {
        Animal guardarAnimal = _animalRepository.save(entity);
        return guardarAnimal;

    }

    @Override
    public Integer update(Integer id, Animal animal) {
        Optional<Animal> existingAnimal = _animalRepository.findById(id);
        if (existingAnimal.isPresent()) {
            Animal animalToUpdate = existingAnimal.get();
            animalToUpdate.setEspecie(animal.getEspecie());
            animalToUpdate.setEdad(animal.getEdad());
            animalToUpdate.setGenero(animal.getGenero());
            _animalRepository.save(animalToUpdate);
            return 1; // Successfully updated
        } else {
            return 0; // Animal not found
        }
    }
     @Override
     public Integer delete(Integer codAnimal) {
         Optional<Animal> optionalAnimal = _animalRepository.findById(codAnimal);

         if (optionalAnimal.isPresent()) {
             _animalRepository.deleteById(codAnimal);
             return 1; // Indica que la eliminación fue exitosa
         } else {
             return 0; // Indica que el animal no fue encontrado
         }
     }

}

















