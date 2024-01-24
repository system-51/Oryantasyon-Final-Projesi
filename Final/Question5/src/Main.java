import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,bolum=0;
        Scanner oku=new Scanner(System.in);
        System.out.println("1.sayi=");
        a= oku.nextInt();
        System.out.println("2.sayi=");
        b= oku.nextInt();
        bolum=(a/b);
        System.out.println("Bolum =" +bolum);
    }
}