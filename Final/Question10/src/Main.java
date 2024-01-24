import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int tek=0,cift=0,i,sayi;
        Scanner oku=new Scanner(System.in);
        for (i=1;i<=20;i++){
            System.out.println("Sayi giriniz =");
            sayi= oku.nextInt();
            if (sayi%2==0)
                cift+=sayi;
            else
                tek+=sayi;
        }
        System.out.println("Tek = " +tek);
        System.out.println("Cift = " +cift);
    }
}