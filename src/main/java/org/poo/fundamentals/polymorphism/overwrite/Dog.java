package org.poo.fundamentals.polymorphism.overwrite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog extends Animal {
  private static final Logger logger = LoggerFactory.getLogger(Dog.class);
  /* 2. Polimorfismo de Ejecución (Sobrescritura de Métodos): Permite que una subclase sobrescriba un método de su
     superclase para proporcionar una implementación específica. Esto permite que un método se comporte
     de manera diferente según el objeto que lo invoque. */
  /* El polimorfismo facilita la extensibilidad y la reutilización del código, permitiendo que los objetos de
     diferentes clases sean tratados de manera uniforme a través de una interfaz común. */
  @Override
  public void makeSound() {
    logger.info("The dog barks.");
  }
}
