public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal (int jumlahkursi,int biaya, String mesin){
        super(jumlahkursi,biaya);
        this.mesin=mesin;
    }
    public void informasi(){
        System.out.println("Transportasi Ais jenis tidak diketahui dengan kursi berjumlah"+jumlahkursi+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan sedang berlayar menggunakan"+mesin);
    }
    public void berlayar(int kecepatan){
        System.out.println("Kapal Melaju dengan kecepatan di kisaran"+kecepatan+"knot");
    }
    public void berlabuh (){
        System.out.println("Kapal telah Berlabuh di pantai");
    }
}
