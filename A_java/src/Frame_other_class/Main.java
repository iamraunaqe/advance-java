
package Frame_other_class;

import java.awt.Frame;

class callby extends Frame{

    callby(){
    
        setSize(500, 500);
        setVisible(true);
    }
}
public class Main {

    public static void main(String[] args) {
        new callby();
    }
}
