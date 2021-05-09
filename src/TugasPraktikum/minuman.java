package TugasPraktikum;

public class minuman extends kantin {

    private String paket;

    public minuman(String paket, String nama, int harga) {
        super(nama, harga);
        this.paket = paket;
    }

    @Override
    public void info() {
        System.out.println("Paket  : " + this.paket);
        super.info();
    }
}
