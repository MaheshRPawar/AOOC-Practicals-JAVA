class Student
{
    int roll_no;

    void getRoll(int r)
    {
        roll_no = r;
    }
}

class Test extends Student
{
    int sub1, sub2;

    void getMarks(int m1, int m2)
    {
        sub1 = m1;
        sub2 = m2;
    }
}

class Result extends Test
{
    void displayResult()
    {
        int total = sub1 + sub2;

        System.out.println("Roll No: " + roll_no);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
        System.out.println("Total Marks: " + total);
    }
}

class MultilevelInheritanceEx3_4
{
    public static void main(String[] args)
    {
        Result r = new Result();

        r.getRoll(85);
        r.getMarks(75, 80);

        r.displayResult();
    }
}