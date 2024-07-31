package org.poo.fundamentals.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog extends Animal {
  private static final Logger logger = LoggerFactory.getLogger(Dog.class);
  /* Clase Derivada: La clase Perro hereda de Animal y agrega un nuevo atributo raza. También sobrescribe los métodos
     hacer_sonido y describir para proporcionar una funcionalidad específica para los perros. */
  /* Sobrescritura de Métodos: La subclase Perro redefine el método hacer_sonido para especificar que un perro ladra,
     en lugar de hacer un sonido genérico. También redefine el método describir y llama al método describir de la
     superclase con super().describir() para reutilizar la lógica de la superclase y agregar información específica
     de Perro. */
  private String breed;
  public String getBreed() {
    return breed;
  }
  public void setBreed(String breed) {
    this.breed = breed;
  }
  public Dog(String breed, String name, Integer age) {
    super(name, age);
    this.breed = breed;
  }
  @Override
  public void makeSound() {
    logger.info("The dog barks.");
  }
  @Override
  public void describe() {
    super.describe();
    logger.info("I'm of the breed {}", breed);
  }
}
