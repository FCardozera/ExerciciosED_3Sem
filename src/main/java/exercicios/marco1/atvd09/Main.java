package exercicios.marco1.atvd09;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        VetorInt vetorInt01_Bubble = new VetorInt(20);
        VetorInt vetorInt02_Selection = new VetorInt(20);
        VetorInt vetorInt03_Insertion = new VetorInt(20);

        for (int i = 0; i < 20; i++) {
            int random = rand.nextInt(20000);
            vetorInt01_Bubble.adiciona(random);
            vetorInt02_Selection.adiciona(random);
            vetorInt03_Insertion.adiciona(random);
        }

        // Serão utilizadas cópias do vetor 01 para serem comparados os tempos de execução das ordenações,
        // de modo que seja comparado com os mesmos números nas mesmas posições

        //BUBBLESORT
        System.out.println("ORDENAÇÃO BUBBLESORT");
        System.out.println(vetorInt01_Bubble.imprimeVetor());
        long startTimeBubble = System.nanoTime();
        vetorInt01_Bubble.ordenaBubblesort();
        long endTimeBubble = System.nanoTime();
        System.out.println(vetorInt01_Bubble.imprimeVetor());
        System.out.println("Tempo de execução em nano (Ordenação Bubblesort): " + (endTimeBubble - startTimeBubble) + " nanossegundos");
        System.out.println("\n");

        //SELECTIONSORT
        System.out.println("ORDENAÇÃO SELECTIONSORT");
        System.out.println(vetorInt02_Selection.imprimeVetor());
        long startTimeSelection = System.nanoTime();
        vetorInt02_Selection.ordenaSelectionsort();
        long endTimeSelection = System.nanoTime();
        System.out.println(vetorInt02_Selection.imprimeVetor());
        System.out.println("Tempo de execução em nano (Ordenação Selectionsort): " + (endTimeSelection - startTimeSelection) + " nanossegundos");
        System.out.println("\n");

        //INSERTIONSORT
        System.out.println("ORDENAÇÃO INSERTIONSORT");
        System.out.println(vetorInt03_Insertion.imprimeVetor());
        long startTimeInsertion = System.nanoTime();
        vetorInt03_Insertion.ordenaInsertionsort();
        long endTimeInsertion = System.nanoTime();
        System.out.println(vetorInt03_Insertion.imprimeVetor());
        System.out.println("Tempo de execução em nano (Ordenação Insertionsort): " + (endTimeInsertion - startTimeInsertion) + " nanossegundos");
        System.out.println("\n");
    }
}
