package poo.ProjetoDB;

import java.time.LocalDate;

public class Carro {

  private int id;
  private String modelo;
  private String marca;
  private String cor;
  private LocalDate ano;

  public Carro(int id, String modelo, String marca, String cor, LocalDate ano) {
    this.id = id;
    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public LocalDate getAno() {
    return ano;
  }

  public void setAno(LocalDate ano) {
    this.ano = ano;
  }

  @Override
  public String toString() {
    return "Carro [ano=" + ano + ", cor=" + cor + ", id=" + id + ", marca=" + marca + ", modelo=" + modelo + "]";
  }

  

}