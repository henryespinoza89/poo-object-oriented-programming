package org.poo.fundamentals.concepts.AccessModifiers.staticFinal.finalExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinalExample {
  /* El modificador final en Java se utiliza para definir constantes, evitar la herencia y evitar la
   sobrescritura de métodos. Su uso en variables, métodos y clases tiene diferentes significados.
   Variables final
   Definición: Una variable declarada con final no puede cambiar su valor una vez que se le ha asignado.
   Esto significa que la variable es una constante.
   Inicialización: Las variables de instancia final deben ser inicializadas al momento de la declaración o en el
   constructor de la clase.*/
  private static final Logger logger = LoggerFactory.getLogger(FinalExample.class);
  public static final double PI = 3.14159; // Class constant
  public final int age;
  public FinalExample(int age) {
    this.age = age; // Initialization in the constructor
  }
  public void showAge() {
    logger.info("Age: {}", age);
  }
}
