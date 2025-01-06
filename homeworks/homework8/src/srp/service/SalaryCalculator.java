package srp.service;

import srp.model.Employee;

public class SalaryCalculator implements Calculator {

    private final Employee employee;

    public SalaryCalculator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double calculate(Object o) {
        return employee.getHoursWorked() * employee.getHourlyRate();
    }
}
