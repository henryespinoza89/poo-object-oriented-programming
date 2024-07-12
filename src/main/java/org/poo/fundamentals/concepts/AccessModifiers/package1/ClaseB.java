package org.poo.fundamentals.concepts.AccessModifiers.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClaseB {
  private static final Logger logger = LoggerFactory.getLogger(ClaseB.class);
  public void accessFromSamePackage() {
    ClaseA a = new ClaseA();
    logger.info(String.valueOf(a.publicField)); // Acceso permitido
    logger.info(String.valueOf(a.protectedField)); // Acceso permitido
    logger.info(String.valueOf(a.defaultField)); // Acceso permitido
    // logger.info(a.privateField); // Error: no se puede acceder a un campo privado
    a.publicMethod(); // Acceso permitido
    a.protectedMethod(); // Acceso permitido
    a.defaultMethod(); // Acceso permitido
    // a.privateMethod(); // Error: no se puede acceder a un método privado
  }
}
