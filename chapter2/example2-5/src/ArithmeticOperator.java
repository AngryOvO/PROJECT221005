import java.util.Scanner;

public class ArithmeticOperator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sec = num % 60;
        int min = (num / 60) % 60;
        int hour = (num / 60) / 60;

        System.out.println(num + "초는 " + hour + "시간 "+ min + "분 "+ sec + "초입니다.");
        sc.close();
    }
}
