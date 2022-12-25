public class Restaurant implements Runnable {
    private static final Object lock = new Object ();
    private static int foodNumber=1;
    private boolean waitingForpickup= false;
    
    @Override
    public void run(){
        while(true){
            makeFood();
            try{
                Thread.sleep(15000);
            } catch(InterruptedException a){
                a.printStackTrace();
            }
        }
    }
    public static Object getLock(){
        return lock;
    }
    public void setWaitingForPickup(boolean waitingForpickup){
        this.waitingForpickup=waitingForpickup;     
    }
    public static int getfoodNumber(){
        return foodNumber;
    }
    public void makeFood(){
        synchronized(Restaurant.lock){
            if(this.waitingForpickup){
                try{
                    System.out.println("Restaurant: Waiting for the waiter to deliver the food ");
                    Restaurant.lock.wait();
                } catch(InterruptedException a){
                    a.printStackTrace();
                }
            }
            waitingForpickup =true;
            System.out.println("Restaurant : making food number"+ foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("restaurant : send message the waitter to get food");
        }

    }
}
