package problem.visitor.operation

import problem.visitor.PayrollVisitor
import problem.visitor.`type`.{JapanPayrollVisitor, USPayrollVisitor}


// You can easily add new operation
class ContractorPayrollVisitor extends PayrollVisitor {

  def visit(payroll: USPayrollVisitor): Either[String, Throwable] = Left("US contractor payroll")

  def visit(payroll: JapanPayrollVisitor): Either[String, Throwable] = Left("US contractor payroll")

}

// What about the type
// If you try to add a new type called JapanPayroll, you have a problem.
// You have to go back and change all the visitors to accept a JapanPayroll type.