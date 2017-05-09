package usage.japan

import solution.extension.`type`.JapanPayrollSystem


object JapanEmployeePayroll extends JapanPayrollSystem {

  type P = JapanPayroll

  def processPayroll(p: JapanPayroll) = {

    p.processEmployees(Vector(Employee("a", 1)))

    Left("payroll processed successfully")
  }
}