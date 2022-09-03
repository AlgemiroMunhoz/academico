/* 
Criar um robô em java para se movimentar em uma mesa.
O robô deve ser capaz de se movimentar para frente e para trás, virar à esquerda e à direita e detectar 
obstáculos à sua frente. 

O robô deve ter os seguintes atributos:
Posição x e y na mesa (em cm);
- Direção na qual está olhando (Norte, Sul, Leste ou Oeste);
- Um sensor de obstáculos.

O robô deve ser capaz de se movimentar para frente e para trás, virar à esquerda e à direita.
O robô deve parar de se movimentar caso haja um obstáculo à sua frente.

O robô será capaz de se movimentar para frente e para trás, virar à esquerda e à direita.
O robô deve parar de se movimentar caso haja um obstáculo à sua frente.
*/

package LP.RobotTrab;

public class Robocop {

    //Posicao x e y do Robo na mesa (em cm)
    private int _x;
    private int _y;

    //Direcao na qual o robo esta olhando
    //N=Norte, S=Sul, L=Leste, O=Oeste
    private String direcao;

    //Sensor de obstáculos
    // private ObstaculosSensor sensor;
    // private ObstaculosSensororizado sensor;

   

    //Construtor do Robo, inicializando sua posição e direção
    public Robocop(int _x, int _y, String direcao){
        this._x = _x;
        this._y = _y;
        this.direcao = direcao;
        // this.sensor = new ObstaculosSensor();
        // this.sensor = new ObstaculosSensororizado(_y, _y, _y, null, sensor);
    }

    public int get_x() {
        return _x;
    }

    public void set_x(int _x) {
        this._x = _x;
    }

    public int get_y() {
        return _y;
    }

    public void set_y(int _y) {
        this._y = _y;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
}
    
   