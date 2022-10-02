public class GarbageEx
{
    public static void main(String[] args)
    {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null;
        d = c;
        c = null;

        System.out.println("a가 가지고 있던 Good이 가비지");
    }
}