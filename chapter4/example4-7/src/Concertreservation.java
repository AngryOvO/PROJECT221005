import java.util.Scanner;

public class Concertreservation
{
    Scanner sc = new Scanner(System.in);
    String[] S = {"---","---","---","---","---","---","---","---","---","---"};
    String[] A = {"---","---","---","---","---","---","---","---","---","---"};
    String[] B = {"---","---","---","---","---","---","---","---","---","---"};

    public void reserv(int x)
    {
        switch (x)
        {
            case 1:
            {
                printseat(S);
                System.out.println("");
                System.out.print("이름 >> ");
                String name = sc.next();

                System.out.println("");

                System.out.print("번호 >> ");
                int num = sc.nextInt();

                System.out.println("");
                S[num-1] = name;
                break;
            }
            case 2:
            {
                printseat(A);
                System.out.println("");
                System.out.print("이름 >> ");
                String name = sc.next();

                System.out.println("");

                System.out.print("번호 >> ");
                int num = sc.nextInt();
                System.out.println("");
                A[num-1] = name;
                break;
            }
            case 3:
            {
                printseat(B);
                System.out.println("");
                System.out.print("이름 >> ");
                String name = sc.next();

                System.out.println("");

                System.out.print("번호 >> ");
                int num = sc.nextInt();
                System.out.println("");
                B[num-1] = name;
                break;
            }
        }
    }

    public void cancel(int x)
    {
        switch (x)
        {
            case 1:
            {
                printseat(S);
                System.out.println("");
                System.out.print("이름 >> ");
                String name = sc.next();

                System.out.println("");

                System.out.print("번호 >> ");
                int num = sc.nextInt();
                System.out.println("");
                S[num-1] = "---";
                break;
            }
            case 2:
            {
                printseat(A);
                System.out.println("");
                System.out.print("이름 >> ");
                String name = sc.next();

                System.out.println("");

                System.out.print("번호 >> ");
                int num = sc.nextInt();
                System.out.println("");
                A[num-1] = "---";
                break;
            }
            case 3:
            {
                printseat(B);
                System.out.println("");
                System.out.print("이름 >> ");
                String name = sc.next();

                System.out.println("");

                System.out.print("번호 >> ");
                int num = sc.nextInt();
                System.out.println("");
                B[num-1] = "---";
                break;
            }
        }
    }

    public void show()
    {
        System.out.print("S >> ");
        printseat(S);
        System.out.print("A >> ");
        printseat(A);
        System.out.print("B >> ");
        printseat(B);
        System.out.println("<<< 조회를 완료했습니다. >>>");
    }

    public void printseat(String[] n)
    {
        for(int i = 0; i < n.length; i++)
        {
            System.out.print(n[i] + " ");
        }
        System.out.println("");
    }


}
