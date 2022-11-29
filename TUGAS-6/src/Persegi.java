public class Persegi extends BangunDatar{
    private float panjang;
    private float lebar;

    public Persegi(float lebar, float panjang) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void gambar() {
        System.out.println("Menggambar Persegi");
    }

    public float luas() {
        return this.lebar * this.panjang;
    }

}