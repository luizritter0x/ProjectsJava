package aula2ex8;

/**
 *
 * @author Aluno
 */
public class Aluno {

    String aluno;
    int matrícula;
    double[] notas = {7.5, 8.0, 6.7};

    public Aluno(String aluno, int matrícula) {
        this.aluno = aluno;
        this.matrícula = matrícula;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {

            soma += nota;

        }
        return soma / notas.length;

    }

}
