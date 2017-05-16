package problem.visitor

import problem.visitor.`type`.{JapanPayrollVisitor, USPayrollVisitor}


trait PayrollVisitor {

  def visit(payroll: USPayrollVisitor): Either[String, Throwable]

  def visit(payroll: JapanPayrollVisitor): Either[String, Throwable]

}
