package exercicios.marco1.atvd02_03;

public class Main {

    public static void main(String[] args) {
        VetorAlunos alunos = new VetorAlunos(4);
        Aluno aluno1 = new Aluno("João", 20, 10);
        Aluno aluno2 = new Aluno("Robson", 22, 8);

        alunos.adiciona(aluno1); 
        alunos.adiciona(aluno2);
        System.out.println(alunos.contem(aluno2));
        System.out.println("Tamanho: " + alunos.tamanho());
        System.out.println(alunos.remove(aluno2)); 
        System.out.println(alunos.contem(aluno2));
    }
}
