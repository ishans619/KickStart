import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        
        Map<Integer, Employee> employeeDetails = new HashMap<>();

        employeeDetails.put(1001, new Employee("Ashish", "2009-04-01", "e", "R&D", 20000, 8000, 3000));
        employeeDetails.put(1002, new Employee("Sushma", "2012-08-23", "c", "PM", 30000, 12000, 9000));
        employeeDetails.put(1003, new Employee("Rahul","2008-11-12", "k", "Acct", 10000, 8000, 1000));
        employeeDetails.put(1004, new Employee("Chahat","2013-01-29", "r", "Front Desk", 12000, 6000, 2000));
        employeeDetails.put(1005, new Employee("Rahul","2005-07-16", "m", "Engg", 50000, 20000, 20000));

        Map<String, MoreDetails> moredetails = new HashMap<>();

        moredetails.put("e", new MoreDetails("Engineer", 18000));
        moredetails.put("c", new MoreDetails("Consultant", 18000));
        moredetails.put("k", new MoreDetails("Clerk", 18000));
        moredetails.put("r", new MoreDetails("Receptionist", 18000));
        moredetails.put("m", new MoreDetails("Manager", 18000));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int enteredId = scanner.nextInt();

        if (employeeDetails.containsKey(enteredId)) {
        
            Employee employee = employeeDetails.get(enteredId);
            System.out.println("Employee ID: " + enteredId);
            System.out.println("Name: " + employee.getName());
            System.out.println("Join Date: " + employee.getJoinDate());
            System.out.println("Designation Code: " + employee.getDesignationCode());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Basic Salary: $" + employee.getBasicSalary());
            System.out.println("HRA: $" + employee.getHRA());
            System.out.println("Income Tax: $" + employee.getIncomeTax());

            if(moredetails.containsKey(employee.getDesignationCode())){
                MoreDetails details = moredetails.get(employee.getDesignationCode());
                System.out.println("designation: " + details.getdesignation());
                System.out.println("DA: " + details.getDA());

            }
        } else {
            System.out.println("Employee with ID " + enteredId + " not found.");
        }   
        scanner.close();
    }
}

class Employee {
    private String name;
    private String joinDate;
    private String designationCode;
    private String department;
    private double basicSalary;
    private double HRA;
    private double incomeTax;

    public Employee(String name, String joinDate, String designationCode, String department,
                    double basicSalary, double HRA, double incomeTax) {
        this.name = name;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basicSalary = basicSalary;
        this.HRA = HRA;
        this.incomeTax = incomeTax;
    }

    public String getName() {
        return name;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getDesignationCode() {
        return designationCode;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getHRA() {
        return HRA;
    }

    public double getIncomeTax() {
        return incomeTax;
    }
}


class MoreDetails {

    private String designation;
    private double DA;

    public MoreDetails(String designation, double DA) {
        this.designation = designation;
        this.DA = DA;
    }

    public String getdesignation() {
        return designation;
    }

    public double getDA() {
        return DA;
    }
}