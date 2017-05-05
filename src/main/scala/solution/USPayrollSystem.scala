package solution

import solution.ext.PayrollSystem


trait USPayrollSystem extends PayrollSystem {

  class USPayroll extends Payroll {

    def processEmployees(employees: Vector[Employee]) = {
      println("US payroll")
      Left("US payroll")
    }

  }

}
