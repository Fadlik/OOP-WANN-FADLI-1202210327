public class Handphone extends Perangkat {
    protected boolean fingerprint ;
    protected String a ;

    public Handphone(String drive, int ram, double d,boolean fingerprint){
    super(drive,ram,d);
    this.fingerprint=fingerprint;
    }

    @Override
    public void informasi() {
        if(fingerprint==true){
            a="memiliki fingerprint";
        }
        else{
            a="tidak memiliki fingerprint";
        }
        System.out.println("Handphone ini memiliki drive tipe " + drive + "dengan ram sebesar " 
        + ram + "GB dan processor secepat " + processor + "Selain itu handphone ini "+a); 
    }
    
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No" +no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No"+no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No"+no_hp1 + "dan ke No" +no_hp2);
    }
}