package org.poo.fundamentals.abstraction.abstractClass;

public class Rectangle extends Shape {
  private double width;
  private double height;
  public Rectangle(String colour, double width, double height) {
    super(colour);
    this.width = width;
    this.height = height;
  }
  @Override
  public double calculateArea() {
    return width * height;
  }
  @Override
  public double calculatePerimeter() {
    return 2 * (width + height);
  }
}
