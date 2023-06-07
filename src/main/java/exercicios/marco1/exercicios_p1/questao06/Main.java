package exercicios.marco1.exercicios_p1.questao06;

//EXEMPLO QUESTAO 05
public class Main {
    public static void main(String[] args) {
        LDE_Inteiros listaInteiros = new LDE_Inteiros();

        listaInteiros.insereFim(0);

        System.out.println(listaInteiros.imprimeInicio());

        listaInteiros.add_ordenado(10);
        listaInteiros.add_ordenado(2);
        listaInteiros.add_ordenado(1);
        listaInteiros.add_ordenado(8);
        listaInteiros.add_ordenado(4);
        listaInteiros.add_ordenado(600);
        listaInteiros.add_ordenado(4);
        listaInteiros.add_ordenado(5);
        listaInteiros.add_ordenado(7);
        listaInteiros.add_ordenado(80);
        listaInteiros.add_ordenado(6);

        System.out.println(listaInteiros.imprimeInicio());
    }
}
