import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String str;
        String instruct;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringBuffer str1 = new StringBuffer(str);


        while(true)
        {
            System.out.print("명령 : "); instruct = sc.nextLine();
            if(instruct.equals("그만"))
            {
                System.out.println("종료합니다.");
                break;
            }
            String [] token = instruct.split("!");

            if(token.length != 2)
            {
                System.out.println("잘못된 명령입니다!");
            }
            else
            {
                if (token[0].length() == 0 || token[1].length() == 0)
                {
                    System.out.println("잘못된 명령입니다!");
                    continue;
                }
                int i = str1.indexOf(token[0]);
                if(i == -1)
                {
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                str1.replace(i,i+token[0].length(),token[1]);
                System.out.println(str1.toString());
            }
        }
    }
}