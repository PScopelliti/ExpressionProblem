package problem.visitor.`type`

import problem.visitor.PayrollVisitor

class USPayrollVisitor {

  def accept(v: PayrollVisitor) = v.visit(this)
}
