package exercicios.marco2.atvd12;

public class Main {
    public static void main(String[] args) {
        // Exercício 12
        FilaLista filaAlunos = new FilaLista();
        Aluno aluno1 = new Aluno("João 1", 20, 10);
        Aluno aluno2 = new Aluno("Robson 2", 22, 8);
        Aluno aluno3 = new Aluno("Felipe 3", 20, 10);
        Aluno aluno4 = new Aluno("Mauricio 4", 22, 8);
        Aluno aluno5 = new Aluno("Claudio 5", 20, 10);
        Aluno aluno6 = new Aluno("José 6", 22, 8);

        filaAlunos.add(aluno1);
        System.out.println(filaAlunos.toString());
        filaAlunos.add(aluno2);
        System.out.println(filaAlunos.toString());
        filaAlunos.add(aluno3);
        System.out.println(filaAlunos.toString());
        filaAlunos.add(aluno4);
        System.out.println(filaAlunos.toString());
        filaAlunos.add(aluno5);
        System.out.println(filaAlunos.toString());
        filaAlunos.add(aluno6);
        System.out.println("Tamanho: " + filaAlunos.size());
        System.out.println("Está vazia: " + filaAlunos.isEmpty());
    }
}
