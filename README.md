## :speech_balloon: Programación orientada a objetos


> ¡Hola a todos! 👋
> <br/>
> Bienvenidos a este proyecto donde vamos a repasar algunos de los conceptos fundamentales de la Programación Orientada a Objetos (POO).
> Si alguna vez te has preguntado cómo funciona la herencia, qué es el polimorfismo, o cómo encapsular y abstraer tus datos,
> ¡este es el lugar para ti!
> <br/>

> [!IMPORTANT]
El proposito principal de este proyecto es sentar las bases sobre la POO que nos permitan desenvolvernos correctamente en una entrevista laboral. A lo largo de mi carrera,
he aprendido mucho de mis experiencias en diversas situaciones como esta y quiero ayudar a otros a prepararse mejor y tener éxito en sus propias entrevistas.

La Programación Orientada a Objetos (POO) es un paradigma de programación que utiliza "objetos" para representar datos y métodos asociados
a esos datos. Es un enfoque que facilita la organización y estructuración del código, haciéndolo más modular, reutilizable y fácil de mantener.
| Conceptos              | Definición                                                                                                                                                                                                                      |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| _Herencia_        | Permite crear nuevas clases basadas en clases existentes. Esto promueve la reutilización del código y establece una relación jerárquica entre las clases.                                                                            |
| _Polimorfismo_    | Permite que una entidad (como un método o una clase) tome múltiples formas. Esto se logra a través de la sobrescritura o sobrecarga de métodos y la capacidad de un objeto de ser tratado como una instancia de su clase base.       |
| _Encapsulamiento_ | Agrupa los datos y los métodos que operan sobre esos datos en una única unidad llamada "clase". Esto restringe el acceso directo a algunos de los componentes de un objeto, lo que mejora la seguridad y la integridad de los datos. |
| _Abstracción_     | Consiste en ocultar los detalles complejos y mostrar sólo la información esencial y relevante. Facilita la gestión de la complejidad y permite enfocarse en lo que realmente importa.                                                |

## Herencia
Es un mecanismo que permite crear una nueva clase (clase derivada o subclase) basada en una clase existente
(clase base o superclase). La subclase hereda atributos y métodos de la superclase, lo que promueve la
reutilización de código y establece una relación jerárquica entre las clases.
<br/><br/>
`Características de la herencia`
1. Reutilización de Código: Permite que una clase reutilice atributos y métodos de otra clase.
2. Jerarquía: Establece una relación "es-un" (is-a) entre las clases. Por ejemplo, un Perro es un tipo de Animal.
3. Extensibilidad: Las subclases pueden agregar nuevos atributos y métodos o sobrescribir los métodos heredados para proporcionar una funcionalidad específica.
4. Polimorfismo: Las instancias de la subclase pueden ser tratadas como instancias de la superclase, lo que permite la implementación de métodos que funcionen de manera general con diferentes tipos de objetos.

`Ejemplo`

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/inheritance/Dog.java
```

> Clase Derivada: La clase Perro hereda de Animal y agrega un nuevo atributo raza. También sobrescribe los métodos hacer_sonido y describir para proporcionar una
> funcionalidad específica para los perros.

> Sobrescritura de Métodos: La subclase Perro redefine el método hacer_sonido para especificar que un perro ladra, en lugar de hacer un sonido genérico. También
> redefine el método describir y llama al método describir de la superclase con super().describir() para reutilizar la lógica de la superclase y agregar información específica de Perro.

> [!NOTE]
> Puedes encontrar más información en el siguiente link: [POO-herencia](https://www.javatpoint.com/inheritance-in-java)

## Polimorfismo
El polimorfismo permite que un método pueda comportarse de diferentes maneras según el objeto que lo invoque.
Hay dos tipos principales de polimorfismo que veremos a continuación:

`Ejemplo 01`
> Polimorfismo de Compilación (Sobrecarga de Métodos): Permite definir múltiples métodos con el mismo nombre
> pero con diferentes parámetros en la misma clase, proporcionando flexibilidad para usar el mismo método en diferentes contextos.
> Nuestro primer método de la clase Calculator es sobrecargado para sumar dos enteros y el segundo para sumar dos números decimales.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/polymorphism/overload/Calculator.java
```

