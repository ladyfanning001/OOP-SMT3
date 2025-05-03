package com.mycompany.tugas10ab;

public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.suara();
        hewan.gerak();
    }
}