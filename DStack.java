public class DStack {

    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    
    void push(int data)
    {
        if(top == capacity)
            expand();
        stack[top++] = data;
    }

    private void expand() {
        int length = size();
        capacity *= 2;
        int newStak[] = new int[capacity];
        
        for(int i = 0; i < length; i++)
        {
            newStak[i] = stack[i];
        }
        stack = newStak;
    }

    int pop()
    {
        int data = 0;
        if(size() == 0)
        {
            System.out.println("Out of bounds");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length = size();
        if(capacity <= (capacity/2)/2)
        {
            capacity = capacity / 2;
        }
        int newStack[] = new int[capacity];
        for(int i = 0; i < length; i++)
        {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    int size()
    {
        return top;
    }
    int peek()
    {
        return stack[top - 1];
    }
    boolean isEmpty()
    {
        return top == 0;
    }

    void show()
    {
        for(int n : stack)
        {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
