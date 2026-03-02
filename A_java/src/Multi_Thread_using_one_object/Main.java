
package Multi_Thread_using_one_object;

class Table extends Thread{

   void table1(){
       for(int i=1; i<=10; i++){
           System.out.println(5+" * "+i+" = "+(i*5));
       }
   }
   void table2(){
       for(int i=1; i<=10; i++){
           System.out.println(10+" * "+i+" = "+(i*10));
       }
   }
}
public class Main {

    public static void main(String[] args) {
     
        //Main m = new Main();
        
            Table TB1 = new Table(){
                @Override
                public void run() {
                    table1();
                }
            };
            Table TB2 = new Table(){
                @Override
                public void run() {
                    table2();
                }
            }; 
        TB1.start();
        TB2.start();
    }
}
