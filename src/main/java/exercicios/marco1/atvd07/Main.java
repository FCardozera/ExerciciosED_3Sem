package exercicios.marco1.atvd07;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        VetorInt vetorInt = new VetorInt(1000);

        for (int i = 0; i < 1000; i++) {
            int random = rand.nextInt(20000);
            vetorInt.adiciona(random);
        }

        long startTimeRecursion = System.nanoTime();
        System.out.println("Método recursivo achou: " + vetorInt.maiorElementoRec(0, (vetorInt.tamanho() - 1))); 
        long endTimeRecursion = System.nanoTime();
        System.out.println("Tempo de execução em nano (Recursivo): " + (endTimeRecursion - startTimeRecursion) + " nanossegundos");

        long startTimeIteration = System.nanoTime();
        System.out.println("Método iterativo achou: " + vetorInt.maiorElementoItera()); 
        long endTimeIteration = System.nanoTime();
        System.out.println("Tempo de execução em nano (Iterativo): " + (endTimeIteration - startTimeIteration) + " nanossegundos");
        
    }
}
