package exercicios.marco2.atvd11;

public class FilaVet implements IFila {
    private int nElemFila;
    private int inicio;
    private Object[] vetFila;

    public FilaVet (int tamFila){
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    public boolean add(Object info) {
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("Fila esta vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public boolean isEmpty() {
        if(nElemFila == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return nElemFila;
    }

    public String toString() {
        String retorno = "";

        if (!this.isEmpty()) {
            for (int i = 0; i < vetFila.length; i++) {
                retorno += vetFila[i].toString();
            }
        } else {
            return "Lista Vazia!";
        }
        return retorno;
    }
}
