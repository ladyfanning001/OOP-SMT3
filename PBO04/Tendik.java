import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double GajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, GajiPokok);
        this.bidang = bidang;
    }

    @Override
    public int getBUP() {
        return BUP;
    }

    @Override
    public double getTunjangan() {
        return 0.01 * getMasaKerja() * GajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("BUP: " + getBUP() + " tahun");
        System.out.println("Tunjangan: Rp " + getTunjangan());
    }
}