package org.poo.fundamentals;

import org.poo.fundamentals.abstraction.abstractClass.Circle;
import org.poo.fundamentals.abstraction.abstractClass.Rectangle;
import org.poo.fundamentals.abstraction.interfaces.CirculoInt;
import org.poo.fundamentals.abstraction.interfaces.RectangleInt;
import org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample.Counter;
import org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample.ExampleStaticBlock;
import org.poo.fundamentals.concepts.AccessModifiers.staticFinal.staticExample.Utilities;
import org.poo.fundamentals.concepts.abstractClasses.Employee;
import org.poo.fundamentals.concepts.abstractClasses.EmployeePartTime;
import org.poo.fundamentals.concepts.abstractClasses.EmployeeFullTime;
import org.poo.fundamentals.encapsulation.Person;
import org.poo.fundamentals.inheritance.Animal;
import org.poo.fundamentals.inheritance.Dog;
import org.poo.fundamentals.polymorphism.overload.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);
  public static void main(String[] args) {
    /* inheritance */
    Animal animal = new Animal("Thor", 6);
    animal.makeSound();
    animal.describe();
    Dog dog = new Dog("chihuahua", "Saturno", 5);
    dog.makeSound();
    dog.describe();
    /* encapsulation */
    Person person = new Person("Jose", 25);
    logger.info("Name {}", person.getName());
    logger.info("Age {}", person.getAge());
    person.describe();
    person.setAge(-5);
    /* Polymorphism */
    Calculator calculator = new Calculator();
    logger.info("sum of integers: {}", calculator.add(2, 3));
    logger.info("sum of doubles: {}", calculator.add(2.0, 3.0));
    org.poo.fundamentals.polymorphism.overwrite.Animal newAnimal = new org.poo.fundamentals.polymorphism.overwrite.Animal();
    org.poo.fundamentals.polymorphism.overwrite.Animal miDog = new org.poo.fundamentals.polymorphism.overwrite.Dog();
    newAnimal.makeSound();
    miDog.makeSound();
    /* Abstraction */
    /* Using abstract classes */
    Circle circle = new Circle("Red", 5);
    Rectangle rectangle = new Rectangle("Blue", 4, 7);
    logger.info("Circle color: {}", circle.getColour());
    logger.info("Circle area: {}", circle.calculateArea());
    logger.info("Circle perimeter: {}", circle.calculatePerimeter());
    logger.info("Rectangle colour: {}", rectangle.getColour());
    logger.info("Rectangle area: {}", rectangle.calculateArea());
    logger.info("Rectangle perimeter: {}", rectangle.calculatePerimeter());
    /* Using interfaces */
    CirculoInt circuloI = new CirculoInt("Red", 5);
    RectangleInt rectanguloI = new RectangleInt("Blue", 4, 7);
    logger.info("Circle color: {}", circuloI.getColour());
    logger.info("Circle area: {}", circuloI.calculateArea());
    logger.info("Circle perimeter: {}", circuloI.calculatePerimeter());
    logger.info("Rectangle colour: {}", rectanguloI.getColour());
    logger.info("Rectangle area: {}", rectanguloI.calculateArea());
    logger.info("Rectangle perimeter: {}", rectanguloI.calculatePerimeter());
    /* Abstracts classes */
    Employee emp1 = new EmployeeFullTime("Juan", 1, 50000);
    Employee emp2 = new EmployeePartTime("Ana", 2, 20, 25);
    logger.info("Salary of {}: {}", emp1.getName(), emp1.calculateSalary());
    logger.info("Salary of {}: {}", emp2.getName(), emp2.calculateSalary());
    /* Modifiers static and final */
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter.showAccount(); // Output: Account: 2
    /* Static */
    int result = Utilities.add(5, 3); // Call the static method without creating an instance of Utilities
    logger.info("Result: {}", result); // Output: Result: 8
    ExampleStaticBlock.showValue(); // Output: Value: 42
  }
}