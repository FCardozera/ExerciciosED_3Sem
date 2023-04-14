package exercicios.marco1.atvd03_04;

public class VetorAlunos implements IVetor{
    private Aluno[] alunos;
    private int tamanhoVetor = 0;
    private int tamanhoAtual = 0;

    public VetorAlunos(int tamanhoVetor) {
        alunos = new Aluno[tamanhoVetor];
        this.tamanhoVetor = tamanhoVetor;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.tamanhoAtual; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public void adiciona(Aluno aluno) {
        this.garanteEspaco();
        this.alunos[this.tamanhoAtual] = aluno;
        this.tamanhoAtual++;
    }

    public int tamanho() {
        return tamanhoAtual;
    }

    public boolean cheio() {
        if (this.tamanhoAtual == this.tamanhoVetor) {
            return true;
        }
        return false;
    }

    private void garanteEspaco() {
        if (this.cheio()) {
            Aluno[] novoAlunos = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novoAlunos[i] = alunos[i];
            }
            this.alunos = novoAlunos;
        }
    }

    public boolean remove(Aluno aluno) {
        int index = -1;
        for (int i = 0; i < this.alunos.length; i++) {
            if (alunos[i].equals(aluno)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < (tamanhoAtual - 1); i++) {
                this.alunos[i] = this.alunos[i + 1];
            }
            this.tamanhoAtual--;
            this.alunos[tamanhoAtual] = null;
            return true;
        }
        return false;
    }


}
