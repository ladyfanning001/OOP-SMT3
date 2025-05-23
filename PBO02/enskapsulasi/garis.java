public class garis {
    private titik titikAwal;
    private titik titikAkhir;
   private  static int garisCounter=0;

    /*2.a Konstruktor tanpa parameter yang menginisialisasi k 
    awal dengan (0,0) dan k akhir dengan (1,1).*/
    public garis(){
        titikAwal = new titik();
        titikAkhir = new titik(1,1);
        garisCounter ++;
    }

    /*2.b Konstruktor dengan parameter masukan k awal dan k akhir.*/
    public garis(titik titikAwal, titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        garisCounter++;
    }

    /*2.c Selektor (getter) untuk se ap atribut beserta mutatornya (se er). 
    Tambahkan pula selektor untuk mendapatkan atribut sta c counterGaris. */
    public  titik getTitikAwal(){
        return titikAwal;
    }

    public titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAwal(titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris(){
        return garisCounter;
    }

    /*2.d Method untuk mendapatkan panjang sebuah garis. */
    public double panjangGaris(){
        return Math.sqrt(((titikAwal.getOrdinat()-titikAkhir.getOrdinat())*(titikAwal.getOrdinat()-titikAkhir.getOrdinat()))+ ((titikAwal.getAbsis()-titikAkhir.getAbsis())*(titikAwal.getAbsis()-titikAkhir.getAbsis())));
    }

    /*2.e Method untuk mendapatkan gradien dari sebuah garis. */
    public  double gradien(){
        return ((titikAkhir.getOrdinat()-titikAwal.getOrdinat())/(titikAkhir.getAbsis()-titikAwal.getAbsis()));
    }

    /*2.f Method untuk mendapatkan k tengah dari sebuah garis. */
    public titik titikTengah(){
        titik titikTengah = new titik();
        titikTengah.setAbsis((titikAwal.getAbsis()+titikAkhir.getAbsis())/2);
        titikTengah.setOrdinat((titikAwal.getOrdinat()+titikAkhir.getOrdinat())/2);
        return titikTengah;
    }

    /*2.g Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya,
    mengembalikan true jika sejajar dan false jika sebaliknya. */
    public boolean IsSejajar(garis G){
        return this.gradien() == G.gradien();
    }

    /*2.h Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya,
    mengembalikan true jika sejajar dan false jika sebaliknya. */
    public boolean IsTegakLurus(garis G){
        return this.gradien() * G.gradien()==-1;
    }

    /*2.i Method untuk menampilkan ke layar k awal dan k akhir garis. */
    public void printGaris(){
        System.out.println("titik awal = " + titikAwal);
        System.out.println("titik akhir = " + titikAkhir);
    }

    /*2.j Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c.
    Contoh: garis yang dibuat dari k (-2,0) dan (0,4) mempunyai persamaan garis y = 2x + 4.  */
    public void PersamaanGaris() {
        double m = this.gradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        System.out.print("Persamaan garis: y = " + m + "x");
    
        if (c > 0) {
            System.out.println(" + " + c);
        } else if (c < 0) {
            System.out.println(" - " + Math.abs(c));
        } else {
            System.out.println(); // Jika c = 0, cukup tampilkan "y = mx"
        }
    }

}
