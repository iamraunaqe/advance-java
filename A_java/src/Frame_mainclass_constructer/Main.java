package Frame_mainclass_constructer;

import java.awt.Frame;

public class Main extends Frame{
    
    Main(){
        setSize(500, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
