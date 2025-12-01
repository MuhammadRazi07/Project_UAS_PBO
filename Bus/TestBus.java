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
