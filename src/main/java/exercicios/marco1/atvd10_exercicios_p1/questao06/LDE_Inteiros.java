package exercicios.marco1.atvd10_exercicios_p1.questao06;

// MÉTODO DA QUESTÃO 6 NO FINAL DA CLASSE

public class LDE_Inteiros {
    private Noh_Inteiro inicio;
    private Noh_Inteiro fim;

    public LDE_Inteiros() {
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(int inteiro) {
        Noh_Inteiro novo = new Noh_Inteiro(inteiro);

        if (this.inicio == null) {
            this.inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
        }
    }

    public void insereFim(int inteiro) {
        Noh_Inteiro novo = new Noh_Inteiro(inteiro);

        if (this.inicio == null) {
            this.inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public boolean estaVazia() {
        if (this.inicio == null) {
            return true;
        }
        return false;
    }

    public Noh_Inteiro buscaNoh(int inteiro) {
        Noh_Inteiro aux = this.inicio;

        if (aux == null) {
            return null;
        }
        while (aux != null && aux.getInteiro() != inteiro) {
            aux = aux.getProximo();
        }
        return aux;
    }

    public boolean remove(int inteiro) {
        Noh_Inteiro aux = buscaNoh(inteiro);

        if (aux == null) {
            return false;
        }

        if (aux == this.inicio) {
            this.inicio = aux.getProximo();
            if (this.inicio != null) {
                this.inicio.setAnterior(null);
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
        if (this.inicio == null) {
            return tamanho;
        } else {
            for (Noh_Inteiro i = this.inicio; i != null; i = i.getProximo()) {
                if (i != null) {
                    tamanho++;
                }
            }
            return tamanho;
        }
    }

    public String imprimeInicio() {
        String retorno = "";

        if (this.inicio == null && fim == null) {
            retorno = "Lista Vazia!";
            return retorno;
        } else {
            for (Noh_Inteiro i = this.inicio; i != null; i = i.getProximo()) {
                if (i != null) {
                    retorno += "[" + i.getInteiro() + "] ";
                }
            }
            return retorno;
        }
    }

    public String imprimeFim() {
        String retorno = "";

        if (this.inicio == null && fim == null) {
            retorno = "Lista Vazia!";
            return retorno;
        } else {
            for (Noh_Inteiro i = fim; i != null; i = i.getAnterior()) {
                if (i != null) {
                    retorno += "[" + i.getInteiro() + "] ";
                }
            }
            return retorno;
        }
    }

    public int nroPares() {
        Noh_Inteiro aux = this.inicio;
        int nroPares = 0;

        if (aux == null) {
            return 0;
        }
        while (aux != null) {
            if ((aux.getInteiro()%2) == 0) {
                nroPares++;
            }
            aux = aux.getProximo();

        }
        return nroPares;
    }

    // MÉTODO QUESTÃO 06 - P1

    public void add_ordenado(int inteiro) {

        Noh_Inteiro novo = new Noh_Inteiro(inteiro);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else if (inteiro < inicio.getInteiro()) {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        } else if (inteiro > fim.getInteiro()) {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        } else {
            Noh_Inteiro p = inicio;

            while (p != null && p.getInteiro() < inteiro) {
                p = p.getProximo();
            }

            novo.setProximo(p);
            novo.setAnterior(p.getAnterior());
            p.getAnterior().setProximo(novo);
            p.setAnterior(novo);
        }
    }
}
