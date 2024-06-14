package polymorphism;

public class PayrollSystem {
	// Calculate salary for full-time employee
    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
    
    // Calculate salary for part-time employee
    public double calculateSalary(double monthlyRate) {
        return monthlyRate;
    }
    
    // Calculate salary for contract employee
    public double calculateSalary(int hoursWorked, double hourlyRate, double bonus) {
        return (hoursWorked * hourlyRate) + bonus;
    }
    
    // Other methods related to payroll can be added here
	public static void main(String[] args) {
		  PayrollSystem payroll = new PayrollSystem();
	        
	        // Calculate salary for full-time employee
	        System.out.println("Full-time employee salary: " + payroll.calculateSalary(160, 25.0)); 
	        
	        // Calculate salary for part-time employee
	        System.out.println("Part-time employee salary: " + payroll.calculateSalary(1000.0)); 
	        
	        // Calculate salary for contract employee
	        System.out.println("Contract employee salary: " + payroll.calculateSalary(80, 30.0, 500.0)); 

	}

}
