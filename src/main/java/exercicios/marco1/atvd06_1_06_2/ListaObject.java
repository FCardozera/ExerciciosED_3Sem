package exercicios.marco1.atvd06_1_06_2;

public interface ListaObject {
    public void insereInicio(Object info);
    public void insereFim(Object info);
    public boolean estaVazia();
    public boolean remove(Object info);
    public int tamanho();
    public String imprimeInicio();
    public String imprimeFim();
}
