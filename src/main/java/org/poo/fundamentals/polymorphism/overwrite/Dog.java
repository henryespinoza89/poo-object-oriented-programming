package org.poo.fundamentals.polymorphism.overwrite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog extends Animal {
  private static final Logger logger = LoggerFactory.getLogger(Dog.class);
  @Override
  public void makeSound() {
    logger.info("The dog barks.");
  }
}
