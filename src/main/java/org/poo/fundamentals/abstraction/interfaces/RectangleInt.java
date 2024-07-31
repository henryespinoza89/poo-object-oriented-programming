package org.poo.fundamentals.abstraction.interfaces;

public class RectangleInt implements Shape {
  private double width;
  private double height;
  private String colour;
  public String getColour() {
    return colour;
  }
  public RectangleInt(String colour, double width, double height) {
    this.colour = colour;
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
