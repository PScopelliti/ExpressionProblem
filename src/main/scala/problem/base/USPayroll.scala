package problem.base

import problem.base.ext.{Employee, Payroll}


class USPayroll extends Payroll {

  def processEmployees(employees: Vector[Employee]) = Left("US payroll")

}
