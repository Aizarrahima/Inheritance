package Latihan2;

public class Employ extends Person {

    private String noKaryawan;

    //konstruktor
    public Employ(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }

    //methode
    public void info() {
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
// Akhir kelas Employ
