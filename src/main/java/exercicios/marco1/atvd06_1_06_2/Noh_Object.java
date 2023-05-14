package exercicios.marco1.atvd06_1_06_2;
public class Noh_Object {
    private Object info;
    private Noh_Object anterior;
    private Noh_Object proximo;

    public Noh_Object (Object info) {
        this.info = info;
        this.anterior = null;
        this.proximo = null;
    }

    public Object getInfo() {
        return info;
    }

    public Noh_Object getProximo() {
        return proximo;
    }

    public Noh_Object getAnterior() {
        return anterior;
    }

    public void setAnterior(Noh_Object anterior) {
        this.anterior = anterior;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setProximo(Noh_Object proximo) {
        this.proximo = proximo;
    }
}