`Ejemplo 02`

> Polimorfismo de Ejecución (Sobrescritura de Métodos): Permite que una subclase sobrescriba un método de su
> superclase para proporcionar una implementación específica. Esto permite que un método se comporte de manera diferente según el objeto que lo invoque.
> El polimorfismo facilita la extensibilidad y la reutilización del código, permitiendo que los objetos de diferentes clases sean tratados de manera uniforme a través de una interfaz común.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/polymorphism/overwrite/Dog.java
```

> [!NOTE]
> Puedes encontrar más información en el siguiente link: [POO-polimorfismo](https://www.javatpoint.com/method-overloading-in-java)

## Encapsulamiento
Es un principio de diseño que tiene como objetivo agrupar datos (atributos) y métodos (funciones o comportamientos)
que operan sobre esos datos dentro de una sola unidad o clase, y restringir el acceso directo a algunos de los componentes de un objeto.

`Componentes del encapsulamiento`
1. Datos Privados: Las variables (o atributos) de la clase son declaradas como privadas (private), lo que significa que no pueden ser accedidas directamente desde fuera de la clase.
2. Métodos Públicos: Se proporcionan métodos públicos (getters y setters) para permitir el acceso controlado y la modificación de estos atributos.

`Características`
1. Ocultación de Información: Protege los datos internos de una clase al evitar el acceso directo desde fuera de la clase. Los detalles de implementación están ocultos y solo se exponen las funcionalidades esenciales.
2. Interfaz Pública: Expone un conjunto de métodos públicos que proporcionan una interfaz para interactuar con los datos encapsulados. Estos métodos son conocidos como getters y setters.
3. Mantenimiento y Flexibilidad: Facilita el mantenimiento y la evolución del código, ya que los cambios en los datos internos no afectan el código que utiliza la clase mientras la interfaz pública se mantenga constante.
4. Control y Seguridad: Proporciona control sobre cómo los datos son accedidos y modificados, permitiendo imponer restricciones y validaciones.

`Explicación`

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/encapsulation/Person.java
```

> Atributos Privados: Los atributos nombre y edad están declarados como privados (private), lo que impide el acceso directo desde fuera de la clase.
> 
> Métodos Getters y Setters: Se proporcionan métodos públicos getNombre, setNombre, getEdad y setEdad para acceder y modificar los atributos privados. Los setters pueden incluir lógica de validación, como en el caso de setEdad.
> 
> Método Público: El método describir es público y proporciona una manera de mostrar la información de la persona sin exponer directamente los atributos internos.
> 
> Control y Seguridad: El setter para edad incluye una validación para asegurarse de que la edad no sea negativa, demostrando cómo el encapsulamiento permite controlar cómo se modifican los datos internos.

`Resumen`
> En resumen, el encapsulamiento es una técnica clave en POO que ayuda a gestionar la complejidad y mejorar la robustez del software mediante la ocultación de detalles internos y la exposición de una interfaz controlada y consistente. Es decir implica mantener los datos y los métodos que operan sobre esos datos dentro de una clase, y controlar el acceso a los datos mediante métodos públicos. Esto no solo protege la integridad de los datos, sino que también proporciona una interfaz clara y controlada para interactuar con ellos.

