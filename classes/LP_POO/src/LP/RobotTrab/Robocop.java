/* 
Criar um robô em java para se movimentar em uma mesa.
O robô deve ser capaz de se movimentar para frente e para trás, virar à esquerda e à direita e detectar 
obstáculos à sua frente. 
O robô deve ter os seguintes atributos:
Posição x e y na mesa (em cm);
- Direção na qual está olhando (Norte, Sul, Leste ou Oeste);
*/

package LP.RobotTrab;

public class Robocop {

    //Posicao x e y do Robo na mesa (em cm)
    private int _x;
    private int _y;

    //Direcao na qual o robo esta olhando
    //Norte, Sul, Leste, Oeste
    // private String direcao;

    //Construtor do Robo, inicializando sua posição e direção
    public Robocop(int _x, int _y){
        this._x = _x;
        this._y = _y;
        // this.direcao = direcao;
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

    // public String getDirecao() {
    //     return direcao;
    // }

    // public void setDirecao(String direcao) {
    //     this.direcao = direcao;
    // }


     //Metodo para a moviemntação do Robo

    public void movimentar(String direcao, int casas) {
        if (direcao.equals("Norte")) {
            this._x += casas;
        } else if (direcao.equals("Sul")) {
            this._y -= casas;
        } else if (direcao.equals("Leste")) {
            this._y += casas;
        } else if (direcao.equals("Oeste")) {
            this._x -= casas;
        }


        //Imprimir na tela a posição do Robo

        System.out.println("Posição atual do robo: ");
        System.out.println("Posição Plano carteziano X: " + this._x);
        System.out.println("Posição Plano carteziano Y: " + this._y);
    }
}
    
   