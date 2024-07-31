package org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Counter {
  /* Modificador static:
   El modificador static en Java se utiliza para indicar que un miembro de la clase (ya sea una variable o un método)
   pertenece a la clase en sí y no a instancias específicas de esa clase. Esto significa que los miembros estáticos
   son compartidos por todas las instancias de la clase. Aquí hay una descripción más detallada de cómo se usan las
   variables y métodos static.
   Variables static
   Definición: Una variable static es una variable de clase, lo que significa que es compartida por todas las
   instancias de esa clase. Solo hay una copia de la variable static, independientemente de cuántas instancias se creen.
   Acceso: Se puede acceder a través del nombre de la clase o de una instancia de la clase. Sin embargo, es más común
   acceder a ellas usando el nombre de la clase.*/
  private static final Logger logger = LoggerFactory.getLogger(Counter.class);
  public static int account = 0; // Variable de clase
  public Counter() {
    account++; // Incrementa el contador cada vez que se crea una instancia
  }
  public static void showAccount() {
    logger.info("Account: {}", account);
  }
}
