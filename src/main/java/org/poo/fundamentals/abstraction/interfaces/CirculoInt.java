package org.poo.fundamentals.abstraction.interfaces;

public class CirculoInt implements Shape {
  private double radius;
  private String colour;
  public CirculoInt(String colour, double radius) {
    this.colour = colour;
    this.radius = radius;
  }
  public String getColour() {
    return colour;
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
