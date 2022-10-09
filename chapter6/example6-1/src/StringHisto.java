import java.util.Arrays;
import java.util.Scanner;

public class StringHisto
{
    public static void main(String[] args)
    {

        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String line = sc.nextLine();
            if(line.equals(";")) break;
            sb.append(line);
        }

        String str = new String(sb.toString());
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        int[] atoz = new int[26];
        Arrays.fill(atoz,0);

        for(int i = 0; i < sorted.length(); i++)
        {
            if(arr[i] == 'a') atoz[0]++;
            else if (arr[i] == 'b') atoz[1]++;
            else if (arr[i] == 'c') atoz[2]++;
            else if (arr[i] == 'd') atoz[3]++;
            else if (arr[i] == 'e') atoz[4]++;
            else if (arr[i] == 'f') atoz[5]++;
            else if (arr[i] == 'g') atoz[6]++;
            else if (arr[i] == 'h') atoz[7]++;
            else if (arr[i] == 'i') atoz[8]++;
            else if (arr[i] == 'j') atoz[9]++;
            else if (arr[i] == 'k') atoz[10]++;
            else if (arr[i] == 'l') atoz[11]++;
            else if (arr[i] == 'm') atoz[12]++;
            else if (arr[i] == 'n') atoz[13]++;
            else if (arr[i] == 'o') atoz[14]++;
            else if (arr[i] == 'p') atoz[15]++;
            else if (arr[i] == 'q') atoz[16]++;
            else if (arr[i] == 'r') atoz[17]++;
            else if (arr[i] == 's') atoz[18]++;
            else if (arr[i] == 't') atoz[19]++;
            else if (arr[i] == 'u') atoz[20]++;
            else if (arr[i] == 'v') atoz[21]++;
            else if (arr[i] == 'w') atoz[22]++;
            else if (arr[i] == 'x') atoz[23]++;
            else if (arr[i] == 'y') atoz[24]++;
            else if (arr[i] == 'z') atoz[25]++;
        }
        char a = 'A';
        for(int i = 0; i < atoz.length; i++)
        {
            System.out.printf("%c",a+i);
            for(int j =0; j < atoz[i]; j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
    }


}
