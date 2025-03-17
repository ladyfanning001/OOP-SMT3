import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate tglAkhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double GajiPokok, String fakultas, String NIDK, LocalDate tglAkhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, GajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    @Override
    public double getTunjangan() {
        return 0.025 * GajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Tanggal Akhir Kontrak: " + formatTanggal(tglAkhirKontrak));
        System.out.println("Tunjangan: Rp " + getTunjangan());
    }
}