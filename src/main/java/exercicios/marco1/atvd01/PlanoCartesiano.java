package exercicios.marco1.atvd01;

import java.util.LinkedList;

public class PlanoCartesiano {
    private LinkedList<PontoCartesiano> pontosCartesianos;

    public PlanoCartesiano() {
        pontosCartesianos = new LinkedList<PontoCartesiano>();
    }

    public void addPontoCartesiano(PontoCartesiano ponto) {
        pontosCartesianos.add(ponto);
    }

    public void removePontoCartesiano(PontoCartesiano ponto) {
        pontosCartesianos.remove(ponto);
    }

    public PontoCartesiano getPontoCartesiano(int idPonto) throws Exception{
        for (PontoCartesiano pontoCartesiano : pontosCartesianos) {
            if (pontoCartesiano.getIdPonto() == idPonto) {
                return pontoCartesiano;
            }
        }
        throw new Exception();
    }

    public double calcularDistanciaEuclidianaPontos(PontoCartesiano p1, PontoCartesiano p2) throws NullPointerException{
        if (pontosCartesianos.contains(p1) && pontosCartesianos.contains(p2)) {        
            double distX = Math.pow(p1.getX() - p2.getX(), 2);
            double distY = Math.pow(p1.getY() - p2.getY(), 2);
            double distancia = Math.sqrt((distX + distY));

            return distancia;
        }
        
        throw new NullPointerException();
    }

}
