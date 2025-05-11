/**
 * Nama : Ladya Kalascha
 * NIM : 24060123140133
 */
    
public class Koleksi<T> {
    private int nbelm;       
    private Object[] wadah;  

    public Koleksi(int capacity) {
        this.wadah = new Object[capacity];
        this.nbelm = 0;
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int index) {
        if (index < 0 || index >= nbelm) {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
        return (T) wadah[index];
    }

    public void setIsi(int index, T value) {
        if (index < 0 || index >= nbelm) {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
        wadah[index] = value;
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        if (size < 0 || size > wadah.length) {
            throw new IllegalArgumentException("Ukuran tidak valid");
        }
        this.nbelm = size;
    }

    public boolean add(T value) {
        if (nbelm >= wadah.length) {
            return false; // Koleksi sudah penuh
        }
        wadah[nbelm] = value;
        nbelm++;
        return true;
    }

    @SuppressWarnings("unchecked")
    public T delete(int index) {
        if (index < 0 || index >= nbelm) {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
        
        T removedItem = (T) wadah[index];
        
        for (int i = index; i < nbelm - 1; i++) {
            wadah[i] = wadah[i + 1];
        }
        
        wadah[nbelm - 1] = null; 
        nbelm--;
        
        return removedItem;
    }

    public void showAll() {
        System.out.println("Isi koleksi [" + nbelm + " elemen]:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("[" + i + "] " + wadah[i]);
        }
    }
}