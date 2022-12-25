public class Waiters implements Runnable{
    private final int customerID;
    private final int foodprice= 25000;
    private final int orderQty;

    public Waiters (int customerID,int orderQty){
        this.orderQty=orderQty;
        this.customerID=customerID;
    }
    @Override
    public void run(){
        while (true){
            getFood();
            try{
                Thread.sleep(15000);
            } catch(InterruptedException a){
                a.printStackTrace();
            }
        }
    }
    public void orderinfo(){
        System.out.println("Customer ID:"+ this.customerID);
        System.out.println("Number food:"+ this.orderQty);
        System.out.println("total price:"+ this.orderQty*foodprice);
    }
    public void getFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter : Food is ready deliver gan");
            Restaurant oke = new Restaurant();
            oke.setWaitingForPickup(false);
            if(Restaurant.getfoodNumber()== this.orderQty+1){
                orderinfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: tell the restaurant make another food\n");

        }
    }
}   

