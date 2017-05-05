package problem.visitor

trait PayrollVisitor {

  def visit(payroll: USPayrollVisitor): Either[String, Throwable]

  def visit(payroll: CanadaPayrollVisitor): Either[String, Throwable]

}

class USPayrollVisitor {

  def accept(v: PayrollVisitor) = v.visit(this)

}

class CanadaPayrollVisitor {

  def accept(v: PayrollVisitor) = v.visit(this)

}

class EmployeePayrollVisitor extends PayrollVisitor {

  def visit(payroll: USPayrollVisitor): Either[String, Throwable] = Left("US payroll")

  def visit(payroll: CanadaPayrollVisitor): Either[String, Throwable] = Left("Canada payroll")

}

// You can easily add new operation
class ContractorPayrollVisitor extends PayrollVisitor {

  def visit(payroll: USPayrollVisitor): Either[String, Throwable] = Left("US contractor payroll")

  def visit(payroll: CanadaPayrollVisitor): Either[String, Throwable] = Left("US contractor payroll")

}

// What about the type
// If you try to add a new type called JapanPayroll, you have a problem.
// You have to go back and change all the visitors to accept a JapanPayroll type.