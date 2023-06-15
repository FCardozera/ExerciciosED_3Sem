package exercicios.marco1.atvd10_exercicios_p1.questao08;

//EXEMPLO QUESTAO 08
public class Main {
    public static void main(String[] args) {
        LDE_Inteiros listaInteiros = new LDE_Inteiros();
        LDE_Inteiros listaInteiros2 = new LDE_Inteiros();

        listaInteiros.insereFim(1);
        listaInteiros.insereFim(2);
        listaInteiros.insereFim(4);
        listaInteiros.insereFim(5);
        listaInteiros.insereFim(6);
        listaInteiros2.insereFim(7);
        listaInteiros2.insereFim(8);
        listaInteiros2.insereFim(9);
        listaInteiros2.insereFim(4);
        listaInteiros2.insereFim(4);

        System.out.println(listaInteiros.imprimeInicio());
        System.out.println(listaInteiros2.imprimeInicio());

        listaInteiros.concat(listaInteiros2);
        System.out.println(listaInteiros.imprimeInicio());
    }
}
