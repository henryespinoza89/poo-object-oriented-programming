package org.poo.fundamentals.abstraction.interfaces;

public class RectanguloInt implements Forma {
  private double ancho;
  private double alto;
  private String color;
  public String getColor() {
    return color;
  }
  public RectanguloInt(String color, double ancho, double alto) {
    this.color = color;
    this.ancho = ancho;
    this.alto = alto;
  }
  @Override
  public double calcularArea() {
    return ancho * alto;
  }
  @Override
  public double calcularPerimetro() {
    return 2 * (ancho + alto);
  }
}
