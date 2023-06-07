package exercicios.marco2.trabalhoT2;

// Fila de LSE de Alunos
public class FilaListaAlunos {
    private Noh inicio;

    public FilaListaAlunos() {
        this.inicio = null;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public boolean add(Aluno info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
            return true;
        } else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
            }
            ultimo.setProximo(novo);
            return true;
        }
    }

    public Aluno remove() {
        Aluno info = null;

        if (!isEmpty()) {
            info = (Aluno) inicio.getInfo();
            inicio = inicio.getProximo();
            return info;
        }
        return null;
    }

    public int size() {
        int tamanho = 0;
        if (inicio == null) {
            return tamanho;
        } else {
            for (Noh i = inicio; i != null; i = i.getProximo()) {
                if (i != null) {
                    tamanho++;
                }
            }
            return tamanho;
        }
    }

    public String toString() {
        String retorno = "";

        if (inicio == null) {
            retorno = "Lista Vazia!";
            return retorno;
        } else {
            for (Noh i = inicio; i != null; i = i.getProximo()) {
                if (i != null) {
                    retorno += "[" + i.getInfo().toString() + "] ";
                }
            }
            return retorno;
        }
    }
}
