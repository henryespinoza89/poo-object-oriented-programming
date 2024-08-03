package org.poo.fundamentals.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
  private static final Logger logger = LoggerFactory.getLogger(Animal.class);
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
