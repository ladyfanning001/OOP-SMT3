/* 
  Nmaa/NIM   : Ladya Kalascha/24060123140133
  Tanggal   : 21 Maret 2025
*/

public class Persegi extends BangunDatar implements IResize {
    private double sisi;
  

    public Persegi() {
      setJmlSisi(4);
    }

    public Persegi(double sisi) {
      setJmlSisi(4);
      this.sisi = sisi;
    }
  
    public Persegi(double sisi, String warna, String border) {
      this.jmlSisi = 4;
      this.warna = warna;
      this.border = border;
      this.sisi = sisi;
    }
  
  
    public double getSisi() {
      return sisi;
    }
  
    public void setSisi(double sisi) {
      this.sisi = sisi;
    }

    public double getLuas() {
      return sisi * sisi;
    }

    public double getKeliling() {
      return 4 * sisi;
    }
  

    public double getDiagonal() {
      return Math.sqrt(2) * sisi;
    }
  

    @Override
    public void printInfo() {
      super.printInfo();
      System.out.println("Sisi        : " + sisi);
      System.out.println("Luas        : " + getLuas());
      System.out.println("Keliling    : " + getKeliling());
    }
  

    @Override
    public void zoomIn() {
      this.sisi = this.sisi * 1.1;
    }
  
    @Override
    public void zoomOut() {
      this.sisi = this.sisi * 0.9;
    }
  
    @Override
    public void zoom(double percent) {
      this.sisi = this.sisi * (percent / 100);
    }
  
    public static void printCounterBangunDatar() {
      System.out.println("Ini dari kelas Persegi");
    }
  }