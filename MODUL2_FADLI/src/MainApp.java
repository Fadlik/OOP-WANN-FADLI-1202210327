public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir oke= new TransportasiAir(9, 90000);
        oke.informasi();
        oke.berlabuh();
        oke.berlayar();
    
        Kapal a= new Kapal(10,10000, "diesel");
        a.informasi();
        a.berlayar();
        a.berlayar();
        a.berlabuh();
       

        Sampan b= new Sampan(10,10000,9);
        b.informasi();
        b.berlayar();
        b.berlabuh();
        b.berlabuh(2);
    }
}
