package solution.extension.operation.base

import solution.ext.PayrollSystem


trait ContractorPayrollSystem extends PayrollSystem {

  case class Contractor(name: String)

  // The Payroll trait defined inside the ContractorPayrollSystem
  // doesn’t override but instead shadows the former definition
  // of Payroll type from PayrollSystem. The former definition
  // of Payroll is accessible in the context of ContractPayrollSystem
  // using the super keyword. Shadowing can introduce unintended errors
  // in your code, but in this context it lets you extend
  // the old definition of Payroll without overriding it.

  trait Payroll extends super.Payroll { //Shadowing the Payroll trait defined in PayrollSystem

    def processContractors(contractors: Vector[Contractor]): Either[String, Throwable]

  }

}
