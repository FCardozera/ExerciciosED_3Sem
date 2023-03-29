package exercicios.marco1;

public class Main {
    public static void main( String[] args ) {
        PontoCartesiano p1 = new PontoCartesiano(2, 12);
        PontoCartesiano p2 = new PontoCartesiano(4, 24);
        PlanoCartesiano planoCartesiano = new PlanoCartesiano();
        double distanciaEntrePontos;

        planoCartesiano.addPontoCartesiano(p1);
        planoCartesiano.addPontoCartesiano(p2);

        distanciaEntrePontos = planoCartesiano.calcularDistanciaEuclidianaPontos(p1, p2);

        System.out.println("O resultado do cálculo da distancia euclidiana entre os pontos p1 e p2 é igual a " + distanciaEntrePontos);
    }
}
