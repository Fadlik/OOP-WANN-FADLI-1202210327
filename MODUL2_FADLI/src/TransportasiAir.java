public class TransportasiAir {
    protected int jumlahkursi;
    protected int biaya;

    public TransportasiAir(int jumlahkursi, int biaya){
        this.jumlahkursi=jumlahkursi;
        this.biaya=biaya;

    }

    public void informasi (){
        System.out.println("Transportasi Ais jenis tidak diketahui dengan kursi berjumlah"+jumlahkursi+"ditetapkan dengan biaya sebesar Rp."+biaya);

    }

    public void berlayar (){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");

    }
    public void berlabuh (){
        System.out.println("Trasnportasi Air jenis tidak diketahui berlabuh di \n");

}
}