package PBO03;

/** 
 * File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 * Nama/NIM : Ladya Kalascha/24060123140133
 * 
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
      Integer[] arrayInteger = new Integer[4];
      // Array dengan panjang 4
  
      try {
        arrayInteger[2] = 11; 
        arrayInteger[4] = 10; 
      } catch (ArrayIndexOutOfBoundsException exception) {
        exception.printStackTrace(); 
      } finally {
        System.out.println("Clean up code..."); 
      }
    }
  }
