package exercicios.marco3.atvd15;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree arvoreBinaria = new BinarySearchTree();

        arvoreBinaria.add(30);
        System.out.println("Árvore atual (Crescente): " + arvoreBinaria.toStringCrescente());
        arvoreBinaria.add(10);
        System.out.println("Árvore atual (Crescente): " + arvoreBinaria.toStringCrescente());
        arvoreBinaria.add(7);
        System.out.println("Árvore atual (Crescente): " + arvoreBinaria.toStringCrescente());
        arvoreBinaria.add(3);
        System.out.println("Árvore atual (Crescente): " + arvoreBinaria.toStringCrescente());
        arvoreBinaria.add(2);
        System.out.println("Árvore atual (Decrescente): " + arvoreBinaria.toStringDecrescente());
        arvoreBinaria.add(45);
        System.out.println("Árvore atual (Decrescente): " + arvoreBinaria.toStringDecrescente());
        arvoreBinaria.add(57);
        System.out.println("Árvore atual (Decrescente): " + arvoreBinaria.toStringDecrescente());

        System.out.println("Busca 57 (Maior): " + arvoreBinaria.busca(57)); //busca maior
        System.out.println("Busca 2 (Menor): " + arvoreBinaria.busca(2)); //busca menor
        System.out.println("Busca 30 (Raíz): " + arvoreBinaria.busca(30)); //busca raíz
        System.out.println("Busca 28 (Não existe): " + arvoreBinaria.busca(28)); //não existe
        System.out.println("Busca 0 (Não existe): " + arvoreBinaria.busca(0)); //não existe
    }

}