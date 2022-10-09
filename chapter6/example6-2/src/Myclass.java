class Mypoint
{
    int x;
    int y;
    public Mypoint()
    {

    }
    public Mypoint(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        return "Point" + "(" + this.x + "," + this.y + ")";
    }


}


public class Myclass
{
    public static void main(String[] args)
    {
        Mypoint p = new Mypoint(3,50);
        Mypoint q = new Mypoint(4,50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은점");
        else
            System.out.println("다른점");
    }
}
