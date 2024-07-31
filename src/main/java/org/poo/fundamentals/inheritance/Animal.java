package org.poo.fundamentals.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
  private static final Logger logger = LoggerFactory.getLogger(Animal.class);
  // Documentation: https://www.javatpoint.com/inheritance-in-java
  /* Herencia:
     Es un mecanismo que permite crear una nueva clase (clase derivada o subclase) basada en una clase existente
     (clase base o superclase). La subclase hereda atributos y métodos de la superclase, lo que promueve la
     reutilización de código y establece una relación jerárquica entre las clases. */
  /* Características de la Herencia:
     1. Reutilización de Código: Permite que una clase reutilice atributos y métodos de otra clase.
     2. Jerarquía: Establece una relación "es-un" (is-a) entre las clases. Por ejemplo, un Perro es un tipo de Animal.
     3. Extensibilidad: Las subclases pueden agregar nuevos atributos y métodos o sobrescribir los métodos heredados
     para proporcionar una funcionalidad específica.
     4. Polimorfismo: Las instancias de la subclase pueden ser tratadas como instancias de la superclase, lo que
     permite la implementación de métodos que funcionen de manera general con diferentes tipos de objetos. */
  private String name;
  private int age;
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setNombre(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void makeSound() {
    logger.info("The animal makes a sound.");
  }
  public void describe() {
    logger.info("I'm a {}, my name is {} and I'm {} years old.", getClass().getSimpleName(), name, age);
  }
}
