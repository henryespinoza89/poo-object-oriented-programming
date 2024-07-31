package org.poo.fundamentals.abstraction.interfaces;

public interface Shape {
  /* Descripción: Las interfaces en Java son una herramienta poderosa para lograr la abstracción. Una interfaz
     define un contrato que las clases deben cumplir, sin dictar cómo deben implementar los métodos. Las interfaces
     solo pueden declarar métodos sin implementación y variables (que son implícitamente public, static y final). */
  /* Ejemplo: Imaginemos un sistema para diferentes tipos de formas geométricas. Podemos crear una interfaz Forma
     que define métodos para calcular el área y el perímetro, y luego crear clases específicas para CirculoInt y
     RectanguloInt que implementan esta interfaz. */
  double calculateArea();
  double calculatePerimeter();
  /* Explicación del Ejemplo
     Interfaz Forma:
     Declara los métodos calcularArea() y calcularPerimetro() que las clases deben implementar. */
  /* Clase Circulo:
     Implementa la interfaz Forma y proporciona las implementaciones de calcularArea() y calcularPerimetro().
     Incluye un atributo color y un método getColor() para obtener el color del círculo. */
  /* Clase Rectangulo:
     Implementa la interfaz Forma y proporciona las implementaciones de calcularArea() y calcularPerimetro().
     Incluye un atributo color y un método getColor() para obtener el color del rectángulo. */
  /* Clase Main:
     Crea instancias de CirculoInt y RectanguloInt y llama a sus métodos para demostrar la abstracción en acción.
     Utiliza el operador de conversión de tipo (CirculoInt) y (RectanguloInt) para acceder a los métodos específicos
     de cada clase, como getColor(). */
  /* Beneficios de Usar Interfaces para la Abstracción
     Flexibilidad: Las interfaces permiten que una clase implemente múltiples interfaces, proporcionando mayor
     flexibilidad en la estructura del código.
     Desacoplamiento: Facilita la separación de la definición del comportamiento de su implementación, permitiendo
     cambiar la implementación sin afectar al código que depende de la interfaz.
     Reutilización de Código: Varias clases pueden implementar la misma interfaz, reutilizando el contrato definido
     por la interfaz y proporcionando diferentes implementaciones. */
  /* Resumen
     La abstracción en Java mediante el uso de interfaces permite definir contratos que las clases deben cumplir sin
     dictar cómo deben implementarse esos contratos. Esto proporciona flexibilidad y separación de preocupaciones,
     mejorando la modularidad y mantenibilidad del código. */
}
