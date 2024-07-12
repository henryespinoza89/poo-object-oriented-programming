package org.poo.fundamentals.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Perro extends Animal {
  private static final Logger logger = LoggerFactory.getLogger(Perro.class);
  /* Clase Derivada: La clase Perro hereda de Animal y agrega un nuevo atributo raza. También sobrescribe los métodos
     hacer_sonido y describir para proporcionar una funcionalidad específica para los perros. */
  /* Sobrescritura de Métodos: La subclase Perro redefine el método hacer_sonido para especificar que un perro ladra,
     en lugar de hacer un sonido genérico. También redefine el método describir y llama al método describir de la
     superclase con super().describir() para reutilizar la lógica de la superclase y agregar información específica
     de Perro. */
  private String raza;
  public String getRaza() {
    return raza;
  }
  public void setRaza(String raza) {
    this.raza = raza;
  }
  public Perro(String raza, String nombre, Integer edad) {
    super(nombre, edad);
    this.raza = raza;
  }
  @Override
  public void hacerSonido() {
    logger.info("El perro ladra");
  }
  @Override
  public void describir() {
    super.describir();
    logger.info("Soy de la raza {}", raza);
  }
}
