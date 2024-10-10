public class Thread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
    
    public static void main(String[] args){
        Thread t2=new Thread(new Thread2());
        t2.start();
    }
}
