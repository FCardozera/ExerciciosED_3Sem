package exercicios.marco1.atvd06_1_06_2;

import exercicios.marco1.atvd03_04.Aluno;

public class Main {
    public static void main(String[] args) {
        LDE_Inteiros ldeInteiros = new LDE_Inteiros();
        LDE_Object ldeAlunos = new LDE_Object();
        Aluno aluno1 = new Aluno("João", 20, 10);
        Aluno aluno2 = new Aluno("Robson", 22, 8);
        Aluno aluno3 = new Aluno("Felipe", 26, 5);

        // TESTES LDE_INTEIROS
        ldeInteiros.insereInicio(200);
        System.out.println(ldeInteiros.imprimeInicio());
        ldeInteiros.insereInicio(150);
        System.out.println(ldeInteiros.imprimeInicio());
        ldeInteiros.insereFim(86);
        System.out.println(ldeInteiros.imprimeInicio());
        ldeInteiros.insereFim(59);
        System.out.println(ldeInteiros.imprimeInicio());
        System.out.println(ldeInteiros.imprimeFim());
        ldeInteiros.remove(200);
        System.out.println(ldeInteiros.imprimeInicio());
        System.out.println(ldeInteiros.imprimeFim());
        System.out.println(ldeInteiros.tamanho());
        System.out.println(ldeInteiros.estaVazia());

        // TESTES LDE_ALUNOS
        ldeAlunos.insereFim(aluno1);
        System.out.println(ldeAlunos.imprimeInicio()); 
        ldeAlunos.insereInicio(aluno2);
        System.out.println(ldeAlunos.imprimeInicio());
        ldeAlunos.insereFim(aluno3);
        System.out.println(ldeAlunos.imprimeInicio());
        System.out.println(ldeAlunos.imprimeFim());
        ldeAlunos.remove(aluno1);
        System.out.println(ldeAlunos.imprimeInicio());
        System.out.println(ldeAlunos.imprimeFim());
        System.out.println(ldeAlunos.tamanho());
        System.out.println(ldeAlunos.estaVazia());
    }
}
