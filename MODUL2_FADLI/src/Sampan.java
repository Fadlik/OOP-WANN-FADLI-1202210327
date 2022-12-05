public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahkursi, int biaya, int layar){
        super(jumlahkursi,biaya);
        this.layar=layar;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Ais jenis sampan dengan kursi berjumlah"+jumlahkursi+"ditetapkan dengan biaya sebesar Rp."+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis sampan sedang berlayar menggunakan"+layar+"layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis sampan sedang berlabuh di pantai tanpa jangkar");
    }
    
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air dengan sampan sedang berlabuh di panati menggunakan"+jangkar+"jangkar");
        
}
}