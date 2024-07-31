package org.poo.fundamentals.concepts.AccessModifiers.staticFinal.finalExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubClass extends ClassBase {
  private static final Logger logger = LoggerFactory.getLogger(SubClass.class);
  // Esto dará error: no se puede sobrescribir un método final
  /* public void metodoFinal() {
    logger.info("Intentando sobrescribir");
  }*/
}
