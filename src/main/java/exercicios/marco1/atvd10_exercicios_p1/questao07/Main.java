package exercicios.marco1.atvd10_exercicios_p1.questao07;

import exercicios.marco1.atvd03_04.Aluno;

public class Main {
    public static void main(String[] args) {
        LSE listaEncadeada = new LSE();
        Aluno aluno1 = new Aluno("João", 20, 10);
        Aluno aluno2 = new Aluno("Robson", 22, 8);

        listaEncadeada.insereInicio(aluno1);
        listaEncadeada.insereInicio(aluno2);
        System.out.println(listaEncadeada.imprime_rec());
    }
}
