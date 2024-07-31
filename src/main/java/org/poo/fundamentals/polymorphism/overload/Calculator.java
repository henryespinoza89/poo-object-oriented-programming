package org.poo.fundamentals.polymorphism.overload;

public class Calculator {
  // Documentation: https://www.javatpoint.com/method-overloading-in-java
  /* Definición: El polimorfismo permite que un método pueda comportarse de diferentes maneras según el objeto
     que lo invoque. Hay dos tipos principales de polimorfismo:
     1. Polimorfismo de Compilación (Sobrecarga de Métodos): Permite definir múltiples métodos con el mismo nombre
     pero con diferentes parámetros en la misma clase, proporcionando flexibilidad para usar el mismo método en
     diferentes contextos. */
  // Método sobrecargado para sumar dos enteros
  public int add(int a, int b) {
    return a + b;
  }
  // Método sobrecargado para sumar dos números decimales
  public double add(double a, double b) {
    return a + b;
  }
}
