package exercicios.marco1.atvd08;

public class VetorInt implements IVetor{
    private int[] vetorInt;
    private int tamanhoVetor = 0;
    private int tamanhoAtual = 0;

    public VetorInt(int tamanhoVetor) {
        vetorInt = new int[tamanhoVetor];
        this.tamanhoVetor = tamanhoVetor;
    }

    public boolean contem(int numero) {
        for (int i = 0; i < this.tamanhoAtual; i++) {
            if (vetorInt[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public void adiciona(int numero) {
        this.garanteEspaco();
        this.vetorInt[this.tamanhoAtual] = numero;
        this.tamanhoAtual++;
    }

    public int tamanho() {
        return tamanhoAtual;
    }

    public boolean cheio() {
        if (this.tamanhoAtual == this.tamanhoVetor) {
            return true;
        }
        return false;
    }

    private void garanteEspaco() {
        if (this.cheio()) {
            int[] novovetorInt = new int[this.vetorInt.length * 2];
            for (int i = 0; i < this.vetorInt.length; i++) {
                novovetorInt[i] = vetorInt[i];
            }
            this.vetorInt = novovetorInt;
        }
    }

    public boolean remove(int numero) {
        int index = -1;
        for (int i = 0; i < this.vetorInt.length; i++) {
            if (vetorInt[i] == numero) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < (tamanhoAtual - 1); i++) {
                this.vetorInt[i] = this.vetorInt[i + 1];
            }
            this.tamanhoAtual--;
            this.vetorInt[tamanhoAtual] = 0;
            return true;
        }
        return false;
    }

    public int maiorElementoRec(int inicio, int fim) {
        int meio = 0;
        int max1 = 0;
        int max2 = 0;

        if(inicio == (fim)) {
            return vetorInt[inicio];
        } else {
            meio = (inicio + fim) / 2;
            max1 = maiorElementoRec(inicio, meio);
            max2 = maiorElementoRec((meio + 1), (fim));
            if (max1 > max2) { 
                return max1;
            } else {
                return max2;
            }
        }
    }

    public int maiorElementoItera() {
        int aux = 0;

        for (int i = 0; i < vetorInt.length; i++) {
            if (i == 0) {
                aux = vetorInt[i];
            } else {
                if (vetorInt[i] >= aux) {
                    aux = vetorInt[i];
                }
            }
        }
        return aux;
    }
}
