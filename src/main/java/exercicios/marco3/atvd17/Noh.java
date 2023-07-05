package exercicios.marco3.atvd17;

public class Noh {
    private int valor;
    private int fatorBalanceamento;
    private Noh esq;
    private Noh dir;
    private Noh pai;

    public Noh(int v) {
        this.valor = v;
        this.fatorBalanceamento = 0;
        this.dir = null;
        this.esq = null;
        this.pai = null;
    }

    public int getValor() {
        return valor;
    }

    public Noh getEsq() {
        return esq;
    }

    public Noh getDir() {
        return dir;
    }

    public Noh getPai() {
        return pai;
    }

    public int getFatorBalanceamento() {
        return fatorBalanceamento;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsq(Noh esq) {
        this.esq = esq;
    }

    public void setDir(Noh dir) {
        this.dir = dir;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }

    public void setFatorBalanceamento(int fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }
}
