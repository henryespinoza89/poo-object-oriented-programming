package org.poo.fundamentals.concepts.abstractClasses;

public class EmployeeFullTime extends Employee {
  private double salaryBase;
  public EmployeeFullTime(String name, int id, double salaryBase) {
    super(name, id);
    this.salaryBase = salaryBase;
  }
  @Override
  public double calculateSalary() {
    return salaryBase;
  }
  /* Explicación:
   Subclase EmpleadoTiempoCompleto:
   Extiende Empleado e implementa el método abstracto calcularSalario() para calcular el salario de un empleado
   a tiempo completo.*/
}
