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

