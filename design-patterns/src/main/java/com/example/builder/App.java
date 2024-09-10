package com.example.builder;


class Employee{

    private  int id;
    private  String name;
    private  double salary;
    private  String dept;
    private  String designation;

    public Employee(int id, String name, double salary, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }


    public static class EmployeeBuilder{

        private  int id;
        private  String name;
        private  double salary;
        private  String dept;
        private  String designation;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder setDept(String dept) {
            this.dept = dept;
            return this;
        }

        public EmployeeBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public Employee build(){
            return new Employee(id,name,salary,dept,designation);
        }
    }

}

public class App {
    public static void main(String[] args) {

      Employee e=new Employee.EmployeeBuilder()
              .setId(1)
              .setSalary(1000)
              .setName("John")
              .build();

        System.out.println(e);

    }
}
