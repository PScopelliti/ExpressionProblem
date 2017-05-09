package usage

import usage.japan.{JapanEmployeeAndContractorPayroll, JapanEmployeePayroll}
import usage.us.{USEmployeeAndContractorPayroll, USEmployeePayroll}


object Run {

  def main(args: Array[String]): Unit = {

    val usPayroll = new USEmployeePayroll.USPayroll
    USEmployeePayroll.processPayroll(usPayroll)

    println("\n---------------------------\n")

    val usPayrollWithContractors = new USEmployeeAndContractorPayroll.USPayroll
    USEmployeeAndContractorPayroll.processPayroll(usPayrollWithContractors)

    println("\n---------------------------\n")

    val japanesePayroll = new JapanEmployeePayroll.JapanPayroll
    JapanEmployeePayroll.processPayroll(japanesePayroll)

    println("\n---------------------------\n")

    val japanPayrollWithContractors = new JapanEmployeeAndContractorPayroll.JapanPayroll
    JapanEmployeeAndContractorPayroll.processPayroll(japanPayrollWithContractors)

    println("\n---------------------------\n")
  }

}
