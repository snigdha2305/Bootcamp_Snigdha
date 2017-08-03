package packagerday6;

public class HRService {
    private final EmployeeService employeeService;

    public HRService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public boolean eligibleForPromotion() {
        if (employeeService.getDesig() == "G2L2") {
            return true;
        }
        return false;
    }

    public String changeDesignation() {
        if (eligibleForPromotion() == true) {
            return "Senior Technical";
        }
        return "Technical";
    }

    public boolean changeProject() {
        if (changeDesignation() == "Senior Technical") {
            return true;
        }
        return false;
    }
}