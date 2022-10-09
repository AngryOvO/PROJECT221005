import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int gababo;
        int computer;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            gababo = sc.nextInt();
            if(gababo == 4) break;
            computer = (int) (Math.random()*3 + 1);
            if(gababo == computer)
                System.out.println("비겼습니다.");
            else if (gababo == 1 && computer == 2)
            {
                System.out.println("철수(가위) : 컴퓨터(바위)");
                System.out.println("컴퓨터가 이겼습니다.");
            }
            else if (gababo == 1 && computer == 3)
            {
                System.out.println("철수(가위) : 컴퓨터(보)");
                System.out.println("철수가 이겼습니다.");
            }
            else if (gababo == 2 && computer == 1)
            {
                System.out.println("철수(바위) : 컴퓨터(가위)");
                System.out.println("철수가 이겼습니다.");
            }
            else if (gababo == 2 && computer == 3)
            {
                System.out.println("철수(바위) : 컴퓨터(보)");
                System.out.println("컴퓨터가 이겼습니다.");
            }
            else if (gababo == 3 && computer == 1)
            {
                System.out.println("철수(보) : 컴퓨터(가위)");
                System.out.println("컴퓨터가 이겼습니다.");
            }
            else if (gababo == 3 && computer == 2)
            {
                System.out.println("철수(보) : 컴퓨터(바위)");
                System.out.println("철수가 이겼습니다.");
            }
        }

    }
}