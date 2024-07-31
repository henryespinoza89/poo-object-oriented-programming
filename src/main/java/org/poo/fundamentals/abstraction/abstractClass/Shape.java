package org.poo.fundamentals.abstraction.abstractClass;

abstract class Shape {
  // Documentation: https://www.javatpoint.com/interface-in-java
  /* Definición: Se refiere al proceso de simplificar sistemas complejos mostrando solo los detalles esenciales y
     ocultando los detalles de implementación. En otras palabras, la abstracción permite centrarse en qué hace un
     objeto en lugar de cómo lo hace. */
  /* En Java, la abstracción se logra mediante el uso de clases abstractas e interfaces. Una clase abstracta no puede
     ser instanciada directamente y puede contener métodos abstractos (sin implementación) que deben ser implementados
     por las subclases. Las interfaces definen métodos sin implementación que deben ser implementados por las clases
     que las implementan. */
  /* Imaginemos un sistema para diferentes tipos de formas geométricas. Podemos crear una clase abstracta Forma que
     define métodos abstractos para calcular el área y el perímetro, y luego crear subclases específicas para Circulo
     y Rectangulo que implementan estos métodos. */
  private String colour;
  public Shape(String colour) {
    this.colour = colour;
  }
  public String getColour() {
    return colour;
  }
  public abstract double calculateArea();
  public abstract double calculatePerimeter();
  /* Clase Abstracta Forma:
     Define los métodos abstractos calcularArea() y calcularPerimetro() que deben ser implementados por las subclases.
     Incluye un atributo color y un método getColor() para obtener el color de la forma. */
  /* Subclase Circulo:
     Extiende de Forma e implementa los métodos calcularArea() y calcularPerimetro().
     Proporciona la lógica específica para calcular el área y el perímetro de un círculo. */
  /* Subclase Rectangulo:
     Extiende de Forma e implementa los métodos calcularArea() y calcularPerimetro().
     Proporciona la lógica específica para calcular el área y el perímetro de un rectángulo. */
  /* Clase Main:
     Crea instancias de Circulo y Rectangulo y llama a sus métodos para demostrar la abstracción en acción. */
  /* Beneficios de la Abstracción
     Simplicidad: Permite trabajar con conceptos de alto nivel sin preocuparse por los detalles de implementación.
     Reutilización de Código: Las subclases pueden compartir métodos y atributos definidos en la clase abstracta.
     Flexibilidad: Las subclases pueden proporcionar implementaciones específicas de los métodos abstractos,
     permitiendo personalización según las necesidades. */
  /* Resumen
     La abstracción es una técnica de POO que se utiliza para simplificar sistemas complejos enfocándose en los
     aspectos esenciales y ocultando los detalles de implementación. En Java, se puede lograr utilizando clases
     abstractas e interfaces, permitiendo a los desarrolladores crear estructuras de código más manejables,
     flexibles y reutilizables. */
}
