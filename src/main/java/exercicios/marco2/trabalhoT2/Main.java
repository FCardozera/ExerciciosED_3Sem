package exercicios.marco2.trabalhoT2;

public class Main {
    public static void main(String[] args) {
        // Exercício 01 - Aplicação da Função de Verificação de Palíndromo
        Pilha pilha = new Pilha(20);
        if (pilha.verificaPalindromo("arara")) {
            System.out.println("PALAVRA ARARA É PALINDROMO");
        } else {
            System.out.println("Função falhou");
        }

        if (pilha.verificaPalindromo("objeto")) {
            System.out.println("Função falhou");
        } else {
            System.out.println("PALAVRA OBJETO NÃO É PALINDROMO");
        }

        // Exercício 02 - Inverter ordem de Fila de Alunos
        PilhaAlunos pilhaAlunos = new PilhaAlunos(20);
        FilaListaAlunos filaAlunos = new FilaListaAlunos();
        Aluno aluno1 = new Aluno("João 1", 20, 10);
        Aluno aluno2 = new Aluno("Robson 2", 22, 8);
        Aluno aluno3 = new Aluno("Felipe 3", 20, 10);
        Aluno aluno4 = new Aluno("Mauricio 4", 22, 8);
        Aluno aluno5 = new Aluno("Claudio 5", 20, 10);
        Aluno aluno6 = new Aluno("José 6", 22, 8);
        filaAlunos.add(aluno1);
        filaAlunos.add(aluno2);
        filaAlunos.add(aluno3);
        filaAlunos.add(aluno4);
        filaAlunos.add(aluno5);
        filaAlunos.add(aluno6);
        System.out.println(filaAlunos.toString()); // Fila de Alunos Inicial
        
        for (int i = 0; i < 6; i++) {
            pilhaAlunos.push(filaAlunos.remove());
            System.out.println("Fila: " + filaAlunos.toString());
            System.out.println("Pilha: " + pilhaAlunos.toString() + "\n");
        }
        for (int i = 0; i < 6; i++) {
            filaAlunos.add(pilhaAlunos.pop());
            System.out.println("Fila: " + filaAlunos.toString());
            System.out.println("Pilha: " + pilhaAlunos.toString() + "\n");
        }
    }
}
