package org.poo.fundamentals.concepts.AccessModifiers.staticFinal.finalExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubClase extends ClaseBase {
  private static final Logger logger = LoggerFactory.getLogger(SubClase.class);
  // Esto dará error: no se puede sobrescribir un método final
  /* public void metodoFinal() {
    logger.info("Intentando sobrescribir");
  }*/
}
