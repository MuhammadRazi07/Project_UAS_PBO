public class Penumpang implements Bayar {

    protected int id;
    protected int umur;
    protected boolean hamil;
    protected int saldo;
    protected TipePenumpang tipe = TipePenumpang.BIASA;

    public Penumpang(int id, int umur, boolean hamil) {
        this.id = id;
        this.umur = umur;
        this.hamil = hamil;
        this.saldo = 10000;
    }

    public int getID() { return id; }
    public int getUmur() { return umur; }
    public boolean getHamil() { return hamil; }
    public int getSaldo() { return saldo; }
    public TipePenumpang getTipe() { return tipe; }

    @Override
    public void bayarOngkos(int ongkos) throws Exception {
        if (saldo < ongkos) {
            throw new Exception("Saldo penumpang biasa tidak cukup!");
        }
        saldo -= ongkos;
    }

    @Override
    public String toString() {
        return "[BIASA] " + id + " (umur: " + umur + ", hamil: " + hamil + ", saldo: " + saldo + ")";
    }
}

