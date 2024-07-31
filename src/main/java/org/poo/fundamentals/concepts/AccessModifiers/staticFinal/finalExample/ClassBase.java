package org.poo.fundamentals.concepts.AccessModifiers.staticFinal.finalExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassBase {
  /* Métodos final
   Definición: Un método declarado como final no puede ser sobrescrito por las subclases. Esto es útil para prevenir
   la modificación del comportamiento en subclases.
   Uso: Se utiliza cuando se desea asegurar que el comportamiento de un método no sea alterado por las subclases.*/
  private static final Logger logger = LoggerFactory.getLogger(ClassBase.class);
  public final void finalMethod() {
    logger.info("This method cannot be overwrite.");
  }
}
