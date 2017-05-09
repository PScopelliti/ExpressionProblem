package usage.us

import solution.extension.operation.USContractorPayrollSystem

object USEmployeeAndContractorPayroll extends USContractorPayrollSystem {

  type P = USPayroll

  def processPayroll(p: USPayroll): Either[String, Throwable] = {

    p.processEmployees(Vector(Employee("a", 1)))

    p.processContractors(Vector(Contractor("b")))

    Left("payroll processed successfully")
  }

}
