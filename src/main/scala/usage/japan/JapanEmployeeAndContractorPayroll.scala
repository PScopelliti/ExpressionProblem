package usage.japan

import solution.extension.operation.JapanContractorPayrollSystem


object JapanEmployeeAndContractorPayroll extends JapanContractorPayrollSystem {

  type P = JapanPayroll

  def processPayroll(p: JapanPayroll): Either[String, Throwable] = {

    p.processEmployees(Vector(Employee("a", 1)))

    p.processContractors(Vector(Contractor("b")))

    Left("payroll processed successfully")
  }

}
