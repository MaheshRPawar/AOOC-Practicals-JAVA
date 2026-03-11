import java.util.*;

class StackQueueEx2_4
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Elements: " + stack);
        System.out.println("Stack Pop: " + stack.pop());

        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("Queue Elements: " + queue);
        System.out.println("Queue Remove: " + queue.remove());
    }
}