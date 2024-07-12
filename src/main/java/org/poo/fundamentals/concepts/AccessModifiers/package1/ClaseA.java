package org.poo.fundamentals.concepts.AccessModifiers.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClaseA {
  /* Los modificadores de acceso en Java son palabras clave que determinan la visibilidad y accesibilidad de clases,
   métodos y atributos en un programa. Estos modificadores controlan desde qué otras clases o paquetes se puede
   acceder a ciertos miembros de una clase. Los principales modificadores de acceso en Java son public, protected,
   default (sin modificador explícito) y private.*/

  /* Tipos de Modificadores de Acceso
   public:
   Visibilidad: La clase, método o atributo es accesible desde cualquier otra clase.
   Uso: Utilizado cuando se desea que el elemento sea accesible desde cualquier parte del programa.
   protected:
   Visibilidad: El método o atributo es accesible dentro de su propio paquete y por las subclases, incluso si están
   en diferentes paquetes.
   Uso: Utilizado para permitir el acceso a subclases y clases del mismo paquete, pero no a clases no relacionadas
   fuera del paquete.
   default (sin modificador explícito):
   Visibilidad: El método o atributo es accesible solo dentro del mismo paquete.
   Uso: Utilizado para permitir el acceso solo a clases dentro del mismo paquete.
   private:
   Visibilidad: El método o atributo es accesible solo dentro de su propia clase.
   Uso: Utilizado para encapsular datos y métodos, ocultándolos de otras clases, incluso dentro del mismo paquete.*/
  private static final Logger logger = LoggerFactory.getLogger(ClaseA.class);
  public int publicField = 1;
  protected int protectedField = 2;
  int defaultField = 3; // Default (package-private)
  private int privateField = 4;
  public void publicMethod() {
    logger.info("Método público");
  }
  protected void protectedMethod() {
    logger.info("Método protegido");
  }
  void defaultMethod() {
    logger.info("Método por defecto (package-private)");
  }
  private void privateMethod() {
    logger.info("Método privado");
  }
  public void accessFieldsAndMethods() {
    // Acceso a todos los campos y métodos dentro de la misma clase
    logger.info(String.valueOf(publicField));
    logger.info(String.valueOf(protectedField));
    logger.info(String.valueOf(defaultField));
    logger.info(String.valueOf(privateField));
    publicMethod();
    protectedMethod();
    defaultMethod();
    privateMethod();
  }
}
