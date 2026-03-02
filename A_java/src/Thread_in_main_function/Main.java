
package Thread_in_main_function;

public class Main {
    
    public static void main(String[] args) {
 
        Thread th = new Thread(){
            @Override
            public void run() { 
                System.out.print("Thread !");
            }
        };
        
        th.start();
    
    }
   
}
