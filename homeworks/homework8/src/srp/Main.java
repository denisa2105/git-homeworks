package srp;

import srp.model.Employee;
import srp.report.EmployeeReport;
import srp.service.SalaryCalculator;

/**
 * Refactor the Employee class to adhere to SRP.
 * Split responsibilities into separate classes.
 */
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 160, 20.5);
        SalaryCalculator salaryCalculator = new SalaryCalculator(employee);
        EmployeeReport report = new EmployeeReport(employee, salaryCalculator);

        report.generateReport();
    }
}
