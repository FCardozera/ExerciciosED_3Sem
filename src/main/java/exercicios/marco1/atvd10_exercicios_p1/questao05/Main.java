package exercicios.marco1.atvd10_exercicios_p1.questao05;

//EXEMPLO QUESTAO 05
public class Main {
    public static void main(String[] args) {
        LDE_Inteiros listaInteiros = new LDE_Inteiros();

        listaInteiros.insereFim(1);
        listaInteiros.insereFim(2);
        listaInteiros.insereFim(4);
        listaInteiros.insereFim(5);
        listaInteiros.insereFim(6);
        listaInteiros.insereFim(7);
        listaInteiros.insereFim(8);
        listaInteiros.insereFim(9);
        listaInteiros.insereFim(4);
        listaInteiros.insereFim(4);

        System.out.println(listaInteiros.imprimeInicio());
        System.out.println(listaInteiros.nroPares());
    }
}
