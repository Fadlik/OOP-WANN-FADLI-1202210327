public class Laptop extends Perangkat{
    protected boolean webcam;
    protected String a;

    public Laptop (String drive, int ram, double processor, boolean webcam){
    super(drive,ram,processor);
    this.webcam=webcam;
    
    }

    @Override
    public void informasi() {
        if(webcam==true){
            a="memiliki webcam";
        }
        else{
            a="tidak memiliki webcam";
        }
        System.out.println("Laptop ini memiliki drive tipe "+ drive + " dengan ram sebesar " 
        + ram + " GB dan processor secepat " + processor + " Ghz. selain itu laptop ini juga "+a );
    }
    
    public void bukagame(String nama_game){
        System.out.println("Laptop berharsil membuka game "+nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berharsil mengirim Email ke "+email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke "+email1+ " dan ke "+email2 );
    }

}