package usage


object Run {

  def main(args: Array[String]): Unit = {

    val usPayroll = new USEmployeePayroll.USPayroll
    USEmployeePayroll.processPayroll(usPayroll)

    val usPayrollWithContractors = new USEmployeeAndContractorPayroll.USPayroll
    USEmployeeAndContractorPayroll.processPayroll(usPayrollWithContractors)
  }

}
