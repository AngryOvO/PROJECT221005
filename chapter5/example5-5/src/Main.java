import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        StringStack stack = new StringStack();

        while(true)
        {
            System.out.print("문자열 입력 >> ");
            String str = sc.nextLine();
            if(str.equals("그만"))
            {
                System.out.print("스택에 저장된 모든 문자열 팝 : ");
                for(int i = 0; i < stack.capacity(); i++)
                {
                    System.out.print(stack.pop() + " ");
                }
                break;
            }
            stack.push(str);
        }
    }
}