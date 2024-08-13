package org.poo.fundamentals.abstraction.abstractClass;

abstract class Shape {
  private String colour;
  public Shape(String colour) {
    this.colour = colour;
  }
  public String getColour() {
    return colour;
  }
  public abstract double calculateArea();
  public abstract double calculatePerimeter();
}
