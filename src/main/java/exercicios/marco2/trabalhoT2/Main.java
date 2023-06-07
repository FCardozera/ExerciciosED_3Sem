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
    }
}
