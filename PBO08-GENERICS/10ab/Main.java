package com.mycompany.tugas10ab;

public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing());

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(new Anjing());

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(new Burung());

        System.out.println("=== KUCING ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumKucing);

        System.out.println("\n=== ANJING ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumAnjing);

        System.out.println("\n=== BURUNG ===");
        ContohMetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}