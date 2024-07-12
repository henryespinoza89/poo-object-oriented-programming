package org.poo.fundamentals;

import org.poo.fundamentals.abstraction.abstractClass.Circulo;
import org.poo.fundamentals.abstraction.abstractClass.Rectangulo;
import org.poo.fundamentals.abstraction.interfaces.CirculoInt;
import org.poo.fundamentals.abstraction.interfaces.RectanguloInt;
import org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample.Contador;
import org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample.EjemploStaticBlock;
import org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample.Utilidades;
import org.poo.fundamentals.concepts.abstractClasses.Empleado;
import org.poo.fundamentals.concepts.abstractClasses.EmpleadoMedioTiempo;
import org.poo.fundamentals.concepts.abstractClasses.EmpleadoTiempoCompleto;
import org.poo.fundamentals.encapsulation.Persona;
import org.poo.fundamentals.inheritance.Animal;
import org.poo.fundamentals.inheritance.Perro;
import org.poo.fundamentals.polymorphism.overload.Calculadora;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);
  public static void main(String[] args) {
    /* inheritance */
    Animal animal = new Animal("Thor", 6);
    animal.hacerSonido();
    animal.describir();
    Perro perro = new Perro("chihuahua", "Saturno", 5);
    perro.hacerSonido();
    perro.describir();
    /* encapsulation */
    Persona persona = new Persona("Jose", 25);
    logger.info("Nombre {}", persona.getNombre());
    logger.info("Edad {}", persona.getEdad());
    persona.describir();
    persona.setEdad(-5);
    /* Polimorfismo */
    Calculadora calculadora = new Calculadora();
    logger.info("Suma de enteros: {}", calculadora.sumar(2, 3));
    logger.info("Suma de dobles: {}", calculadora.sumar(2.0, 3.0));
    org.poo.fundamentals.polymorphism.overwrite.Animal newAnimal = new org.poo.fundamentals.polymorphism.overwrite.Animal();
    org.poo.fundamentals.polymorphism.overwrite.Animal miPerro = new org.poo.fundamentals.polymorphism.overwrite.Perro();
    newAnimal.hacerSonido();
    miPerro.hacerSonido();
    /* Abstraction */
    /* Usando clases abstractas */
    Circulo circulo = new Circulo("Rojo", 5);
    Rectangulo rectangulo = new Rectangulo("Azul", 4, 7);
    logger.info("Color del círculo: {}", circulo.getColor());
    logger.info("Área del círculo: {}", circulo.calcularArea());
    logger.info("Perímetro del círculo: {}", circulo.calcularPerimetro());
    logger.info("Color del rectángulo: {}", rectangulo.getColor());
    logger.info("Área del rectángulo: {}", rectangulo.calcularArea());
    logger.info("Perímetro del rectángulo: {}", rectangulo.calcularPerimetro());
    /* Usando interfaces */
    CirculoInt circuloI = new CirculoInt("Rojo", 5);
    RectanguloInt rectanguloI = new RectanguloInt("Azul", 4, 7);
    logger.info("Color del círculo: {}", circuloI.getColor());
    logger.info("Área del círculo: {}", circuloI.calcularArea());
    logger.info("Perímetro del círculo: {}", circuloI.calcularPerimetro());
    logger.info("Color del rectángulo: {}", rectanguloI.getColor());
    logger.info("Área del rectángulo: {}", rectanguloI.calcularArea());
    logger.info("Perímetro del rectángulo: {}", rectanguloI.calcularPerimetro());
    /* Clases abstractas */
    Empleado emp1 = new EmpleadoTiempoCompleto("Juan", 1, 50000);
    Empleado emp2 = new EmpleadoMedioTiempo("Ana", 2, 20, 25);
    logger.info("Salario de {}: {}", emp1.getNombre(), emp1.calcularSalario());
    logger.info("Salario de {}: {}", emp2.getNombre(), emp2.calcularSalario());
    /* Modificadores static y final */
    Contador c1 = new Contador();
    Contador c2 = new Contador();
    Contador.mostrarCuenta(); // Output: Cuenta: 2
    /* Static */
    int resultado = Utilidades.sumar(5, 3); // Llama al método estático sin crear una instancia de Utilidades
    logger.info("Resultado: {}", resultado); // Output: Resultado: 8
    EjemploStaticBlock.mostrarValor(); // Output: Valor: 42
  }
}