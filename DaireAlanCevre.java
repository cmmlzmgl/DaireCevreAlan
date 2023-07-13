import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        int yariCap, merkezAci;
        double pi = 3.14;

        Scanner result = new Scanner(System.in);

        System.out.print("Lütfen Dairenin Yarıçapını Giriniz: ");
        yariCap = result.nextInt();

        double daireAlan = yariCap * (pi * pi);
        double daireCevre = 2 * pi * yariCap;

        System.out.println("Vermiş Olduğunuz Yarıçapa GÖre Dairenin Alanı: " + daireAlan +" cm kare, çevresi: " + daireCevre + " cm'dir.");

        System.out.print("Lütfen Merkez Açı Ölçüsü Giriniz: ");
        merkezAci = result.nextInt();

        daireAlan = (pi * (yariCap * yariCap) * merkezAci) / 360;

        System.out.print("Vermiş Olduğunuz Açıya Göre Dairenin Alanı: " + daireAlan + " cm kare'dir.");
    }
}