> [!NOTE]
> Puedes encontrar más información en el siguiente link: [POO-encapsulamiento](https://www.javatpoint.com/encapsulation)

## Abstracción
Se refiere al proceso de simplificar sistemas complejos mostrando solo los detalles esenciales y
ocultando los detalles de implementación. En otras palabras, la abstracción permite centrarse en qué hace un objeto en lugar de cómo lo hace.

En Java, la abstracción se logra mediante el uso de clases abstractas e interfaces. Una clase abstracta no puede
ser instanciada directamente y puede contener métodos abstractos (sin implementación) que deben ser implementados
por las subclases. Las interfaces definen métodos sin implementación que deben ser implementados por las clases que las implementan.

Imaginemos un sistema para diferentes tipos de formas geométricas. Podemos crear una clase abstracta Forma que
define métodos abstractos para calcular el área y el perímetro, y luego crear subclases específicas para Circulo y Rectangulo que implementan estos métodos.

`Beneficios de la Abstracción`
1. Simplicidad: Permite trabajar con conceptos de alto nivel sin preocuparse por los detalles de implementación.
2. Reutilización de Código: Las subclases pueden compartir métodos y atributos definidos en la clase abstracta.
3. Flexibilidad: Las subclases pueden proporcionar implementaciones específicas de los métodos abstractos, permitiendo personalización según las necesidades.

`Explicación clases abstractas`

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/abstraction/abstractClass/Shape.java
```

> Define los métodos abstractos calculateArea() y calculatePerimeter() que deben ser implementados por las subclases. Incluye un atributo color y un método getColour() para obtener el color de la forma.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/abstraction/abstractClass/Circle.java
```

> Extiende de Forma e implementa los métodos calcularArea() y calcularPerimetro(). Proporciona la lógica específica para calcular el área y el perímetro de un círculo.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/abstraction/abstractClass/Rectangle.java
```

> Extiende de Forma e implementa los métodos calcularArea() y calcularPerimetro(). Proporciona la lógica específica para calcular el área y el perímetro de un rectángulo.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/Main.java
```

> Crea instancias de Circulo y Rectangulo y llama a sus métodos para demostrar la abstracción en acción.

`Resumen clases abstractas`
> La abstracción es una técnica de POO que se utiliza para simplificar sistemas complejos enfocándose en los
aspectos esenciales y ocultando los detalles de implementación. En Java, se puede lograr utilizando clases
abstractas e interfaces, permitiendo a los desarrolladores crear estructuras de código más manejables, flexibles y reutilizables..

<br/>

`Explicación interfaces`

> Las interfaces en Java son una herramienta poderosa para lograr la abstracción. Una interfaz define un contrato que las clases deben cumplir, sin dictar cómo deben implementar los métodos. Las interfaces solo pueden declarar métodos sin implementación y variables (que son implícitamente public, static y final).

`Beneficios de las Interfaces`
1. Flexibilidad: Las interfaces permiten que una clase implemente múltiples interfaces, proporcionando mayor flexibilidad en la estructura del código.
2. Desacoplamiento: Facilita la separación de la definición del comportamiento de su implementación, permitiendo cambiar la implementación sin afectar al código que depende de la interfaz.
3. Reutilización de Código: Varias clases pueden implementar la misma interfaz, reutilizando el contrato definido por la interfaz y proporcionando diferentes implementaciones.

`Ejemplo`
> Imaginemos un sistema para diferentes tipos de formas geométricas. Podemos crear una interfaz Forma que define métodos para calcular el área y el perímetro, y luego crear clases específicas para CirculoInt y RectanguloInt que implementan esta interfaz.

`Explicación interfaces`

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/abstraction/interfaces/Shape.java
```

> Declara los métodos calcularArea() y calcularPerimetro() que las clases deben implementar.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/abstraction/interfaces/Circle.java
```

> Implementa la interfaz Forma y proporciona las implementaciones de calcularArea() y calcularPerimetro(). Incluye un atributo color y un método getColor() para obtener el color del círculo.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/abstraction/interfaces/Rectangle.java
```

> Implementa la interfaz Forma y proporciona las implementaciones de calcularArea() y calcularPerimetro(). Incluye un atributo color y un método getColor() para obtener el color del rectángulo.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/Main.java
```

> Crea instancias de CirculoInt y RectanguloInt y llama a sus métodos para demostrar la abstracción en acción. Utiliza el operador de conversión de tipo (CirculoInt) y (RectanguloInt) para acceder a los métodos específicos de cada clase, como getColor().

`Resumen interfaces`
> La abstracción en Java mediante el uso de interfaces permite definir contratos que las clases deben cumplir sin dictar cómo deben implementarse esos contratos. Esto proporciona flexibilidad y separación de preocupaciones, mejorando la modularidad y mantenibilidad del código.

> [!NOTE]
> Puedes encontrar más información en el siguiente link: [POO-abstraction](https://www.javatpoint.com/interface-in-java)

## Clase abstracta
Una clase abstracta es una clase en la Programación Orientada a Objetos (POO) que no puede ser instanciada directamente y está diseñada para ser extendida por otras clases. Las clases abstractas pueden contener métodos abstractos, que son métodos declarados sin implementación, y métodos concretos, que tienen implementación.

Las clases abstractas se utilizan para definir una estructura común y un comportamiento compartido que pueden ser heredados por las subclases. Al declarar una clase abstracta, se indica que la clase tiene algún comportamiento que debe ser definido por sus subclases.

`Características de las Clases Abstractas`
1. No pueden ser instanciadas: No se puede crear una instancia directa de una clase abstracta.
2. Pueden contener métodos abstractos y concretos: Los métodos abstractos deben ser implementados por las subclases.
3. Pueden tener atributos y constructores: Las clases abstractas pueden tener atributos y constructores que pueden ser utilizados por las subclases.
4. Pueden implementar métodos concretos: Además de declarar métodos abstractos, las clases abstractas pueden proporcionar implementaciones concretas para algunos métodos.

`Ejemplo`
> Imaginemos un sistema para diferentes tipos de empleados. Podemos crear una clase abstracta Empleado que define métodos y atributos comunes, y luego crear subclases específicas como EmpleadoTiempoCompleto y EmpleadoMedioTiempo que extienden Empleado y proporcionan implementaciones específicas..

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/concepts/abstractClasses/Employee.java
```

`Explicación`
> Clase Abstracta Empleado: Tiene atributos nombre e id y un constructor para inicializarlos. Incluye un método concreto getNombre() que devuelve el nombre del empleado. Declara un método abstracto calcularSalario() que debe ser implementado por las subclases.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/concepts/abstractClasses/EmployeeFullTime.java
```
> Subclase EmpleadoTiempoCompleto: Extiende Empleado e implementa el método abstracto calcularSalario() para calcular el salario de un empleado a tiempo completo.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/concepts/abstractClasses/EmployeePartTime.java
```
> Subclase EmpleadoMedioTiempo: Extiende Empleado e implementa el método abstracto calcularSalario() para calcular el salario de un empleado a medio tiempo.

`Beneficios de Usar Clases Abstractas`
1. Reutilización de Código: Permiten la reutilización de código común entre varias clases.
2. Estructura Común: Proporcionan una estructura común que deben seguir las subclases, facilitando la coherencia en el diseño del sistema.
3. Extensibilidad: Facilitan la creación de nuevas clases que extienden la funcionalidad existente sin necesidad de modificar el código base.

`Resumen`
> Una clase abstracta es una clase que no puede ser instanciada directamente y que puede contener métodos abstractos y concretos. Las subclases que extienden la clase abstracta deben proporcionar implementaciones para los métodos abstractos, permitiendo así definir un comportamiento común que puede ser compartido y extendido por las subclases. Esto facilita la creación de estructuras de código más organizadas y mantenibles.

`Diferencias entre una clase asbtracta y una interfaz`

Clase abstracta
1. Propósito: Compartir código común entre subclases
2. Métodos: Puede tener métodos abstractos y concretos
3. Atributos: Puede tener atributos de instancia y clase
4. Herencia: Una clase solo puede extender una clase abstracta
5. Constructores: Puede tener constructores
6. Modificadores de Acceso: Métodos pueden tener cualquier modificador de acceso

Interfaz
1. Propósito: Definir un contrato que las clases deben cumplir
2. Métodos: Solo métodos abstractos hasta Java 8; desde Java 8 puede tener métodos default y static
3. Atributos: Solo constantes (public static final)
4. Herencia: Una clase puede implementar múltiples interfaces
5. Constructores: No puede tener constructores
6. Modificadores de Acceso: Métodos son public por defecto; desde Java 9, los métodos private son permitidos dentro de la interfaz



