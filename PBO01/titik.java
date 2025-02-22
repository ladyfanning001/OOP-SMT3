/* Nama File : titik.java
* Deskripsi  : berisi atribut dan method dalam class Titik
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 20 Februari 2025
*/

public class titik {
     /* Atribut */

     double absis;
     double ordinat;
     static int counterTitik =0;

     titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
     }

     titik (){
        this(0,0);
     }

     static int getCounterTitik(){
        return counterTitik;
     }

     //mengembalikan nilai absis
     double getAbsis() { 
        return absis;
     }

     //mengembalikan nilai ordinat
     double getOrdinat() {
        return ordinat;
     }

     //mengeset nilai absis
     void setAbsis(double x) {
        absis = x;
     }

     //mengeset nilai ordinat
     void setOrdinat(double y){
        ordinat = y;
     }

     //menggeser nilai absis dan ordinat titik sejauh x dan y
     void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
     }

     //mencetak koordinat titik
     void printTitik(){
        System.out.println("Titik (" + absis + ";" + ordinat + ")");
     }

     int getkuadran (titik T){
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

     double getjarakPusat(){
        return Math.sqrt((absis*absis)+(ordinat*ordinat));
     }

     double getJarak(titik T1, titik T2){
        return Math.sqrt((T1.absis - T2.absis)*(T1.absis - T2.absis)) + ((T1.ordinat-T2.ordinat)*(T1.ordinat-T2.ordinat));
     }

     void refleksiX(){
        ordinat = -ordinat;
     }

     void refleksiY(){
        absis = -absis;
     }

     titik getRefleksiX(){
        return new titik(absis, -ordinat);                // Mengembalikan objek titik baru
    }

    titik getRefleksiY(){
        return new titik(-absis, ordinat);
    }

    @Override
    public String toString() {
        return "(" + this.absis + ", " + this.ordinat + ")";
    }
}
