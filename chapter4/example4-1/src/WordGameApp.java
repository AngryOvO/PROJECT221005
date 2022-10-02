import java.util.Scanner;

public class WordGameApp
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("끝말잇기 게임을 시작합니다.\n");
        System.out.printf("게임에 참가하는 인원은 몇명입니까? : ");
        int gamenum = sc.nextInt();

        Player[] p = new Player[gamenum];

        for(int i = 0; i < gamenum; i++)
        {
            p[i] = new Player();
            p[i].Insertname();
        }

        System.out.printf("시작하는 단어는 아버지입니다.\n");
        int count = 0;
        String cpr = new String("아버지");
        while(true)
        {
            if(count == 3)
                count = 0;

            System.out.printf(p[count].Returnname() + ">>");
            p[count].Insertgame();

            if(cpr.charAt(cpr.length()-1) != p[count].game.charAt(0))
            {
                System.out.printf(p[count].Returnname() + "이 졌습니다.");
                break;
            }
            cpr = p[count].Returngame();
            count++;

        }
    }
}
