
package Thread_other_class;

class MyThread extends Thread {

    @Override
    public void run() {
        
        System.out.print("MYTHREAD !");
    }

}
public class Main {
    
    public static void main(String[] args) {
        MyThread MI = new MyThread();
        MI.start();
    }
}
