public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Toshiba", 19, 5.75 );
        perangkat1.informasi();
        

        Laptop laptop1 = new Laptop("MSI ", 32, 5.5, true);
        laptop1.informasi();
        laptop1.bukagame("SOLITAIRE");
        laptop1.kirimEmail("DEWAGANTENG123@gmail.com");
        laptop1.kirimEmail("DEWATAMVAN@Ggmail.com", "dukunsakti123@gmail.com \n");
        

        Handphone handphone1 = new Handphone("Samsung", 16, 3.0, true);
        handphone1.informasi();
        handphone1.telfon(622456786);
        handphone1.kirimSMS(622456786);
        handphone1.kirimSMS(62111113, 620921213);
        
    }
}
