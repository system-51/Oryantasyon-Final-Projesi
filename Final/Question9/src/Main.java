import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float sayi;int i=1;
        Scanner oku=new Scanner(System.in);

        System.out.println("Sayi girin =");
        sayi= oku.nextFloat();
        while (sayi>9){
            sayi=sayi/10; i++;
        }
        System.out.println("Sayi" +i+ "basamakli");
    }
}