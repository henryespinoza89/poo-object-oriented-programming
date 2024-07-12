package org.poo.fundamentals.polymorphism.overwrite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
  private static final Logger logger = LoggerFactory.getLogger(Animal.class);
    public void hacerSonido() {
      logger.info("El animal hace un sonido");
    }
}
