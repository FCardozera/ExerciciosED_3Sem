package exercicios.marco2.atvd12;

// Fila de LSE de Objects
public class FilaLista {
    private Noh inicio;
    private Noh fim;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean isEmpty() {
        if (inicio == null && fim == null) {
            return true;
        }
        return false;
    }

    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if (this.isEmpty()) {
            inicio = novo;
        }
        else {
            fim.setProximo(novo);
        }  
        fim = novo;
        return true;
    }

    public boolean remove(Object info) {
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProximo();
            return true;
        }
        return false;
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
