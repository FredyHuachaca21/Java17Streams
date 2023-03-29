package com.fredgar.pe.home;

import com.fredgar.pe.model.ObtenerPersonas;
import com.fredgar.pe.model.Persona;

import java.util.List;
import java.util.stream.Stream;

public class Ejemplo02 {
  public static void main(String[] args) {
    ObtenerPersonas personas = new ObtenerPersonas();
    List<Persona> list = personas.listarPersonas();

    Stream<Persona> personaStream = list.stream();

    // Filter edad >= 20 y que el nombre empiece con F
    personaStream
        .filter(persona -> persona.getEdad() >=20 && persona.getNombre().startsWith("F"))
        .forEach(personas::imprimirPersonas);
  }
}
