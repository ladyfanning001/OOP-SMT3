/**
 File : Lingkaran.java
 Deskripsi : implementasi lingkaran sebgai bangun datar
 **/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }

    public double hitungLuas(){
        return 3.14*jejari*jejari;
    }
}
