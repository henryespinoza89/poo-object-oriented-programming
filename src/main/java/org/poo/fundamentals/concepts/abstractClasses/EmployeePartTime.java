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
}
