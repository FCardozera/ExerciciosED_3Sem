package exercicios.marco2.trabalhoT2;

public class PilhaAlunos {
    private Aluno[] pilha;
    private int numElementos;

    public PilhaAlunos(int tamanhoPilha) {
        this.pilha = new Aluno[tamanhoPilha];
        this.numElementos = 0;
    }

    public boolean push(Aluno info) {
        if (this.numElementos == pilha.length) {
            System.out.println("Stack overflow");
            return false;
        }
        this.pilha[this.numElementos] = info;
        this.numElementos++;
        return true;
    }

    public Aluno pop() {
        Aluno info = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        info = this.pilha[numElementos-1];
        this.pilha[numElementos - 1] = null;
        this.numElementos--;
        return info;
    }

    public boolean isEmpty() {
        if (this.numElementos == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return numElementos;
    }

    public Aluno top() {
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        return this.pilha[numElementos - 1];
    }

    // Exercício 03 - Método de impressão de pilha
    public String toString() {
        String retorno = "";

        if (numElementos == 0) {
            return "Lista Vazia!";
        }
        for (int i = 0; i < numElementos; i++) {
            retorno += "[" + this.pilha[i].toString() + "] ";
        }
        return retorno;
    }
}
