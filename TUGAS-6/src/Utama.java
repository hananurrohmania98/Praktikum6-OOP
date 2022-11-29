public class Utama {
    public static void main(String[] args) {
        // membuat objek BangunDatar dari class Lingkaran
        BangunDatar circ = new Lingkaran(30);

        // membuat objek BangunDatar dari Persegi
        BangunDatar rect = new Persegi(30, 50);

        // membuat objek BangunDatar dari class Segitiga
        BangunDatar tria = new Segitiga(20, 30);

        /* memanggil method draw */
        rect.gambar();
        circ.gambar();
        tria.gambar();

        System.out.println("Luas Lingkaran: " + circ.luas());
        System.out.println("Luas Persegi: " + rect.luas());
        System.out.println("Luas Segitiga : + " + tria.luas() );
    }
}