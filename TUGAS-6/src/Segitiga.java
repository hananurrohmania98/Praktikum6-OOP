public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void gambar() {
        System.out.println("Menggambar Segitiga");
    }

    public float luas() {
        return 0.5f * alas * tinggi;
    }


}