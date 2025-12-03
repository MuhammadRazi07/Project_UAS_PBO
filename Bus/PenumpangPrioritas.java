public class PenumpangPrioritas extends Penumpang {

    public PenumpangPrioritas(int id, int umur, boolean hamil) {
        super(id, umur, hamil);
        this.tipe = TipePenumpang.PRIORITAS;
    }

    @Override
    public void bayarOngkos(int ongkos) throws Exception {
        if (saldo < ongkos) {
            throw new Exception("Saldo penumpang prioritas tidak cukup!");
        }
        saldo -= ongkos;
    }

    @Override
    public String toString() {
        return "[PRIORITAS] " + id + " (umur: " + umur + ", hamil: " + hamil + ", saldo: " + saldo + ")";
    }
}
