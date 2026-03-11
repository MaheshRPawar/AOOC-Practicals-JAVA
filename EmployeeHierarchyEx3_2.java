class Employee
{
    String name;
    String address;
    double salary;
    String jobTitle;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

class Manager extends Employee
{
    void calculateBonus()
    {
        System.out.println("Manager Bonus: " + salary * 0.20);
    }
}

class Developer extends Employee
{
    void calculateBonus()
    {
        System.out.println("Developer Bonus: " + salary * 0.15);
    }
}

class Programmer extends Employee
{
    void calculateBonus()
    {
        System.out.println("Programmer Bonus: " + salary * 0.10);
    }
}

class EmployeeHierarchyEx3_2
{
    public static void main(String[] args)
    {
        Manager m = new Manager();
        m.name = "Mahesh";
        m.address = "Pune";
        m.salary = 50000;
        m.jobTitle = "Manager";
        m.display();
        m.calculateBonus();
    }
}