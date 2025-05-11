/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
    
    @Override
    public String toString() {
        return "Kucing: " + super.toString();
    }
} 
