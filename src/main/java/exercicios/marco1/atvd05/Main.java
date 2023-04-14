package exercicios.marco1.atvd05;

import exercicios.marco1.atvd03_04.Aluno;

public class Main {
    public static void main(String[] args) {
        LSE listaEncadeada = new LSE();
        Aluno aluno1 = new Aluno("João", 20, 10);
        Aluno aluno2 = new Aluno("Robson", 22, 8);


        listaEncadeada.insereFim(aluno1);
        System.out.println(listaEncadeada.imprimeLista()); 
        listaEncadeada.insereInicio(aluno2);
        System.out.println(listaEncadeada.imprimeLista());
        listaEncadeada.remove(aluno1);
        System.out.println(listaEncadeada.imprimeLista());
        System.out.println(listaEncadeada.tamanho());
        System.out.println(listaEncadeada.estaVazia());
    }
}
