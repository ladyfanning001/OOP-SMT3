/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    
public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
    
    @Override
    public String toString() {
        return "Anjing: " + super.toString();
    }
}