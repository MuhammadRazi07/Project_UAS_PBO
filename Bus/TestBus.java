import java.util.Scanner;

public class TestBus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bus bus = new Bus(10);

        int menu;

        do {
            System.out.println("\n===== BUS TRANS KOETARADJA ======");
            System.out.println("MENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            menu = scan.nextInt();

            switch (menu) {

                case 1:
                    System.out.print("Masukkan ID Penumpang: ");
                    int id = scan.nextInt();

                    if (bus.idAda(id)) {
                        System.out.println("❌ ID sudah digunakan penumpang lain!");
                        break;
                    }

                    System.out.print("Masukkan umur: ");
                    int umur = scan.nextInt();

                    System.out.print("Apakah hamil? (true/false): ");
                    boolean hamil = scan.nextBoolean();

                    Penumpang p;
                    if (umur > 60 || hamil) {
                        p = new PenumpangPrioritas(id, umur, hamil);
                    } else {
                        p = new Penumpang(id, umur, hamil);
                    }

                    bus.naik(p);
                    break;

                case 2:
                    System.out.print("Masukkan ID penumpang yang ingin turun: ");
                    int turunID = scan.nextInt();
                    bus.turun(turunID);
                    break;

                case 3:
                    bus.printPenumpang();
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
            
        } while (menu != 4);

        scan.close();
    }
}
