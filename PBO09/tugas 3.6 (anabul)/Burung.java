/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    
public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
    
    @Override
    public String toString() {
        return "Burung: " + super.toString();
    }
}