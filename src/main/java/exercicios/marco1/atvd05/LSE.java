package exercicios.marco1.atvd05;

public class LSE implements Lista {
    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void insereFim(Object info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
        } else {
            Noh ultimo;
            for (Noh i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
                ultimo.setProximo(novo);
            }
        }
    }

    public boolean estaVazia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public boolean remove(Object info) {
        Noh ant, p;

        ant = null;
        p = inicio;
        while (p != null && p.getInfo() != info) {
            ant = p;
            p = p.getProximo();
        }
        if (p == null) {
            return false;
        }
        if (ant == null) {
            inicio = p.getProximo();
        } else {
            ant.setProximo(p.getProximo());
        }
        return true;
    }

    public int tamanho() {
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

    public String imprimeLista() {
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
