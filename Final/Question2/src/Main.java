import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,c;
        Scanner oku=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz =");
        b= oku.nextInt();
        System.out.println("2.sayiyi giriniz =");
        c= oku.nextInt();
        a=b-c;
        System.out.println("Fark=" +a);
    }
}