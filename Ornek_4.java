import java.util.Scanner;

public class Ornek_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km, odencek_tutar;
        final double acilis_ucreti = 10.0, km_basina_fiyat = 2.20;
        System.out.println("Km Giriniz : ");
        km = scanner.nextDouble();
        odencek_tutar = acilis_ucreti + (km * km_basina_fiyat);
        if (odencek_tutar < 20) {
            System.out.println("Odencek tutar : " + 20.0);
        }
        else {
            System.out.println("Odencek tutar : " + odencek_tutar);
        }
    }
}
