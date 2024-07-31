package org.poo.fundamentals.concepts.abstractClasses;

public abstract class Employee {
  /* Definición: Una clase abstracta es una clase en la Programación Orientada a Objetos (POO) que no puede ser
   instanciada directamente y está diseñada para ser extendida por otras clases. Las clases abstractas pueden
   contener métodos abstractos, que son métodos declarados sin implementación, y métodos concretos, que tienen
   implementación.
   Las clases abstractas se utilizan para definir una estructura común y un comportamiento compartido que pueden ser
   heredados por las subclases. Al declarar una clase abstracta, se indica que la clase tiene algún comportamiento
   que debe ser definido por sus subclases.*/

  /* Características de las Clases Abstractas
   No pueden ser instanciadas: No se puede crear una instancia directa de una clase abstracta.
   Pueden contener métodos abstractos y concretos: Los métodos abstractos deben ser implementados por las subclases.
   Pueden tener atributos y constructores: Las clases abstractas pueden tener atributos y constructores que pueden
   ser utilizados por las subclases.
   Pueden implementar métodos concretos: Además de declarar métodos abstractos, las clases abstractas pueden
   proporcionar implementaciones concretas para algunos métodos.*/

  /* Ejemplo:
   Imaginemos un sistema para diferentes tipos de empleados. Podemos crear una clase abstracta Empleado que define
   métodos y atributos comunes, y luego crear subclases específicas como EmpleadoTiempoCompleto y EmpleadoMedioTiempo
   que extienden Empleado y proporcionan implementaciones específicas.*/

  private String name;
  private int id;
  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public abstract double calculateSalary();

  /* Explicación:
   Clase Abstracta Empleado:
   Tiene atributos nombre e id y un constructor para inicializarlos.
   Incluye un método concreto getNombre() que devuelve el nombre del empleado.
   Declara un método abstracto calcularSalario() que debe ser implementado por las subclases.*/

  /* Beneficios de Usar Clases Abstractas
   Reutilización de Código: Permiten la reutilización de código común entre varias clases.
   Estructura Común: Proporcionan una estructura común que deben seguir las subclases, facilitando la coherencia
   en el diseño del sistema.
   Extensibilidad: Facilitan la creación de nuevas clases que extienden la funcionalidad existente sin necesidad
   de modificar el código base.*/

  /* Resumen
   Una clase abstracta es una clase que no puede ser instanciada directamente y que puede contener métodos abstractos
   y concretos. Las subclases que extienden la clase abstracta deben proporcionar implementaciones para los métodos
   abstractos, permitiendo así definir un comportamiento común que puede ser compartido y extendido por las subclases.
   Esto facilita la creación de estructuras de código más organizadas y mantenibles.*/

  /* Diferencias entre una clase asbtracta y una interfaz
   Clase abstracta
   Propósito: Compartir código común entre subclases
   Métodos: Puede tener métodos abstractos y concretos
   Atributos: Puede tener atributos de instancia y clase
   Herencia: Una clase solo puede extender una clase abstracta
   Constructores: Puede tener constructores
   Modificadores de Acceso: Métodos pueden tener cualquier modificador de acceso

   Interfaz
   Propósito: Definir un contrato que las clases deben cumplir
   Métodos: Solo métodos abstractos hasta Java 8; desde Java 8 puede tener métodos default y static
   Atributos: Solo constantes (public static final)
   Herencia: Una clase puede implementar múltiples interfaces
   Constructores: No puede tener constructores
   Modificadores de Acceso: Métodos son public por defecto; desde Java 9, los métodos private son permitidos dentro
   de la interfaz*/
}
