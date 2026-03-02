
package Thread_sleep_join_method;

public class Main extends Thread{

    @Override
    public void run() {
    
        for(int i = 1; i <= 50; i++){
            try {
                Thread.sleep(1000);
                System.out.print(" "+i);
            } catch (InterruptedException ex) {
                System.getLogger(Main.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
         System.out.println();
    }
    
    public static void main(String[] args) throws InterruptedException {
    
            Main m1 = new Main();
            Main m2 = new Main();
            
           
            m1.start();
                 m1.join();
            m2.start();
    }
}
