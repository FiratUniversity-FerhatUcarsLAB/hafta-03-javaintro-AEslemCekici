public class Parabozma {
    public static void main(String[] args) {

            int para = 278;
            int ilkpara=278;

            int adet100 = para / 100;
            para = para % 100;

            int adet50 = para / 50;
            para = para % 50;

            int adet20 = para / 20;
            para = para % 20;

            int adet5 = para / 5;
            para = para % 5;

            int adet2 = para / 2;
            para = para % 2;

            int adet1 = para / 1;

            System.out.print(ilkpara + " TL = ");
            System.out.print(adet100 + "x100, ");
            System.out.print(adet50 + "x50, ");
            System.out.print(adet20 + "x20, ");
            System.out.print(adet5 + "x5, ");
            System.out.print(adet2 + "x2, ");
            System.out.println(adet1 + "x1");
        }
}
