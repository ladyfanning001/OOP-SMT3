
/* 
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 25 Februari 2025
*/

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
      }

    MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatkul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }
}
