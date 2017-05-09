package usage

import solution.USPayrollSystem

object USPayrollInstance extends USPayrollSystem {

  type P = USPayroll

  def processPayroll(p: USPayroll) = {
    p.processEmployees(Vector(Employee("a", 1)))
    Left("payroll processed successfully")
  }
}
