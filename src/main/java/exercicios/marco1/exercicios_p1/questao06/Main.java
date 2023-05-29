package exercicios.marco1.exercicios_p1.questao06;

//EXEMPLO QUESTAO 05
public class Main {
    public static void main(String[] args) {
        LDE_Inteiros listaInteiros = new LDE_Inteiros();

        listaInteiros.insereFim(0);

        System.out.println(listaInteiros.imprimeInicio());

        listaInteiros.add_ordenado(10);


        System.out.println(listaInteiros.imprimeInicio());
    }
}
