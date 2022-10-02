import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        Concertreservation con = new Concertreservation();

        int x;

        do
        {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            x = sc.nextInt();
            switch (x)
            {
                case 1:
                {
                    System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                    int y = sc.nextInt();
                    con.reserv(y);
                    break;
                }
                case 2:
                {
                    con.show();
                    break;
                }
                case 3:
                {
                    System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                    int y = sc.nextInt();
                    con.cancel(y);
                    break;
                }
                case 4:
                {
                    break;
                }

            }

        }while(x != 4);
    }
}
