package exercicios.marco2.atvd13;

public class MapaHashVetorAlunos {

    private Aluno[] vetorAlunos;
    private int tamanho;
    private double fatorDeCarga;

    public MapaHashVetorAlunos(int tamanhoVetorAlunos, double fatorDeCarga) {
        this.vetorAlunos = new Aluno[tamanhoVetorAlunos];
        this.tamanho = 0;
        this.fatorDeCarga = fatorDeCarga;
    }

    private int hash(long chave) {
        int hash = (int) (((chave * 0.78949876) % 1) * vetorAlunos.length);
        return hash;
    }

    public Aluno get(long chave) {
        int hash = hash(chave);
        return this.vetorAlunos[hash];
    }

    public void put(long chave, Aluno valor) {
        int sondagem = 0;
        int hash;

        if (((double) this.tamanho / (double) vetorAlunos.length) >= fatorDeCarga) {
            resize();
        }

        while (sondagem < vetorAlunos.length) {
            hash = (hash(chave) + sondagem) % vetorAlunos.length;
            if (vetorAlunos[hash] == null ||
                    vetorAlunos[hash].getMatricula() == chave) {
                vetorAlunos[hash] = valor;
                tamanho++;
                return;
            }
            sondagem++;
        }
    }

    public Aluno remove(long chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetorAlunos[hash];
        this.vetorAlunos[hash] = null;
        return aluno;
    }

    public int size() {
        return tamanho;
    }

    public int actualCapacity() {
        return vetorAlunos.length;
    }

    public String toString() {
        String retorno = "[";

        if (this.size() > 0) {
            for (int i = 0; i < vetorAlunos.length; i++) {
                if (vetorAlunos[i] != null) {
                    retorno += "(" + i + ", " + vetorAlunos[i].toString() + ") ";
                }
                if (i == (vetorAlunos.length - 1)) {
                    retorno += "]";
                }
            }
            return retorno;
        } else {
            return "Mapa Vazio";
        }
    }

    private void resize() {
        Aluno[] mapaAlunosNovo = new Aluno[vetorAlunos.length * 2];
        for (int i = 0; i < (mapaAlunosNovo.length / 2); i++) {
            mapaAlunosNovo[i] = vetorAlunos[i];
        }
        this.vetorAlunos = mapaAlunosNovo;
        this.rehash();
    }

    private void reset() {
        for (int i = 0; i < vetorAlunos.length; i++) {
            vetorAlunos[i] = null;
        }
    }

    private void rehash() {
        Aluno alunoAux = null;
        Aluno[] mapaAlunosAux = new Aluno[vetorAlunos.length];

        for (int i = 0; i < mapaAlunosAux.length; i++) {
            mapaAlunosAux[i] = vetorAlunos[i];
        }

        this.reset();

        for (int i = 0; i < mapaAlunosAux.length; i++) {
            if (mapaAlunosAux[i] != null) {
                alunoAux = mapaAlunosAux[i];
                if (alunoAux != null) {
                    this.put(alunoAux.getMatricula(), alunoAux);
                }
            }
        }
    }
}
