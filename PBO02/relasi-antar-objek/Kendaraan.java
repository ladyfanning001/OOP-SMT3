/* 
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 25 Februari 2025
*/

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
      }
    
    
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }

    public String getjenis(){
        return jenis;
    }
}
