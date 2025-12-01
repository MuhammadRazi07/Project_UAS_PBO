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
