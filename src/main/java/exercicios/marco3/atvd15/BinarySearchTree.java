package exercicios.marco3.atvd15;

public class BinarySearchTree {
    private Noh raiz;

    public BinarySearchTree() {
        this.raiz = null;
    }

    public BinarySearchTree(Noh raiz) {
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

    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.getValor()) {
                    if (aux.getEsq() == null) {
                        Noh newNode = new Noh(element);
                        aux.setEsq(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getEsq();

                } else {
                    if (aux.getDir() == null) {
                        Noh newNode = new Noh(element);
                        aux.setDir(newNode);
                        newNode.setPai(aux);
                        return;
                    }
                    aux = aux.getDir();
                }
            }
        }
    }

    public void recursiveAdd(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            recursiveAdd(this.raiz, element);
        }
    }

    private void recursiveAdd(Noh node, int element) {
        if (element < node.getValor()) {
            if (node.getEsq() == null) {
                Noh newNode = new Noh(element);
                node.setEsq(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getEsq(), element);
        } else {
            if (node.getDir() == null) {
                Noh newNode = new Noh(element);
                node.setDir(newNode);
                newNode.setPai(node);
                return;
            }
            recursiveAdd(node.getDir(), element);
        }
    }

    public boolean busca(int valor) {
        return percorrerBusca(this.raiz, valor);
    }

    public String toStringCrescente() {
        if (isEmpty()) {
            return "Árvore está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        percorrerCrescente(this.raiz, conteudo);
        return conteudo.toString();
    }

    public String toStringDecrescente() {
        if (isEmpty()) {
            return "Árvore está vazia";
        }

        StringBuilder conteudo = new StringBuilder();
        percorrerDecrescente(this.raiz, conteudo);
        return conteudo.toString();
    }

    private boolean percorrerBusca(Noh node, int valor) {
        if (node != null) {
            if (node.getValor() == valor) {
                return true;
            } else if (percorrerBusca(node.getDir(), valor)) {
                return true;
                
            } else if (percorrerBusca(node.getEsq(), valor)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private void percorrerCrescente(Noh node, StringBuilder str) {
        if (node != null) {
            percorrerCrescente(node.getEsq(), str);
            str.append(node.getValor()).append(" ");
            percorrerCrescente(node.getDir(), str);
        }
    }

    private void percorrerDecrescente(Noh node, StringBuilder str) {
        if (node != null) {
            percorrerDecrescente(node.getDir(), str);
            str.append(node.getValor()).append(" ");
            percorrerDecrescente(node.getEsq(), str);
        }
    }
}
