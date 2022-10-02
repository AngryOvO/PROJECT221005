import java.util.Scanner;

public class Player {
    String name = new String();
    String game = new String();

    Scanner sc = new Scanner(System.in);

    public Player() {
    }

    public Player(String n) {
        this.name = n;
    }

    public void Insertname() {
        System.out.printf("참가자의 이름을 입력하세요 : ");
        this.name = sc.next();
    }

    public String Returnname() {
        return this.name;
    }

    public void Insertgame() {
        this.game = sc.next();
    }

    public String Returngame() {
        return this.game;
    }
}