public class Segitiga extends BangunDatar {
    private double sisi1, sisi2, sisi3, tinggi;

    public Segitiga(double sisi1, double sisi2, double sisi3, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.tinggi = tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public double hitungLuas() {
        return 0.5 * sisi1 * tinggi;
    }

}

