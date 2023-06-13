package exercicios.marco1.atvd10_exercicios_p1.questao03;

public class FiboMain {
    public static void main(String[] args) {
        System.out.println(fiboN(0));
        System.out.println(fiboN(1));
        System.out.println(fiboN(2));
        System.out.println(fiboN(3));
        System.out.println(fiboN(4));
    }

    public static int fiboN(int posicao) {
        if (posicao == 0) {
            return 0;
        } else if (posicao == 1) {
            return 1;
        } else {
            return (fiboN(posicao - 1) + fiboN(posicao - 2));
        }
    }
}
