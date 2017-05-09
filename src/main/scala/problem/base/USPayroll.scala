package problem.base

import library.base.{Employee, Payroll}


class USPayroll extends Payroll {

  def processEmployees(employees: Vector[Employee]) = Left("US payroll")

}
