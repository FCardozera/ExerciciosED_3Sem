package exercicios.marco2.atvd14;

public class LSE {

    private Noh inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(Aluno info) {

        Noh novo = new Noh(info);

        if(this.inicio == null) {
            this.inicio = novo;
        } else {
            novo.setProximo(this.inicio);
            this.inicio = novo;
        }

    }

    public Noh getInicio() {
        return inicio;
    }

    public void insereFim(Aluno info) {

        Noh novo = new Noh(info);

        if(inicio == null) {
            inicio = novo;
        } else {
            Noh ultimo = null;
            for(Noh i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
            }
            ultimo.setProximo(novo);
        }

    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(Aluno info) {

        Noh anterior = null;
        Noh atual = inicio;

        while(atual != null && !atual.getInfo().equals(info)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if(atual == null) {
            return false;
        }

        if(anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }

        return true;
    }

    public int tamanho() {
        int tamanho = 0;

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }

        return tamanho;
    }

    public String imprimirLista() {

        String lista = "";

        for(Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }
}
