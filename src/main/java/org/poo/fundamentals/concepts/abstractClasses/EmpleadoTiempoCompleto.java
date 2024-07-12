package org.poo.fundamentals.concepts.abstractClasses;

public class EmpleadoTiempoCompleto extends Empleado {
  private double salarioBase;
  public EmpleadoTiempoCompleto(String nombre, int id, double salarioBase) {
    super(nombre, id);
    this.salarioBase = salarioBase;
  }
  @Override
  public double calcularSalario() {
    return salarioBase;
  }
  /* Explicación:
   Subclase EmpleadoTiempoCompleto:
   Extiende Empleado e implementa el método abstracto calcularSalario() para calcular el salario de un empleado
   a tiempo completo.*/
}
