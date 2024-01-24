import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int dogumyili,gunumuz,yas;
        Scanner oku=new Scanner(System.in);
        System.out.println("Bu gunun yili =");
        gunumuz= oku.nextInt();
        System.out.println("Dogum yili =");
        dogumyili= oku.nextInt();
        yas= gunumuz-dogumyili;
        System.out.println("Kisinin Yasi =" +yas);
    }
}