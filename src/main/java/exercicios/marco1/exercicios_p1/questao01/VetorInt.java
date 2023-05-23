package exercicios.marco1.exercicios_p1.questao01;

public class VetorInt {
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

        if (inicio == (fim)) {
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

    public int particaoQuicksort(VetorInt vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor.getVetorInt()[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (vetor.getVetorInt()[i] < pivo);
            do {
                j--;
            } while (vetor.getVetorInt()[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor.getVetorInt()[i];
            vetor.getVetorInt()[i] = vetor.getVetorInt()[j];
            vetor.getVetorInt()[j] = aux;
        }
    }

    public void ordenaQuicksort(VetorInt vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particaoQuicksort(vetor, esquerda, direita);
            ordenaQuicksort(vetor, esquerda, pivo);
            ordenaQuicksort(vetor, pivo + 1, direita);
        }

    }

    public int[] getVetorInt() {
        return vetorInt;
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

    public String imprimeVetor() {
        String retorno = "";

        if (tamanhoAtual == 0) {
            return "Lista Vazia!";
        }
        for (int i = 0; i < tamanhoAtual; i++) {
            retorno += "[" + vetorInt[i] + "] ";
        }
        return retorno;
    }

    public void ordenaBubblesort() {
        for (int i = 0; i < tamanhoAtual; i++) {
            for (int j = 0; j < tamanhoAtual - 1; j++) {
                if (this.vetorInt[j] > this.vetorInt[j + 1]) {
                    int aux = this.vetorInt[j];
                    this.vetorInt[j] = this.vetorInt[j + 1];
                    this.vetorInt[j + 1] = aux;
                }
            }
        }
    }

    public void ordenaSelectionsort() {
        for (int i = 0; i < tamanhoAtual; i++) {
            int menor = i;
            for (int j = i + 1; j < tamanhoAtual; j++) {
                if (this.vetorInt[j] < this.vetorInt[menor]) {
                    menor = j;
                }
                int aux = vetorInt[i];
                this.vetorInt[i] = this.vetorInt[menor];
                this.vetorInt[menor] = aux;
            }
        }
    }

    public void ordenaInsertionsort() {
        for (int i = 1; i < tamanhoAtual; i++) {
            int chave = this.vetorInt[i];
            int j = i - 1;
            while (j >= 0 && chave < this.vetorInt[j]) {
                this.vetorInt[j + 1] = this.vetorInt[j];
                j--;
            }
            this.vetorInt[j + 1] = chave;
        }
    }

    public int pesquisaBinaria(VetorInt vetor, int inteiro) throws Exception {
        int inicio = 0;
        int fim = vetor.tamanho() - 1;

        while (inicio <= fim) {
            int meio = (int) (inicio + fim) / 2;
            int chute = vetor.getVetorInt()[meio];
            if (chute == inteiro) {
                return meio;
            }
            if (chute > inteiro) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        throw new Exception();
    }
}
