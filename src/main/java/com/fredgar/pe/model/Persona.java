package com.fredgar.pe.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona {
  private Integer id;
  private String nombre;
  private String apellido;
  private int edad;
}
