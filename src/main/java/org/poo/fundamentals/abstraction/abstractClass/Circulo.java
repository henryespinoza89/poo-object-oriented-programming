package org.poo.fundamentals.abstraction.abstractClass;

public class Circulo extends Forma {
  private double radio;
  public Circulo(String color, double radio) {
    super(color);
    this.radio = radio;
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
