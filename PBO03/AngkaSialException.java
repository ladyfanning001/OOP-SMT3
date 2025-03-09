package PBO03;
/** 
 * File : AngkaSialException.java
 * Deskripsi : Ekspresi buatan sendiri, menolak masukan angka 13
 * Nama/NIM : Ladya Kalascha/24060123140133
 * 
*/

public class AngkaSialException extends Exception {
    public AngkaSialException() {
      super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
  }
