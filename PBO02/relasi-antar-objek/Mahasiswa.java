/* 
* Pembuat    : Ladya Kalascha - 24060123140133
* Tanggal    : 25 Februari 2025
*/

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<MataKuliah>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<MataKuliah>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatKul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatKul){
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //method lainnya
    public void addMatKul(MataKuliah matkul){
        listMatKul.add(matkul);
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul){
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
        }

    public void printMhs(){
        System.out.println("NIM :" + nim);
        System.out.println("Nama :" + nama);
        System.out.println("Prodi :" + prodi);
    }

    public void printDetailMhs(){
        printMhs();
        System.out.println("***************************");
        System.out.println("Dosen Wali :" + dosenWali.getNama());
        System.out.println("NIP : " + dosenWali.getNip());
        System.out.println("Prodi Dosen :" + dosenWali.getProdi());
        System.out.println("***************************");
        System.out.println("Kendaraan Mahsiswa:" + kendaraan.getjenis());
        System.out.println("NO Plat : " + kendaraan.getNoPlat());
        System.out.println("List mata kuliah :");
        for (MataKuliah matkul : listMatKul){
            System.out.println(matkul.getNama()+ " " + matkul.getSks() + "SKS");
        }

    }

}
