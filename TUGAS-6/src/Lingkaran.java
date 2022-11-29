public class Lingkaran extends BangunDatar {

    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public void gambar() {
        System.out.println("Menggambar Lingkaran");
    }

    public float luas() {
        return (float) (Math.PI * r * r);
    }

}