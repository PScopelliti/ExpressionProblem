package solution.extension.operation

import solution.CanadaPayrollSystem
import solution.extension.operation.base.ContractorPayrollSystem

trait CanadaContractorPayrollSystem extends CanadaPayrollSystem with ContractorPayrollSystem {

  //You’re shadowing the former definition of CanadaPayroll.
  class CanadaPayroll extends super.CanadaPayroll with Payroll {

    def processContractors(contractors: Vector[Contractor]) = {
      println("Canada contract payroll")
      Left("Canada contract payroll")
    }

  }

}