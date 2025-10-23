public class MilKilometreTablo {
    public static void main(String[] args) {
        System.out.println("=== Mil->Kilometre Dönüşüm Tablosu===");
        System.out.println("(1 Mil=1.609 km)");
        System.out.println("-------------------------");

        System.out.printf("%-10s %-10s \n", "Mil", "Kilometre");
        System.out.printf("--------------------\n");

        double kmPerMil=1.609;

        System.out.printf("%-10d %-10.3f\n", 1,(1 * kmPerMil));
        System.out.printf("%-10d %-10.3f\n", 5,(5 * kmPerMil));
        System.out.printf("%-10d %-10.3f\n", 10,(10 * kmPerMil));
        System.out.printf("%-10d %-10.3f\n", 20,(20 * kmPerMil));
        System.out.printf("%-10d %-10.3f\n", 50,(50 * kmPerMil));

        System.out.printf("--------------------------\n");
    }
}

