package problem.operation

import library.base.{Employee, Payroll}

trait ExtendedPayroll extends Payroll {

  def processEmployees(employees: Vector[Employee]): Either[String, Throwable]

  def processContractors(contractors: Vector[Contractor]): Either[String, Throwable]

}