public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling(){
        return (2*panjang)+(2*lebar);
    }

    public double hitungLuas(){
        return panjang*lebar;
    }
}
