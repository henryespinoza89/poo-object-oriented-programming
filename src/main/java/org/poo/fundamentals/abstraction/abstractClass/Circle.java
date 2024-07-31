package org.poo.fundamentals.abstraction.abstractClass;

public class Circle extends Shape {
  private double radius;
  public Circle(String colour, double radius) {
    super(colour);
    this.radius = radius;
  }
  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}
