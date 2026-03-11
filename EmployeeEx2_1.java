class Employee
{
    String firstName;
    String lastName;
    double monthlySalary;

    Employee(String f, String l, double salary)
    {
        firstName = f;
        lastName = l;

        if(salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    void setFirstName(String f)
    {
        firstName = f;
    }

    String getFirstName()
    {
        return firstName;
    }

    void setLastName(String l)
    {
        lastName = l;
    }

    String getLastName()
    {
        return lastName;
    }

    void setMonthlySalary(double salary)
    {
        if(salary > 0)
            monthlySalary = salary;
    }

    double getMonthlySalary()
    {
        return monthlySalary;
    }
}

class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Mahesh","Pawar",20000);
        Employee e2 = new Employee("Rahul","Patil",25000);

        System.out.println("Yearly Salary of Employee 1: " + (e1.getMonthlySalary()*12));
        System.out.println("Yearly Salary of Employee 2: " + (e2.getMonthlySalary()*12));

        e1.setMonthlySalary(e1.getMonthlySalary()*1.10);
        e2.setMonthlySalary(e2.getMonthlySalary()*1.10);

        System.out.println("After 10% Raise");

        System.out.println("Yearly Salary of Employee 1: " + (e1.getMonthlySalary()*12));
        System.out.println("Yearly Salary of Employee 2: " + (e2.getMonthlySalary()*12));
    }
}