import java.util.Scanner;

public class PhoneBook
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원수 >> ");
        int num = sc.nextInt();

        Phone [] p = new Phone[num];

        for(int i = 0 ; i < num; i++)
        {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >> ");
            String name = sc.next();
            String tel = sc.next();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true)
        {
            boolean a = true;
            System.out.print("검색할 이름 >> ");
            String search = sc.next();

            if(search.equals("그만")) break;

            for(int count = 0; count < p.length; count++)
            {
                if (search.equals(p[count].name))
                {
                    System.out.println(p[count].name + "의 번호는 " + p[count].tel + " 입니다.");
                    a = false;
                }

            }
            if(a)
            {
                System.out.println(search + " 이 없습니다.");
            }
        }
    }
}
