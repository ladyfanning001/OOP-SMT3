import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double GajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, GajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    @Override
    public int getBUP() {
        return BUP;
    }

    @Override
    public double getTunjangan() {
        return 0.02 * getMasaKerja() * GajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("BUP: " + getBUP() + " tahun");
        System.out.println("Tunjangan: Rp " + getTunjangan());
    }
}