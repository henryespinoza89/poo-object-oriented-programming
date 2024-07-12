package org.poo.fundamentals.concepts.AccessModifiers.package2;

import org.poo.fundamentals.concepts.AccessModifiers.package1.ClaseA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClaseC extends ClaseA {
  private static final Logger logger = LoggerFactory.getLogger(ClaseC.class);
  public void accessFromDifferentPackage() {
    ClaseA a = new ClaseA();
    logger.info(String.valueOf(a.publicField)); // Acceso permitido
    // logger.info(a.protectedField); // Error: no se puede acceder a un campo protegido desde una referencia de ClaseA
    // logger.info(a.defaultField); // Error: no se puede acceder a un campo por defecto (package-private) desde otro paquete
    // logger.info(a.privateField); // Error: no se puede acceder a un campo privado
    a.publicMethod(); // Acceso permitido
    // a.protectedMethod(); // Error: no se puede acceder a un método protegido desde una referencia de ClaseA
    // a.defaultMethod(); // Error: no se puede acceder a un método por defecto (package-private) desde otro paquete
    // a.privateMethod(); // Error: no se puede acceder a un método privado
    // Acceso a los campos y métodos heredados
    logger.info(String.valueOf(publicField)); // Acceso permitido
    logger.info(String.valueOf(protectedField)); // Acceso permitido porque es una subclase
    // logger.info(defaultField); // Error: no se puede acceder a un campo por defecto (package-private) desde otro paquete
    // logger.info(privateField); // Error: no se puede acceder a un campo privado
    publicMethod(); // Acceso permitido
    protectedMethod(); // Acceso permitido porque es una subclase
    // defaultMethod(); // Error: no se puede acceder a un método por defecto (package-private) desde otro paquete
    // privateMethod(); // Error: no se puede acceder a un método privado
  }
  /* Resumen
   public: Accesible desde cualquier parte.
   protected: Accesible dentro del mismo paquete y por subclases, incluso en paquetes diferentes.
   default (sin modificador): Accesible solo dentro del mismo paquete.
   private: Accesible solo dentro de la propia clase.
   Los modificadores de acceso son fundamentales para controlar la visibilidad y la protección de los datos y
   métodos en tus programas, promoviendo buenas prácticas de encapsulamiento y diseño de software.*/
}
