public class Main {
    public static void main(String[] args) {
        Anjing A1 = new Anjing("Mike");
        Kucing K1 = new Kucing("Nezuko");
        Burung B1 = new Burung("Pim");

        Anabul[] Anabuls = {A1,K1,B1};

        for(Anabul Anabul : Anabuls){
            System.out.println("Nama: " + Anabul.getNama());
            Anabul.CaraGerak();
            Anabul.Suara();
            System.out.println();
        }
    }
}
