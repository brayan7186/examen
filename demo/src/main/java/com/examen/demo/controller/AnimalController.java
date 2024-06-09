package com.examen.demo.controller;

import com.examen.demo.model.Animal;
import com.examen.demo.service.IAnimalService;
import com.examen.demo.service.Impl.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

  @RestController
public class AnimalController {


    /*
     * Consultar => GET
     * Grabar => POST
     * Actualizar => PUT(*) / PATCH
     * Eliminar => DELETE
     * */
    IAnimalService iAnimalService;

    @Autowired
    public AnimalController(IAnimalService iAnimalService) {
        this.iAnimalService=iAnimalService;
    }

    //listar  animal
    @GetMapping("/listar")
    public List<Animal> getAll() {return iAnimalService.Get();}

    @PostMapping("/guadar")
    public Animal saveAnimal(@RequestBody Animal entity) {
        return iAnimalService.Save(entity);
    }


      @GetMapping("/buscar/{id}")
      public Animal getAll(@PathVariable int id) {
          return iAnimalService.FindAnimalById(id);
      }


      @PutMapping("/actualizar/{id}")
      public ResponseEntity<Integer> updateAnimal(@PathVariable Integer id, @RequestBody Animal animal) {
          Integer updated = iAnimalService.update(id, animal);
          if (updated == 1) {
              return new ResponseEntity<>(HttpStatus.OK);
          } else {
              return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          }
      }

      @DeleteMapping("/eliminar/{id}")
      public ResponseEntity<Integer> deleteAnimal(@PathVariable Integer id) {
          Integer deleted = iAnimalService.delete(id);
          if (deleted == 1) {
              return new ResponseEntity<>(HttpStatus.OK);
          } else {
              return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          }
      }



}
