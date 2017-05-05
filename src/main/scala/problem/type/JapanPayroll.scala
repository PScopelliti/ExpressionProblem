package problem.`type`

import problem.base.ext.{Employee, Payroll}

class JapanPayroll extends Payroll {

  def processEmployees(employees: Vector[Employee]) = Left("Japan payroll")

}
