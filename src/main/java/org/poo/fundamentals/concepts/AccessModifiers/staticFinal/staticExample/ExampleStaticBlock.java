package org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleStaticBlock {
  /* Bloques static
   Definición: Un bloque static es un bloque de código que se ejecuta una vez cuando la clase se carga en memoria.
   Se usa para inicializar variables static.*/
  private static final Logger logger = LoggerFactory.getLogger(ExampleStaticBlock.class);
  public static int value;
  static {
    value = 42; // Static initialization
  }
  public static void showValue() {
    logger.info("Value: {}", value);
  }
}
