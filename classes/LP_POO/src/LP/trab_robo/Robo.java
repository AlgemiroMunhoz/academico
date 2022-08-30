package LP.trab_robo;

import java.awt.Robot;
/*Utilizando classe usada para gerar eventos de entrada do sistema
nativo para fins de automação de teste, demonstrações de execução automática
e outros aplicativos em que o controle do mouse e do teclado é necessário
*/
import java.awt.event.KeyEvent;

/*Um evento que indica que um pressionamento de tecla ocorreu em um componente.
Esse evento de baixo nível é gerado por um objeto componente (como um campo de texto)
quando uma tecla é pressionada, liberada ou digitada. O evento é passado para cada objeto
KeyListener ou KeyAdapterregistrado para receber tais eventos usando o addKeyListenermétodo
do componente. ( KeyAdapterobjetos implementam a KeyListenerinterface.) 
Cada objeto ouvinte obtém isso KeyEventquando o evento ocorre.
*/

public class Robo {

    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        robot.setAutoDelay(1000);

        // //Pressiona a tecla F5
        // robot.keyPress(KeyEvent.VK_F5);
        // robot.keyRelease(KeyEvent.VK_F5);

        // //Pressiona as teclas ALT + F4
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_F4);

        // Pressione a tecla prtsc
        robot.keyPress(KeyEvent.VK_PRINTSCREEN);
        robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
    }
}
