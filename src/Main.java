import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenleri yazalım
        double kg, boy, ind;

        //Kullanıcıdan değerleri isteyelim.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu yazınız (metre): ");
        boy= input.nextDouble();
        System.out.print("Lütfen kilonuzu yazınız (kg): ");
        kg= input.nextDouble();

        //Vücut kitle endeksi formülünü yazalım

        ind= kg/(boy*boy);

        System.out.print("Vücut Kitle Endeksiniz: " +ind);
    }
}