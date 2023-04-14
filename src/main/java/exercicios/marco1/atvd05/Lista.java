package exercicios.marco1.atvd05;

public interface Lista {
    public void insereInicio(Object info);
    public void insereFim(Object info);
    public boolean estaVazia();
    public boolean remove(Object info);
    public int tamanho();
    public String imprimeLista();
}
