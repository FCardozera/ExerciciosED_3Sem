package exercicios.marco1.exercicios_p1.questao05;

public class Noh_Inteiro {
    private int inteiro;
    private Noh_Inteiro anterior;
    private Noh_Inteiro proximo;

    public Noh_Inteiro (int inteiro) {
        this.inteiro = inteiro;
        this.anterior = null;
        this.proximo = null;
    }

    public int getInteiro() {
        return inteiro;
    }

    public Noh_Inteiro getProximo() {
        return proximo;
    }

    public Noh_Inteiro getAnterior() {
        return anterior;
    }

    public void setAnterior(Noh_Inteiro anterior) {
        this.anterior = anterior;
    }

    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    public void setProximo(Noh_Inteiro proximo) {
        this.proximo = proximo;
    }
}
