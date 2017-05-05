package problem.operation.ext

import problem.base.ext.{Employee, Payroll}
import problem.operation.Contractor

trait ExtendedPayroll extends Payroll {

  def processEmployees(employees: Vector[Employee]): Either[String, Throwable]

  def processContractors(contractors: Vector[Contractor]): Either[String, Throwable]

}