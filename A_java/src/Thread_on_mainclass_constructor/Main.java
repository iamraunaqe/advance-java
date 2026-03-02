
package Thread_on_mainclass_constructor;

public class Main extends Thread{

    @Override
    public void run() {
           System.out.println("Thread_on_mainclass_constructor.Main.run()");
    }
    
    public static void main(String[] args) {
        Main call = new Main();
        call.start();
    }
}
