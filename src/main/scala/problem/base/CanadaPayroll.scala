package problem.base

import problem.base.ext.{Employee, Payroll}


class CanadaPayroll extends Payroll {

  def processEmployees(employees: Vector[Employee]) = Left("Canada payroll")

}
