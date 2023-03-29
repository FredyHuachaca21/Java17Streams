package com.fredgar.pe.home;

import com.fredgar.pe.model.ObtenerPersonas;
import com.fredgar.pe.model.Persona;

import java.util.List;
import java.util.stream.Stream;

public class Ejemplo01 {
  public static void main(String[] args) {
    ObtenerPersonas personas = new ObtenerPersonas();
    List<Persona> list = personas.listarPersonas();

    Stream<Persona> personaStream = list.stream();

    personaStream.forEach(personas::imprimirPersonas);
  }
}
