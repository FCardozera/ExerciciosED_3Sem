package exercicios.marco1.atvd02;

public class VetorAlunos {
    private Aluno[] alunos;
    private int tamanhoVetor = 0;
    private int tamanhoAtual = 0;

    public VetorAlunos(int tamanhoVetor) {
        alunos = new Aluno[tamanhoVetor];
        this.tamanhoVetor = tamanhoVetor;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public boolean adiciona(Aluno aluno) {
        if (tamanhoAtual < tamanhoVetor) {
            this.alunos[this.tamanhoAtual] = aluno;
            tamanhoAtual++;
            return true;
        }
        return false;
        
    }

    public int getTamanhoAtual() {
        return tamanhoAtual;
    }

    public int getTamanhoVetor() {
        return tamanhoVetor;
    }


}
