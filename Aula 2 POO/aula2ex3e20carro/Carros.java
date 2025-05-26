package aula2ex3e20carro;

/**
 *
 * @author Aluno
 */
public class Carros {

    String marca;
    String modelo;
    int ano;
    boolean ligado;

    public Carros(String marca, String modelo, int ano, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado;
    }

    public void status() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado.\n Ligar o carro? (s/n)");
        }

    }

    public void desligar() {
        if (ligado) {
            ligado = true;
            System.out.println("O carro está ligado. \n Desligar o carro? (s/n).");

        }

    }

    public void acelerar() {
        if (ligado) {
            ligado = true;
            System.out.println("O carro está acelerando!");
            

        }

    }

}
