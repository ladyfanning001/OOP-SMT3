/* 
  Nmaa/NIM   : Ladya Kalascha/24060123140133
  Tanggal   : 21 Maret 2025
*/

public class Lingkaran extends BangunDatar implements IResize {
    private double jariJari;
  

    public Lingkaran() {
      setJmlSisi(0); 
    }

    public Lingkaran(double jariJari) {
      setJmlSisi(0);
      this.jariJari = jariJari;
    }
  
    public Lingkaran(double diameter, String warna, String border) {
      super(0, warna, border); // Memanggil konstruktor BangunDatar
      this.jariJari = diameter / 2;
    }
  
   
    public double getJariJari() {
      return jariJari;
    }
  
    public void setJariJari(double jariJari) {
      this.jariJari = jariJari;
    }
  

    public double getLuas() {
      return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
      return 2 * Math.PI * jariJari;
    }
  

    @Override
    public void printInfo() {

      super.printInfo();
  
      // Tambahkan informasi jari-jari, luas, dan keliling
      System.out.println("Jari-jari   : " + jariJari);
      System.out.println("Luas        : " + getLuas());
      System.out.println("Keliling    : " + getKeliling());
    }
  

    @Override
    public void zoomIn() {
      this.jariJari = this.jariJari * 1.1;
    }
  
    @Override
    public void zoomOut() {
      this.jariJari = this.jariJari * 0.9;
    }
  
    @Override
    public void zoom(double percent) {
      this.jariJari = this.jariJari * (percent / 100);
    }
  }