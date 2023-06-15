package exercicios.marco1.atvd10_exercicios_p1.questao09;

public class LSE {
    private Noh inicio;

    // RESPOSTA QUESTAO 09 NO FIM DA CLASSE

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(int info) {
        Noh novo = new Noh(info);

        if (inicio == null) {
            inicio = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void insereFim(int info) {
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

    public boolean remove(int info) {
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
                    retorno += "[" + i.getInfo() + "] ";
                }
            }
            return retorno;
        }
    }

    public String imprime_rec() {
        if (estaVazia()) {
            return "Lista está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        imprime_rec(this.inicio, conteudo);
        return conteudo.toString();
    }

    private void imprime_rec(Noh i, StringBuilder str) {
        if (i != null) {
            str.append(i.getInfo()).append(" ");
            if (i.getProximo() != null) {
                imprime_rec(i.getProximo(), str);
            }
        }
    }

    // QUESTAO 09
    public void bubbleSort() {
        for(Noh i = inicio; i != null; i = i.getProximo()) {
            for(Noh j = inicio; j != null; j = j.getProximo()) {
                if((int) i.getInfo() < (int) j.getInfo()) {
                    int aux = i.getInfo();
                    i.setInfo(j.getInfo());
                    j.setInfo(aux);
                }
            }
        }
    }
}
