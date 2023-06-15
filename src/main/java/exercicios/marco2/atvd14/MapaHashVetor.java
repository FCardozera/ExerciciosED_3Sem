package exercicios.marco2.atvd14;

public class MapaHashVetor {

    private LSE[] vetor;
    private int tamanhoVetor, qtdAlunos;
    private double fatorDeCarga;

    public MapaHashVetor(int tamanhoVetor, double fatorDeCarga) {
        this.vetor = new LSE[tamanhoVetor];
        this.tamanhoVetor = 0;
        this.qtdAlunos = 0;
        this.fatorDeCarga = fatorDeCarga;
    }

    private int hash(long chave) {
        int hash = (int) (((chave * 0.78949876) % 1) * vetor.length);
        return hash;
    }

    public Aluno get(long chave) {
        int hash = hash(chave);
        LSE alunos = this.vetor[hash];

        if (alunos == null || alunos.estahVazia()) {
            return null;
        } else {
            Noh atual = alunos.getInicio();
            while (atual != null && !(atual.getInfo().getMatricula() == chave)) {
                atual = atual.getProximo();
            }

            if (atual.getInfo().getMatricula() == chave) {
                return atual.getInfo();
            }
        }

        return null;
    }

    public void put(long chave, Aluno valor) {
        int hash = hash(chave);
        LSE alunos = this.vetor[hash];

        if (((double) this.tamanhoVetor / (double) vetor.length) >= fatorDeCarga) {
            resize();
        }

        if (alunos == null) {
            alunos = new LSE();
            alunos.insereFim(valor);
            this.vetor[hash] = alunos;
            this.tamanhoVetor++;
            this.qtdAlunos++;
        } else {
            this.vetor[hash].insereFim(valor);
            this.qtdAlunos++;
        }
    }

    public Aluno remove(long chave) {
        int hash = hash(chave);
        LSE alunos_lista = this.vetor[hash];

        if (alunos_lista == null) {
            return null;
        } else {
            for (Noh n = alunos_lista.getInicio(); n != null; n = n.getProximo()) {
                if (n.getInfo().getMatricula() == chave) {
                    Aluno aluno = n.getInfo();
                    alunos_lista.remove(aluno);
                    if (alunos_lista.estahVazia()) {
                        this.vetor[hash] = null;
                    }
                    return aluno;
                }
            }
            return null;
        }
    }

    public int sizeVetor() {
        return this.tamanhoVetor;
    }

    public int totalAlunos() {
        return this.qtdAlunos;
    }

    public int actualCapacity() {
        return vetor.length;
    }

    public String toString() {
        String retorno = "[";

        if (this.sizeVetor() > 0) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != null) {
                    retorno += "(" + i + ", " + vetor[i].imprimirLista() + ") ";
                }
                if (i == (vetor.length - 1)) {
                    retorno += "]";
                }
            }
            return retorno;
        } else {
            return "Mapa Vazio";
        }
    }

    private void resize() {
        LSE[] mapaLSEsNovo = new LSE[vetor.length * 3];
        for (int i = 0; i < (mapaLSEsNovo.length / 3); i++) {
            mapaLSEsNovo[i] = vetor[i];
        }
        this.vetor = mapaLSEsNovo;
        this.rehash();
    }

    private void reset() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = null;
        }
    }

    private void rehash() {
        Aluno alunoAux = null;
        LSE[] mapaLSEAux = new LSE[vetor.length];

        for (int i = 0; i < mapaLSEAux.length; i++) {
            mapaLSEAux[i] = vetor[i];
        }

        this.reset();

        for (int i = 0; i < mapaLSEAux.length; i++) {
            if (mapaLSEAux[i] != null) {
                Noh atual = mapaLSEAux[i].getInicio();
                while (atual != null) {
                    alunoAux = atual.getInfo();
                    this.put(alunoAux.getMatricula(), alunoAux);
                    atual = atual.getProximo();
                }
            }
        }
    }
}
