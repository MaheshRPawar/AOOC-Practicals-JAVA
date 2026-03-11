interface Stack
{
    void push(int data);
    void pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack
{
    int stack[] = new int[5];
    int top = -1;

    public void push(int data)
    {
        if(top == stack.length - 1)
        {
            overflow();
        }
        else
        {
            stack[++top] = data;
        }
    }

    public void pop()
    {
        if(top == -1)
        {
            underflow();
        }
        else
        {
            System.out.println("Popped element: " + stack[top--]);
        }
    }

    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements:");
            for(int i = top; i >= 0; i--)
            {
                System.out.println(stack[i]);
            }
        }
    }

    public void overflow()
    {
        System.out.println("Stack Overflow");
    }

    public void underflow()
    {
        System.out.println("Stack Underflow");
    }
}

class StackInterfaceEx4_1
{
    public static void main(String[] args)
    {
        IntegerStack s = new IntegerStack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();

        s.display();
    }
}
