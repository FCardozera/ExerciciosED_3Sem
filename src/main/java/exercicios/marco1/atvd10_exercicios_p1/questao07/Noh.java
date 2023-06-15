package exercicios.marco1.atvd10_exercicios_p1.questao07;

public class Noh {
    private Object info;
    private Noh proximo;

    public Noh (Object info) {
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() {
        return info;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
}
