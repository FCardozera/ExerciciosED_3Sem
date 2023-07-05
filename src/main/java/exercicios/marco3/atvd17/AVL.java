package exercicios.marco3.atvd17;

public class AVL {
    private Noh raiz;

    public AVL() {
        this.raiz = null;
    }

    public AVL(Noh raiz) {
        this.raiz = raiz;
    }

    public Noh getRaiz() {
        return raiz;
    }

    public void setRaiz(Noh raiz) {
        this.raiz = raiz;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    private static int altura(Noh t) {
        return t == null ? -1 : t.getFatorBalanceamento();
    }

    private static int maximo(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    private int getFatorBalanceamento(Noh t) {
        return altura(t.getEsq()) - altura(t.getDir());
    }

    public boolean inserir(int x) {
        this.raiz = inserir(x, this.raiz);
        return true;
    }

    private Noh inserir(int x, Noh t) {
        if (t == null)
            t = new Noh(x);
        else if (x < t.getValor())
            t.setEsq(inserir(x, t.getEsq()));
        else if (x > t.getValor())
            t.setDir(inserir(x, t.getDir()));
        t = balancear(t);
        return t;
    }

    public Noh balancear(Noh t) {
        if (getFatorBalanceamento(t) == 2) {
            if (getFatorBalanceamento(t.getEsq()) > 0)
                t = rotacaoDireita(t);
            else
                t = rotacaoDuplaDireita(t);
        } else if (getFatorBalanceamento(t) == -2) {
            if (getFatorBalanceamento(t.getDir()) < 0)
                t = rotacaoEsquerda(t);
            else
                t = rotacaoDuplaEsquerda(t);
        }
        t.setFatorBalanceamento(maximo(altura(t.getEsq()), altura(t.getDir())) + 1);
        return t;
    }

    private static Noh rotacaoDireita(Noh k2) {
        Noh k1 = k2.getEsq();
        k2.setEsq(k1.getDir());
        k1.setDir(k2);
        k2.setFatorBalanceamento(maximo(altura(k2.getEsq()), altura(k2.getDir())) + 1);
        k1.setFatorBalanceamento(maximo(altura(k1.getEsq()), k2.getFatorBalanceamento()) + 1);
        return k1;
    }

    private static Noh rotacaoEsquerda(Noh k1) {
        Noh k2 = k1.getDir();
        k1.setDir(k2.getEsq());
        k2.setEsq(k1);
        k1.setFatorBalanceamento(maximo(altura(k1.getEsq()), altura(k1.getDir())) + 1);
        k2.setFatorBalanceamento(maximo(altura(k2.getDir()), k1.getFatorBalanceamento()) + 1);
        return k2;
    }

    private static Noh rotacaoDuplaDireita(Noh k3) {
        k3.setEsq(rotacaoEsquerda(k3.getEsq()));
        return rotacaoDireita(k3);
    }

    private static Noh rotacaoDuplaEsquerda(Noh k1) {
        k1.setDir(rotacaoDireita(k1.getDir()));
        return rotacaoEsquerda(k1);
    }

    public Noh busca(int el) {
        return busca(this.raiz, el);
    }

    protected Noh busca(Noh p, int el) {
        while (p != null) {
            if (el == p.getValor())
                return p;
            else if (el < p.getValor())
                p = p.getEsq();
            else
                p = p.getDir();
        }
        return null;
    }

    public void emOrdem() {
        emOrdem(this.raiz);
    }

    protected void emOrdem(Noh p) {
        if (p != null) {
            emOrdem(p.getEsq());
            System.out.print(p.getValor() + " - ");
            emOrdem(p.getDir());
        }
    }

    public void preOrdem() {
        preOrdem(this.raiz);
    }

    protected void preOrdem(Noh p) {
        if (p != null) {
            System.out.print(p.getValor() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    protected void posOrdem(Noh p) {
        if (p != null) {
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getValor() + " ");
        }
    }

    protected Noh buscaPai(int el) {
        Noh p = this.raiz;
        Noh prev = null;
        while (p != null && !(p.getValor() == el)) {
            prev = p;
            if (p.getValor() < el)
                p = p.getDir();
            else
                p = p.getEsq();
        }
        if (p != null && p.getValor() == el)
            return prev;
        return null;
    }

    public void mostrarArvore() {
        if (isEmpty()) {
            System.out.println("Árvore vazia!");
            return;
        }
        String separator = String.valueOf("  |__");
        System.out.println(this.raiz.getValor() + "(" + this.raiz.getFatorBalanceamento() + ")");
        mostrarSubarvore(this.raiz.getEsq(), separator);
        mostrarSubarvore(this.raiz.getDir(), separator);
    }

    private void mostrarSubarvore(Noh node, String separator) {

        if (node != null) {

            Noh father = this.buscaPai(node.getValor());
            if (node.equals(father.getEsq()) == true) {
                System.out.println(separator + node.getValor() + "(" + node.getFatorBalanceamento() + ")" + " (ESQ)");
            } else {
                System.out.println(separator + node.getValor() + "(" + node.getFatorBalanceamento() + ")" + " (DIR)");
            }
            mostrarSubarvore(node.getEsq(), "     " + separator);
            mostrarSubarvore(node.getDir(), "     " + separator);
        }
    }
}
