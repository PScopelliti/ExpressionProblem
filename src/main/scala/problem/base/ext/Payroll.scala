package problem.base.ext

trait Payroll {

  def processEmployees(employees: Vector[Employee]): Either[String, Throwable]

}
