package com.mycompany.latihanmedium;


public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        int total = senjata.getPeluru() + jumPeluru;
        senjata.setPeluru(total);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }

        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb!";
        } else {
            return "Senjata tidak memiliki bayonet.";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}