package exercicios.marco1.atvd08;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        VetorInt vetorInt = new VetorInt(1000);

        for (int i = 0; i < 1000; i++) {
            int random = rand.nextInt(200000);
            vetorInt.adiciona(random);
        }
        // // TESTE QUICKSORT
        // System.out.println(vetorInt.imprimeVetor());
        vetorInt.ordenaQuicksort(vetorInt, 0, vetorInt.tamanho() - 1);
        // System.out.println(vetorInt.imprimeVetor());
        int aux = vetorInt.getVetorInt()[999]; // ULTIMO ELEMENTO ARMAZENADO

        long startTimeRecursion = System.nanoTime();
        try {
            System.out.println("Método recursivo achou: " + vetorInt.pesquisaBinaria(vetorInt, aux));
            long endTimeRecursion = System.nanoTime();
            System.out.println("Tempo de execução em nano (Pesquisa Binária): " + (endTimeRecursion - startTimeRecursion) + " nanossegundos");
        } catch (Exception e) {
        }
        long startTimeIteration = System.nanoTime();
        System.out.println("Método iterativo achou: " + vetorInt.contem(aux));
        long endTimeIteration = System.nanoTime();
        System.out.println("Tempo de execução em nano (Iterativo): " + (endTimeIteration - startTimeIteration) + " nanossegundos");
    }
}
