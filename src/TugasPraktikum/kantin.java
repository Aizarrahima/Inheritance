package TugasPraktikum;

public class kantin {

    private String nama;
    private int harga;

    // konstruktor
    public kantin(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // method
    public void info() {
        System.out.println("Nama   : " + nama);
        System.out.println("Harga  : " + harga);
    }
}
