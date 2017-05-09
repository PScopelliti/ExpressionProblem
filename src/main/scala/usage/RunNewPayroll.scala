package usage


object RunNewPayroll {

  def main(args: Array[String]): Unit = {

    val usPayroll = new USPayrollInstance.USPayroll
    USPayrollInstance.processPayroll(usPayroll)

    val usPayrollWithContractors = new USWithContractorPayrollInstance.USPayroll
    USWithContractorPayrollInstance.processPayroll(usPayrollWithContractors)
  }

}
