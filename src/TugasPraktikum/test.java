package TugasPraktikum;

public class test {

    public static void main(String args[]) {
        System.out.println("===== Makanan yang Dibeli =====");
        makanan a = new makanan(2, "Nasi goreng", 10000);
        a.info();

        System.out.println("===== Minuman yang Dibeli =====");
        minuman b = new minuman("Minuman dingin", "Es jeruk", 3000);
        b.info();
    }
}
