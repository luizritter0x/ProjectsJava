package ex9;

public class produto {
String nome;
double preco;
int quantidadeEmEstoque;

int vender(int quantidade) {
    
    return quantidadeEmEstoque - quantidade;
    
}

int reporEstoque(int quantidade) {
    
    int repor = quantidadeEmEstoque + quantidade;
    return repor;
    
    }

 }