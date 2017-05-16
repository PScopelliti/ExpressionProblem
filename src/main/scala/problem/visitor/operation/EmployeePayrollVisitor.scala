package problem.visitor.operation

import problem.visitor.PayrollVisitor
import problem.visitor.`type`.{JapanPayrollVisitor, USPayrollVisitor}


class EmployeePayrollVisitor extends PayrollVisitor {

  def visit(payroll: USPayrollVisitor): Either[String, Throwable] = Left("US payroll")

  def visit(payroll: JapanPayrollVisitor): Either[String, Throwable] = Left("Canada payroll")

}
