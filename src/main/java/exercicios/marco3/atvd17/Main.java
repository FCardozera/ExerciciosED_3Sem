package exercicios.marco3.atvd17;

public class Main {
    public static void main(String[] args) {
        AVL arvoreBinaria = new AVL();

        arvoreBinaria.inserir(51);
        arvoreBinaria.mostrarArvore();
        arvoreBinaria.inserir(57);
        arvoreBinaria.mostrarArvore();
        arvoreBinaria.inserir(98);
        arvoreBinaria.mostrarArvore();
        arvoreBinaria.inserir(19);
        arvoreBinaria.mostrarArvore();
        arvoreBinaria.inserir(11);
        arvoreBinaria.mostrarArvore();
        arvoreBinaria.inserir(45);
        arvoreBinaria.mostrarArvore();
        arvoreBinaria.inserir(79);
        arvoreBinaria.mostrarArvore();

        System.out.println("");
        arvoreBinaria.emOrdem();
        System.out.println("");
        arvoreBinaria.preOrdem();
        System.out.println("");
        arvoreBinaria.posOrdem();
    }
}
