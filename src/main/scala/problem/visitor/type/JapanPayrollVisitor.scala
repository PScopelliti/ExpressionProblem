package problem.visitor.`type`

import problem.visitor.PayrollVisitor

class JapanPayrollVisitor {

  def accept(v: PayrollVisitor) = v.visit(this)

}
