package solution.extension.operation

import solution.USPayrollSystem
import solution.extension.operation.base.ContractorPayrollSystem

trait USContractorPayrollSystem extends USPayrollSystem with ContractorPayrollSystem {

  //You’re shadowing the former definition of USPayroll.
  class USPayroll extends super.USPayroll with Payroll {

    def processContractors(contractors: Vector[Contractor]) = {
      println("US contract payroll")
      Left("US contract payroll")
    }

  }

}
