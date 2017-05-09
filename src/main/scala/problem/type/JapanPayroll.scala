package problem.`type`

import library.base.{Employee, Payroll}

class JapanPayroll extends Payroll {

  def processEmployees(employees: Vector[Employee]) = Left("Japan payroll")

}
