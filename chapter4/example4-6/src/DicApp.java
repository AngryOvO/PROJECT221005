import java.util.Scanner;


public class DicApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("한글 단어 검색 프로그램 입니다.");

        while(true)
        {
            System.out.print("한글 단어? ");
            String search = sc.next();

            if(search.equals("그만")) break;

            if(Dictionary.kor2Eng(search) != "")
            {
                System.out.println(search + " : " + Dictionary.kor2Eng(search));
            }

        }

    }
}
