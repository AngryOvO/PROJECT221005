import java.util.Scanner;
import java.util.StringTokenizer;

public class findblank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str;
        // StringTokenizer 사용
       /* while(true)
        {
            if((str = sc.nextLine()).equals("그만"))
            {
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer stoken = new StringTokenizer(str," ");
            System.out.println("어절 개수는 : " + stoken.countTokens());
        }*/

        while(true)
        {
            if((str = sc.nextLine()).equals("그만"))
            {
                System.out.println("종료합니다...");
                break;
            }
            String []str2 = str.split(" ");
            System.out.println("어절 개수는 : " + str2.length);
        }


    }
}
