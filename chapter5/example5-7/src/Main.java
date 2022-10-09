public class Main
{
    public static void main(String[] args)
    {
        Shape dounut = new Circle(10);
        dounut.redraw();
        System.out.println("면적은 " + dounut.getArea());
    }
}