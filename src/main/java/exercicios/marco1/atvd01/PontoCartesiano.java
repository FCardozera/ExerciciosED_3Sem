package exercicios.marco1.atvd01;

public class PontoCartesiano {
    private static int idPontoGeral = 01;
    private int idPonto = 01;
    private double x;
    private double y;

    public PontoCartesiano(double x, double y) {
        idPonto = idPontoGeral++;
        this.x = x;
        this.y = y;
    }

    public int getIdPonto() {
        return idPonto;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
