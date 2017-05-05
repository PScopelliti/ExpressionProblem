package solution.ext

trait PayrollSystem {

  // You nest everything inside a trait so that you can treat it as a module.
  case class Employee(name: String, id: Long)

  // The type P denotes some subtype of the Payroll trait,
  // which declares an abstract method to process salaries for employees.
  type P <: Payroll

  trait Payroll {
    def processEmployees(employees: Vector[Employee]): Either[String, Throwable]
  }

  // The processPayroll method needs to be
  // implemented to process payrolls for a given Payroll type.
  def processPayroll(p: P): Either[String, Throwable]
}
