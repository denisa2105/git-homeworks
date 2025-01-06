package srp.report;

import srp.model.Employee;
import srp.service.SalaryCalculator;

public class EmployeeReport {

    private final Employee employee;
    private final SalaryCalculator salaryCalculator;

    public EmployeeReport(Employee employee, SalaryCalculator salaryCalculator) {
        this.employee = employee;
        this.salaryCalculator = salaryCalculator;
    }

    public void generateReport() {
        System.out.println("Employee Report:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Hourly Rate: $" + employee.getHourlyRate());
        System.out.println("Salary: $" + salaryCalculator.calculate(employee));
    }
}
