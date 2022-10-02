public class Circle
{
    private double x,y;
    private int radius;
    private double area;
    public Circle(double x, double y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show()
    {
        System.out.printf("(%.1f,%.1f)%d\n",this.x, this.y,this.radius);
    }

    public double circlearea()
    {
        return area = radius * radius * 3.14;
    }

}
