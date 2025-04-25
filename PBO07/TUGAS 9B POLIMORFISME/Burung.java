public class Burung extends Anabul {
    public Burung(String Nama){
        super(Nama);
    }
    @Override
    public void CaraGerak(){
        System.out.println("Cara burung bergerak adalah dengan terbang");
    }

    public void Suara(){
        System.out.println("suaranya adalah 'cuit'");
    }
}
