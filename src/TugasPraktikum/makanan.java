package TugasPraktikum;

public class makanan extends kantin {

    private int jumlah;

    public makanan(int jumlah, String nama, int harga) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public void info() {
        System.out.println("Jumlah : " + this.jumlah);
        super.info();
    }
}
