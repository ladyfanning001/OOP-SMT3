abstract class Anabul {
    protected String Nama;

    public Anabul(String Nama){
        this.Nama = Nama;
    }
    
    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public abstract void CaraGerak();
    public abstract void Suara();
}