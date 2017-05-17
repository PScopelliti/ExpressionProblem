package usage.us

import solution.extension.`type`.USPayrollSystem

object USEmployeePayroll extends USPayrollSystem {

  type P = USPayroll

  def processPayroll(p: USPayroll) = {

    p.processEmployees(Vector(Employee("a", 1)))

    Left("payroll processed successfully")
  }
}
