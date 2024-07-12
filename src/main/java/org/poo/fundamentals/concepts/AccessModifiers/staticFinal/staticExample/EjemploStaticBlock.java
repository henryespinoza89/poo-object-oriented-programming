package org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EjemploStaticBlock {
  /* Bloques static
   Definición: Un bloque static es un bloque de código que se ejecuta una vez cuando la clase se carga en memoria.
   Se usa para inicializar variables static.*/
  private static final Logger logger = LoggerFactory.getLogger(EjemploStaticBlock.class);
  public static int valor;
  static {
    valor = 42; // Inicialización estática
  }
  public static void mostrarValor() {
    logger.info("Valor: {}", valor);
  }
}
