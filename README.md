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
1. Polimorfismo de Compilación (Sobrecarga de Métodos): Permite definir múltiples métodos con el mismo nombre
pero con diferentes parámetros en la misma clase, proporcionando flexibilidad para usar el mismo método en diferentes contextos.
Nuestro primer método de la clase Calculator es sobrecargado para sumar dos enteros y el segundo para sumar dos números decimales.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/polymorphism/overload/Calculator.java
```

`Ejemplo 02`

2. Polimorfismo de Ejecución (Sobrescritura de Métodos): Permite que una subclase sobrescriba un método de su
superclase para proporcionar una implementación específica. Esto permite que un método se comporte de manera diferente según el objeto que lo invoque.
El polimorfismo facilita la extensibilidad y la reutilización del código, permitiendo que los objetos de diferentes clases sean tratados de manera uniforme a través de una interfaz común.

```sh
poo-fundamentals/src/main/java/org/poo/fundamentals/polymorphism/overwrite/Dog.java
```

> [!NOTE]
> Puedes encontrar más información en el siguiente link: [POO-polimorfismo](https://www.javatpoint.com/method-overloading-in-java)










