package usage

import solution.USPayrollSystem
import solution.extension.operation.USContractorPayrollSystem


object RunNewPayroll {

  object USPayrollInstance extends USPayrollSystem {

    type P = USPayroll

    def processPayroll(p: USPayroll) = {
      p.processEmployees(Vector(Employee("a", 1)))
      Left("payroll processed successfully")
    }
  }

  object USWithContractorPayrollInstance extends USContractorPayrollSystem {

    type P = USPayroll

    def processPayroll(p: USPayroll): Either[String, Throwable] = {
      p.processEmployees(Vector(Employee("a", 1)))
      p.processContractors(Vector(Contractor("b")))
      Left("payroll processed successfully")
    }

  }

  def main(args: Array[String]): Unit = run

  def run = {

    val usPayroll = new USPayrollInstance.USPayroll
    USPayrollInstance.processPayroll(usPayroll)


    val usPayrollWithContractors = new USWithContractorPayrollInstance.USPayroll
    USWithContractorPayrollInstance.processPayroll(usPayrollWithContractors)

  }

}
