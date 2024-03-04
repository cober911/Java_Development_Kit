package Seminar4.seminar;


import java.time.temporal.Temporal;

/**
 * lesson_4
 */
public class App {
    public static void main(String[] args) {
        
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        Employee employee1 = new Employee("Кирил", 199239, "331931101", 12);
        Employee employee2 = new Employee("Леха", 99983, "91319300", 7);
        Employee employee3 = new Employee("Макс", 11101, "999119191", 12);

        
        employeeDirectory.add(employee1);
        employeeDirectory.add(employee2);
        employeeDirectory.add(employee3);
        
        System.out.println(employeeDirectory.findEmployeeByExperience(12));
        System.out.println(employeeDirectory.getPhoneEmployee("Макс"));
        System.out.println(employeeDirectory.findServiceNumber(11101));
    }
}


