package solution.extension.`type`

import solution.ext.PayrollSystem

//it will be easy to add a new Payroll type for Japan.
trait JapanPayrollSystem extends PayrollSystem {

  class JapanPayroll extends Payroll {
    def processEmployees(employees: Vector[Employee]) = {
      println("Japan payroll")
      Left("Japan payroll")
    }
  }

}
