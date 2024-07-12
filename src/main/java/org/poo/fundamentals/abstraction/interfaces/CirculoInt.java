package org.poo.fundamentals.abstraction.interfaces;

public class CirculoInt implements Forma {
  private double radio;
  private String color;
  public CirculoInt(String color, double radio) {
    this.color = color;
    this.radio = radio;
  }
  public String getColor() {
    return color;
  }
  @Override
  public double calcularArea() {
    return Math.PI * radio * radio;
  }
  @Override
  public double calcularPerimetro() {
    return 2 * Math.PI * radio;
  }
}
