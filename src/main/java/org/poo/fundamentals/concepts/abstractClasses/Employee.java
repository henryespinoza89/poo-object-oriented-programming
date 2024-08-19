package org.poo.fundamentals.concepts.abstractClasses;

public abstract class Employee {
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
}
