package LP.RobotTrab;

public class RobocopApp {
    
    public static void main(String[] args){
    
        Robocop algemiro = new Robocop(0, 0, null);
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
}
