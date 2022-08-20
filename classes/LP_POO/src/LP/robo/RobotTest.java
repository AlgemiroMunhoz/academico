package LP.robo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotTest {

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        robot.setAutoDelay(1000);

        // //Pressiona a tecla F5
        // robot.keyPress(KeyEvent.VK_F5);
        // robot.keyRelease(KeyEvent.VK_F5);

        // //Pressiona as teclas ALT + F4
        //  robot.keyPress(KeyEvent.VK_ALT);
        //  robot.keyPress(KeyEvent.VK_F4);
        //  robot.keyRelease(KeyEvent.VK_ALT);
        //  robot.keyRelease(KeyEvent.VK_F4);

        // Pressione a tecla prtsc
        robot.keyPress(KeyEvent.VK_PRINTSCREEN);
        robot.keyRelease(KeyEvent.VK_PRINTSCREEN);

        
    }
}

// public class Robo {
//     Ponto position;
//     char drection;

//     public Robo(double _x, double _y) {
//         this.position = new Ponto(_x, _y);
//     }

//     public void move(char dir, int qtoMove) {}
    
//     public void top( int pos) {}
    
//     public void dow( int pos) {}
    
//     public void left( int pos) {}
    
//     public void rigth( int pos) {}
      
      
// }