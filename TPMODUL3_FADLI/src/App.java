import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner inpt= new Scanner(System.in);
        Restaurant resto= new Restaurant();
        int customerID, orderQty;

        try{
            System.out.println("Enter customer id :");
            customerID=inpt.nextInt();
            System.out.println("Enter how much your order food :");
            orderQty=inpt.nextInt();
            Thread t1= new Thread(resto);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread t2=new Thread(waiter);

            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch(Exception a){
            System.out.println("input invalid");
        }
    }
}
