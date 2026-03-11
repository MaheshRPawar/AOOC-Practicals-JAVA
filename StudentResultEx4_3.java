class Student
{
    int rollNo;

    void setRollNo(int r)
    {
        rollNo = r;
    }

    int getRollNo()
    {
        return rollNo;
    }
}

class Test extends Student
{
    int sub1, sub2;

    void setMarks(int m1, int m2)
    {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks()
    {
        System.out.println("Subject1: " + sub1);
        System.out.println("Subject2: " + sub2);
    }
}

interface Sports
{
    int sMarks = 10;
}

class Result extends Test implements Sports
{
    void display()
    {
        int total = sub1 + sub2 + sMarks;

        System.out.println("Roll No: " + rollNo);
        getMarks();
        System.out.println("Sports Marks: " + sMarks);
        System.out.println("Total Marks: " + total);
    }
}

class StudentResultEx4_3
{
    public static void main(String[] args)
    {
        Result r = new Result();

        r.setRollNo(85);
        r.setMarks(75,80);

        r.display();
    }
}

