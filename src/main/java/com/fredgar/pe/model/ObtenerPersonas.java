package com.fredgar.pe.model;

import java.util.ArrayList;
import java.util.List;

public class ObtenerPersonas {

  public List<Persona> listarPersonas(){
  List<Persona> personaList = new ArrayList<>();
  personaList.add(new Persona(1, "Fredy", "Huachaca", 40));
  personaList.add(new Persona(2, "Frank", "Torres", 15));
  personaList.add(new Persona(3, "Alex", "Fernandez", 20));
  personaList.add(new Persona(4, "Marco", "Belaunde", 60));
  personaList.add(new Persona(5, "Ivan", "Diaz", 25));
  personaList.add(new Persona(6, "Alessia", "Ramos", 15));
  personaList.add(new Persona(7, "Fernando", "Santos", 35));
  personaList.add(new Persona(8, "Diego", "Flores", 5));
  personaList.add(new Persona(9, "Ruben", "Lopez", 10));
  personaList.add(new Persona(10, "Cristhian", "Descalzo", 22));
  return personaList;
  }

  public void imprimirPersonas(Persona persona) {
    System.out.println("ID: " + persona.getId() +
        " NOMBRE: " + persona.getNombre() +
        " APELLIDO: " + persona.getApellido() +
        " EDAD: " + persona.getEdad());
  }

}
