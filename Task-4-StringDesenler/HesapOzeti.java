public class HesapOzet {
    public static void main(String[] args) {
        String baslikurun="ÜRÜN";
        String baslikmiktar="ADET";
        String baslikfiyat="FİYAT(TL)";

        String urun1="Kalem";
        int adet1=1;
        double fiyat1=28.0;

        String urun2 = "Defter";
        int adet2 = 2;
        double fiyat2 = 32.5;
        double toplamFiyat=fiyat1+2*fiyat2;
        System.out.println("***********************************");
        System.out.println("        ALIŞVERİŞ FİŞİ");
        System.out.println("***********************************");
        System.out.println();

        System.out.printf("%-15s %-10s %10s \n", baslikurun, baslikmiktar, baslikfiyat);
        System.out.printf("-------------------------------------\n");

        System.out.printf("%-15s %-10d %10.2f \n", urun1, adet1, fiyat1);

        System.out.printf("%-15s %-10d %10.2f \n", urun2, adet2, fiyat2);

        System.out.printf("=====================================\n");

        System.out.printf("%-25s %10.2f \n", "TOPLAM:", toplamFiyat);

        System.out.println();
        System.out.println("***********************************");
    }
}
