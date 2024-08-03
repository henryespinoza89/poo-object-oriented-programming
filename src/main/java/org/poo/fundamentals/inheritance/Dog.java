package org.poo.fundamentals.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog extends Animal {
  private static final Logger logger = LoggerFactory.getLogger(Dog.class);
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
