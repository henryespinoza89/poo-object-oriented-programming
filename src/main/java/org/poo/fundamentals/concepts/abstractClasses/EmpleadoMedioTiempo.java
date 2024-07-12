package org.poo.fundamentals.concepts.abstractClasses;

public class EmpleadoMedioTiempo extends Empleado {
  private double salarioPorHora;
  private int horasTrabajadas;
  public EmpleadoMedioTiempo(String nombre, int id, double salarioPorHora, int horasTrabajadas) {
    super(nombre, id);
    this.salarioPorHora = salarioPorHora;
    this.horasTrabajadas = horasTrabajadas;
  }
  @Override
  public double calcularSalario() {
    return salarioPorHora + horasTrabajadas;
  }
  /* Explicación:
   Subclase EmpleadoMedioTiempo:
   Extiende Empleado e implementa el método abstracto calcularSalario() para calcular el salario de un empleado
   a medio tiempo.*/
}
