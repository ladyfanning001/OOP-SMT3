/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    
public abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
 
    public abstract void gerak();
    
  
    public abstract void bersuara();
    
    @Override
    public String toString() {
        return nama;
    }
}