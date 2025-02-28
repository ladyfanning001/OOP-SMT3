/* Nama File : titik.java
* Deskripsi  : berisi atribut dan method dalam class Titik
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 20 Februari 2025
*/

public class titik {
     /* Atribut */

     private double absis;
     private double ordinat;
     private static int counterTitik =0;

     public titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
     }

     public titik (){
        this(0,0);
     }

     public static int getCounterTitik(){
        return counterTitik;
     }

     //mengembalikan nilai absis
     public double getAbsis() { 
        return absis;
     }

     //mengembalikan nilai ordinat
     public double getOrdinat() {
        return ordinat;
     }

     //mengeset nilai absis
     public void setAbsis(double x) {
        absis = x;
     }

     //mengeset nilai ordinat
     public void setOrdinat(double y){
        ordinat = y;
     }

     //menggeser nilai absis dan ordinat titik sejauh x dan y
     public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
     }

     //mencetak koordinat titik
     public  void printTitik(){
        System.out.println("Titik (" + absis + ";" + ordinat + ")");
     }

     public int getkuadran (titik T){
        if (T.ordinat>=0 && T.absis>= 0){
            return 1;
        }
        else if (T.ordinat<0 && T.absis>=0)
        {
            return 2;
        }
        else if (T.ordinat<0 && T.absis<0)
        {
            return 3;
        }
        else {
            return 4;
        }
     }

     public double getjarakPusat(){
        return Math.sqrt((absis*absis)+(ordinat*ordinat));
     }

     public double getJarak(titik T1, titik T2){
        return Math.sqrt((T1.absis - T2.absis)*(T1.absis - T2.absis)) + ((T1.ordinat-T2.ordinat)*(T1.ordinat-T2.ordinat));
     }

     public void refleksiX(){
        ordinat = -ordinat;
     }

     public void refleksiY(){
        absis = -absis;
     }

     public titik getRefleksiX(){
        return new titik(absis, -ordinat);                // Mengembalikan objek titik baru
    }

    public titik getRefleksiY(){
        return new titik(-absis, ordinat);
    }

    @Override
    public String toString() {
        return "(" + this.absis + ", " + this.ordinat + ")";
    }
}
