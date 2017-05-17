package usage

import usage.us.{USEmployeeAndContractorPayroll, USEmployeePayroll}


object Run {

  def main(args: Array[String]): Unit = {

    val usPayroll = new USEmployeePayroll.USPayroll
    USEmployeePayroll.processPayroll(usPayroll)

    println("\n---------------------------\n")

    val usPayrollWithContractors = new USEmployeeAndContractorPayroll.USPayroll
    USEmployeeAndContractorPayroll.processPayroll(usPayrollWithContractors)

    println("\n---------------------------\n")
  }

}
