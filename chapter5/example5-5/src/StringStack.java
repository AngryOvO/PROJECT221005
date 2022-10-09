import java.util.Scanner;

public class StringStack implements Stack
{
    int max;
    int top = -1;
    String [] stack;
    Scanner sc = new Scanner(System.in);

    public StringStack()
    {
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        this.max = sc.nextInt();
        this.stack = new String[max];
    }

    @Override
    public int length()
    {
        return top;
    }

    @Override
    public int capacity()
    {
        return max;
    }

    @Override
    public String pop()
    {
        if(top == -1)
            return null;
        String str = stack[top];
        top--;
        return str;
    }

    @Override
    public boolean push(String val)
    {
        if(top == max-1)
        {
            System.out.println("스택이 꽉 차서 푸시 불가!");
            return false;
        }

        top++;
        stack[top] = val;
        return true;
    }
}
