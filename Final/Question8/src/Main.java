import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, sayi, faktoriyel = 1;
        Scanner oku = new Scanner(System.in);
        System.out.println("Faktoriyelini hesaplamak istediginiz sayiyi girin =");
        sayi = oku.nextInt();
        for (i = sayi; i > 1; i--){
            faktoriyel=faktoriyel*i;
        }
        System.out.println("Faktoriyel ="+faktoriyel);
    }
}