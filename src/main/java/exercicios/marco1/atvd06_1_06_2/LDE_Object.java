package exercicios.marco1.atvd06_1_06_2;

public class LDE_Object implements ListaObject {
    private Noh_Object inicio;
    private Noh_Object fim;

    public LDE_Object() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Object info) {
        Noh_Object novo = new Noh_Object(info);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    public void insereFim(Object info) {
        Noh_Object novo = new Noh_Object(info);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public boolean estaVazia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    public boolean remove(Object info) {
        Noh_Object aux = inicio;

        while (aux != null && aux.getInfo() != info) {
            aux = aux.getProximo();
        }
    
        if (aux == null) {
            return false;
        }

        if (aux == inicio) {
            inicio = aux.getProximo();
            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                fim = null;
            }       
        } else if (aux.getProximo() == null) {
            aux.getAnterior().setProximo(null);
            fim = aux.getAnterior();
        } else {
            aux.getAnterior().setProximo(aux.getProximo());
            aux.getProximo().setAnterior(aux.getAnterior());
        }
        return true;
    }

    public int tamanho() {
        int tamanho = 0;
        if (inicio == null) {
            return tamanho;
        } else {
            for (Noh_Object i = inicio; i != null; i = i.getProximo()) {
                if (i != null) {
                    tamanho++;
                }
            }
            return tamanho;
        }
    }

    public String imprimeInicio() {
        String retorno = "";

        if (inicio == null && fim == null) {
            retorno = "Lista Vazia!";
            return retorno;
        } else {
            for (Noh_Object i = inicio; i != null; i = i.getProximo()) {
                if (i != null) {
                    retorno += "[" + i.getInfo().toString() + "] ";
                }
            }
            return retorno;
        }
    }

    public String imprimeFim() {
        String retorno = "";

        if (inicio == null && fim == null) {
            retorno = "Lista Vazia!";
            return retorno;
        } else {
            for (Noh_Object i = fim; i != null; i = i.getAnterior()) {
                if (i != null) {
                    retorno += "[" + i.getInfo().toString() + "] ";
                }
            }
            return retorno;
        }
    }
}
