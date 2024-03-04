package Seminar4.seminar;


import java.util.List;

public class Employee {
    private final String name;
    private final int serviceNumber;
    private final String phone;
    private final int experience;
    private List<Employee> Employees;
    
    public Employee(String name, int serviceNumber, String phone, int experience) {
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.phone = phone;
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void addPersona(Employee Employee) {
        Employees.add(Employee);
    }


}

