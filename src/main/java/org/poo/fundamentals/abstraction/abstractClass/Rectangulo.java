package org.poo.fundamentals.abstraction.abstractClass;

public class Rectangulo extends Forma {
  private double ancho;
  private double alto;
  public Rectangulo(String color, double ancho, double alto) {
    super(color);
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
