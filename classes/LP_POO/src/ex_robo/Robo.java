package ex_robo;

import java.security.PublicKey;

import javax.sound.midi.VoiceStatus;

import ex_ponto.Ponto;

public class Robo {
    Ponto position;
    char drection;

    public Robo(double _x, double _y) {
        this.position = new Ponto(_x, _y);
    }

    public void move(char dir, int qtoMove) {}
    
    public void top( int pos) {}
    
    public void dow( int pos) {}
    
    public void left( int pos) {}
    
    public void rigth( int pos) {}
      
      
}
