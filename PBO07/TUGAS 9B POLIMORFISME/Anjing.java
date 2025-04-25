public class Anjing extends Anabul {
    public Anjing(String nama){
        super(nama);
    }

    @Override 
    public void CaraGerak(){
        System.out.println("Cara anjing bergerak adalah secara melata");
    }

    public void Suara(){
        System.out.println("suaranya adalah 'guk-guk'");
    }
}
