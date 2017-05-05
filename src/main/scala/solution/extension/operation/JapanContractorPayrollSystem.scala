package solution.extension.operation

import solution.extension.`type`.JapanPayrollSystem
import solution.extension.operation.base.ContractorPayrollSystem


trait JapanContractorPayrollSystem extends JapanPayrollSystem with ContractorPayrollSystem {

  class JapanPayroll extends super.JapanPayroll with Payroll {

    def processContractors(contractors: Vector[Contractor]) = {
      println("Japan contract payroll")
      Left("Japan contract payroll")
    }

  }

}
