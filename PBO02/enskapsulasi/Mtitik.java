/* Nama File : Mtitik.java
* Deskripsi  : berisi atribut dan method dalam class Titik
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 20 Februari 2025
*/

public class Mtitik {
    public static void main(String[] args) {
        titik T1 = new titik(); // membuat objek titik T1(0,0)
        T1.setAbsis(3); //mengubah absis menjadi 3
        T1.setOrdinat(4); //mengubah ordinat menjadi 4
        T1.printTitik(); //print T1
        T1.geser(6, 8); //menggesser titik sejauh 6 dan 8
        T1.printTitik();// print T1 setelah digeser

        titik T2 = new titik();
        T2.printTitik();
        T1.setAbsis (10) ;
        T1.setOrdinat (10) ;
        T2.printTitik();

        System.out.println("Jumlah Objek Titik = " + titik.getCounterTitik());

         // Menampilkan hasil refleksi terhadap sumbu x
         titik refleksiX = T1.getRefleksiX();
         System.out.print("Refleksi terhadap sumbu X: ");
         refleksiX.printTitik();
 
         // Menampilkan hasil refleksi terhadap sumbu Y
         titik refleksiY = T1.getRefleksiY();
         System.out.print("Refleksi terhadap sumbu Y: ");
         refleksiY.printTitik();
 
         // Menghitung jarak T1 ke pusat
         System.out.println("Jarak T1 ke pusat: " + T1.getjarakPusat());
 
         // Menghitung jarak antara T1 dan refleksiX
         System.out.println("Jarak T1 ke Refleksi X: " + T1.getJarak(T1, refleksiX));
 
         // Menghitung jarak antara T1 dan refleksiY
         System.out.println("Jarak T1 ke Refleksi Y: " + T1.getJarak(T1, refleksiY));
 
         // Menentukan kuadran dari T1
         System.out.println("Kuadran T1: " + T1.getkuadran(T1));
 
         // Menentukan kuadran dari refleksiX
         System.out.println("Kuadran Refleksi X: " + T1.getkuadran(refleksiX));
 
         // Menentukan kuadran dari refleksiY
         System.out.println("Kuadran Refleksi Y: " + T1.getkuadran(refleksiY));
    }
}
