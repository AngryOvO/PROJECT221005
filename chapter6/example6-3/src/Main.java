import java.util.Calendar;

public class Main
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);

        System.out.println("현재 시간은 " + hour + "시 " + min + "분 입니다.");
        if(hour < 12 && hour > 4) System.out.println("Good Morning!");
        else if (hour >=12 && hour < 18) System.out.println("Good Afternoon!");
        else if(hour >= 18 && hour < 22) System.out.println("Good Evening!");
        else System.out.println("Good Night!");
    }
}