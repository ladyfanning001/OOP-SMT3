/**
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        // mengambil elemen pertama
        System.out.println(map.get(1));
        System.out.println(map.size());

        // mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

        // bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci ? tulis pada laporan anda!
        // Jawaban:
        // Gunakan iterasi seperti berikut ini untuk mengambil seluruh nilai berdasarkan kunci:
        for (Integer k : key) {
            System.out.println("Kunci: " + k + ", Nilai: " + map.get(k));
        }
    }
}