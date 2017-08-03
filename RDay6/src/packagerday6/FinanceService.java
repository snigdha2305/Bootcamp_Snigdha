package packagerday6;

public class FinanceService {
    private final EmployeeService employeeService;

    public FinanceService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public double updateSalary() {
        double updatedSalary = employeeService.getSalary() + 10000.00;
        return updatedSalary;
    }

    public double calculateTDS() {
        double taxedSalary = employeeService.getSalary() * 0.9;
        return taxedSalary;
    }
}