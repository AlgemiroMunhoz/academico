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

package LP.robo_teste;

public class Robot {

    //Posicao x e y do Robo na mesa (em cm)
    private int _x;
    private int _y;
    private Object direcao;

    //Direcao na qual o robo esta olhando
    //N=Norte, S=Sul, L=Leste, O=Oeste
    // private String direcao;

    //Construtor do Robo, inicializando sua posição e direção
    public Robot(int _x, int _y){
        this._x = _x;
        this._y = _y;
        // this.direcao = direcao;
        // this.sensor = new ObstaculosSensor();
        // this.sensor = new ObstaculosSensororizado(_y, _y, _y, null, sensor);
        
    }
    
    //Metodo para o Robo andar para frente
    //O Robo deve andar 10 cm para frente
    public void andarFrente(String direcao, int casas){
        if(direcao.equals("N")){
            this._x += casas;
        }
        else if (direcao.equals("S")){
            this._y -= casas;
        }
        else if (direcao.equals("L")){
            this._x += casas;
        }
        else if (direcao.equals("O")){
            this._y -= casas;
        }
    }

    // //Metodo para o Robo virar a esqueda
    // //O Robo deve virar 90 graus à esquerda

    // public void virarE(){
    //     if(this.direcao.equals("N")){
    //         this.direcao = "O";
    //     }
    //     else if (this.direcao.equals("S")){
    //         this.direcao = "L";
    //     }
    //     else if (this.direcao.equals("L")){
    //         this.direcao = "N";
    //     }
    //     else if (this.direcao.equals("0")){
    //         this.direcao = "S";
    //     }
    // }

    //Metodo para o Robo virar à direita
    //O Robo deve virar 90 graus à direita

    // public void virarD(){
    //     if(this.direcao.equals("N")){
    //         this.direcao = "L";
    //     }
    //     else if (this.direcao.equals("S")){
    //         this.direcao = "O";
    //     }
    //     else if (this.direcao.equals("L")){
    //         this.direcao = "S";
    //     }
    //     else if (this.direcao.equals("O")){
    //         this.direcao = "N";
    //     }
    // }

    //Metodo para o Robo virar obstáculos à sua frente.
    // O Robo deve para de se movimentar caso haja um obstáculo à sua frente

    // public boolean verificarObstaculo(){
    //     if (this.sensor.detectarObstaculo(this._x,this._y, this.direcao)){
    //         return true;
    //     }
    //     return false;
    // }

    //Metodo para imprimir a posicao atual do Robo

    public void imprimirPosicao(){
        System.out.println("Posição atual do robo: ");
        System.out.println("Posição Plano carteziano X: " + this._x);
        System.out.println("Posição Plano carteziano Y: " + this._y);
    }
}

