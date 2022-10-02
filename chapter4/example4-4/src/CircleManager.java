import java.util.Scanner;

public class CircleManager
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Circle[] c = new Circle[3];

        for(int i = 0; i < 3; i++)
        {
            System.out.print("x, y, radius >> ");
            double x = sc.nextFloat();
            double y = sc.nextFloat();
            int radius = sc.nextInt();
            c[i] = new Circle(x,y,radius);
        }

        double max = c[0].circlearea();
        int maxindex = 0;
        for(int i = 0; i < c.length; i ++)
        {
            if(max < c[i].circlearea())
            {
                max = c[i].circlearea();
                maxindex = i;
            }
        }
        System.out.print("가장 면적이 큰 원은 ");
        c[maxindex].show();


        sc.close();
    }
}
