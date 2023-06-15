package exercicios.marco1.atvd10_exercicios_p1.questao09;

public class Main {
    public static void main(String[] args) {
        LSE listaEncadeada = new LSE();

        listaEncadeada.insereInicio(0);
        listaEncadeada.insereInicio(100);
        listaEncadeada.insereInicio(23);
        listaEncadeada.insereInicio(3498);
        listaEncadeada.insereInicio(90);
        listaEncadeada.insereInicio(4);

        System.out.println(listaEncadeada.imprimeLista());
        listaEncadeada.bubbleSort();
        System.out.println(listaEncadeada.imprimeLista());
    }
}
