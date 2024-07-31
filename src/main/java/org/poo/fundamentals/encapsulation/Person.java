package org.poo.fundamentals.encapsulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
  private static final Logger logger = LoggerFactory.getLogger(Person.class);
  // Documentation: https://www.javatpoint.com/encapsulation
  /* Encapsulamiento
     Es un principio de diseño que tiene como objetivo agrupar datos (atributos) y métodos (funciones o comportamientos)
     que operan sobre esos datos dentro de una sola unidad o clase, y restringir el acceso directo a algunos de los
     componentes de un objeto. */
  /* Componentes del encapsulamiento:
     1. Datos Privados: Las variables (o atributos) de la clase son declaradas como privadas (private), lo que significa
     que no pueden ser accedidas directamente desde fuera de la clase.
     2. Métodos Públicos: Se proporcionan métodos públicos (getters y setters) para permitir el acceso controlado y la
     modificación de estos atributos.
     Características:
     1. Ocultación de Información: Protege los datos internos de una clase al evitar el acceso directo desde fuera de la
     clase. Los detalles de implementación están ocultos y solo se exponen las funcionalidades esenciales.
     2. Interfaz Pública: Expone un conjunto de métodos públicos que proporcionan una interfaz para interactuar con los
     datos encapsulados. Estos métodos son conocidos como getters y setters.
     3. Mantenimiento y Flexibilidad: Facilita el mantenimiento y la evolución del código, ya que los cambios en los datos
     internos no afectan el código que utiliza la clase mientras la interfaz pública se mantenga constante.
     4. Control y Seguridad: Proporciona control sobre cómo los datos son accedidos y modificados, permitiendo imponer
     restricciones y validaciones. */
  private String name;
  private int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    } else {
      logger.info("Age cannot be negative.");
    }
  }
  public void describe() {
    logger.info("Name: {}, Age: {}", name, age);
  }
  /* Explicación
     1. Atributos Privados: Los atributos nombre y edad están declarados como privados (private), lo que impide el acceso
     directo desde fuera de la clase.
     2. Métodos Getters y Setters: Se proporcionan métodos públicos getNombre, setNombre, getEdad y setEdad para acceder
     y modificar los atributos privados. Los setters pueden incluir lógica de validación, como en el caso de setEdad.
     3. Método Público: El método describir es público y proporciona una manera de mostrar la información de la persona
     sin exponer directamente los atributos internos.
     4. Control y Seguridad: El setter para edad incluye una validación para asegurarse de que la edad no sea negativa,
     demostrando cómo el encapsulamiento permite controlar cómo se modifican los datos internos. */
  /* Resumen
     En resumen, el encapsulamiento es una técnica clave en POO que ayuda a gestionar la complejidad y mejorar la
     robustez del software mediante la ocultación de detalles internos y la exposición de una interfaz controlada y
     consistente. Es decir implica mantener los datos y los métodos que operan sobre esos datos dentro de una clase, y
     controlar el acceso a los datos mediante métodos públicos. Esto no solo protege la integridad de los datos, sino
     que también proporciona una interfaz clara y controlada para interactuar con ellos. */
}
