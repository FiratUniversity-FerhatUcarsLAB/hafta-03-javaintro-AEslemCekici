public class UsluSayılarTablo {
        public static void main(String[] args) {

            System.out.println("=== ÜSLÜ SAYILAR TABLOSU ===");
            System.out.println();

            System.out.printf("%-5s %-5s %-5s \n", "a", "a^2", "a^3");
            System.out.printf("---------------------\n");

            for (int a = 1; a <= 5; a++) {

                int a_karesi = a * a;
                int a_kupu = a * a * a;

                System.out.printf("%-5d %-5d %-5d \n", a, a_karesi, a_kupu);
            }

            System.out.println("---------------------\n");
        }
    }
