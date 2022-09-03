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

public class Robo {

public static void main(String[] args) throws Exception {}
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
    public Robo(int _x, int _y, String direcao){
        this._x = _x;
        this._y = _y;
        this.direcao = direcao;
        // this.sensor = new ObstaculosSensor();
        // this.sensor = new ObstaculosSensororizado(_y, _y, _y, null, sensor);
        
    }
    
    //Metodo para o Robo andar para frente
    //O Robo deve andar 10 cm para frente
    public void andarFrente(){
        if(this.direcao.equals("N")){
            this._y -=10;
        }
        else if (this.direcao.equals("S")){
            this._y +=10;
        }
        else if (this.direcao.equals("L")){
            this._x -=10;
        }
        else if (this.direcao.equals("O")){
            this._x +=10;
        }
    }

    //Metodo para o Robo virar a esqueda
    //O Robo deve virar 90 graus à esquerda

    public void virarE(){
        if(this.direcao.equals("N")){
            this.direcao = "O";
        }
        else if (this.direcao.equals("S")){
            this.direcao = "L";
        }
        else if (this.direcao.equals("L")){
            this.direcao = "N";
        }
        else if (this.direcao.equals("0")){
            this.direcao = "S";
        }
    }

    //Metodo para o Robo virar à direita
    //O Robo deve virar 90 graus à direita

    public void virarD(){
        if(this.direcao.equals("N")){
            this.direcao = "L";
        }
        else if (this.direcao.equals("S")){
            this.direcao = "O";
        }
        else if (this.direcao.equals("L")){
            this.direcao = "S";
        }
        else if (this.direcao.equals("O")){
            this.direcao = "N";
        }
    }

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
        System.out.println("Posição atual do Robo: ("+this._x+","+this._y+")");
    }
}

