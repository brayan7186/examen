package com.examen.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Animal {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  int  Id;
   private   String Especie;
   private int  Edad;
   private    String  genero;

}
