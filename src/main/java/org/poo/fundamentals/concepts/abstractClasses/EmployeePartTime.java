package org.poo.fundamentals.concepts.abstractClasses;

public class EmployeePartTime extends Employee {
  private double salaryPerHour;
  private int hoursWorked;
  public EmployeePartTime(String name, int id, double salaryPerHour, int hoursWorked) {
    super(name, id);
    this.salaryPerHour = salaryPerHour;
    this.hoursWorked = hoursWorked;
  }
  @Override
  public double calculateSalary() {
    return salaryPerHour + hoursWorked;
  }
  /* Explicación:
   Subclase EmpleadoMedioTiempo:
   Extiende Empleado e implementa el método abstracto calcularSalario() para calcular el salario de un empleado
   a medio tiempo.*/
}
