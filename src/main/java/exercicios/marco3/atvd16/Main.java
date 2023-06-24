package exercicios.marco3.atvd16;

public class Main {
    public static void main(String[] args) {
        ABB arvoreBinaria = new ABB();

        arvoreBinaria.add(30);
        System.out.println("Árvore atual: " + arvoreBinaria.emOrdem());
        arvoreBinaria.add(10);
        System.out.println("Árvore atual: " + arvoreBinaria.emOrdem());
        arvoreBinaria.add(7);
        System.out.println("Árvore atual: " + arvoreBinaria.emOrdem());
        arvoreBinaria.add(3);
        System.out.println("Árvore atual: " + arvoreBinaria.emOrdem());
        arvoreBinaria.add(2);
        System.out.println("Árvore atual: " + arvoreBinaria.emOrdem());
        arvoreBinaria.add(45);
        System.out.println("Árvore atual: " + arvoreBinaria.emOrdem());
        arvoreBinaria.add(57);
        System.out.println("Árvore atual: " + arvoreBinaria.emOrdem());

        System.out.println("Árvore em ordem: " + arvoreBinaria.emOrdem());
        System.out.println("Árvore pré-ordem: " + arvoreBinaria.preOrdem());
        System.out.println("Árvore pós-ordem: " + arvoreBinaria.posOrdem());

        arvoreBinaria.remove(30);

        System.out.println("Árvore em ordem após remoção do número 30: " + arvoreBinaria.emOrdem());
    }
}
