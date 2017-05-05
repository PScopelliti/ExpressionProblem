package solution

import solution.ext.PayrollSystem

trait CanadaPayrollSystem extends PayrollSystem {

  class CanadaPayroll extends Payroll {

    def processEmployees(employees: Vector[Employee]) = {
      println("Canada payroll")
      Left("Canada payroll")
    }

  }

}
