import java.util.ArrayList;

public class Bus {

    private ArrayList<Penumpang> penumpang = new ArrayList<>();
    private int kapasitas;
    public static final int ONGKOS = 2000;

    public Bus(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public boolean idAda(int id) {
        for (Penumpang p : penumpang) {
            if (p.getID() == id) return true;
        }
        return false;
    }

    public boolean naik(Penumpang p) {

        if (penumpang.size() >= kapasitas) {
            System.out.println("❌ Bus penuh!");
            return false;
        }

        try {
            p.bayarOngkos(ONGKOS);
        } catch (Exception e) {
            System.out.println("❌ " + e.getMessage());
            return false;
        }

        penumpang.add(p);
        System.out.println(" Penumpang berhasil naik!");
        return true;
    }

    public boolean turun(int id) {
        for (Penumpang p : penumpang) {
            if (p.getID() == id) {
                penumpang.remove(p);
                System.out.println("✔ Penumpang ID " + id + " telah turun.");
                return true;
            }
        }
        System.out.println("❌ Penumpang dengan ID itu tidak ada.");
        return false;
    }

    public void printPenumpang() {
        System.out.println("\n===== DAFTAR PENUMPANG =====");
        if (penumpang.isEmpty()) {
            System.out.println("Bus masih kosong.");
            return;
        }
        for (Penumpang p : penumpang) {
            System.out.println(p);
        }
    }
}
