package exercicios.marco2.atvd14;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private long matricula;

    public Aluno(String nome, int idade, double nota, long matricula) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString() {
        return (nome);
    }
}
