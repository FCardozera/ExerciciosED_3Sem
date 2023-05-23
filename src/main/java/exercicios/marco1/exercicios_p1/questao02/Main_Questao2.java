package exercicios.marco1.exercicios_p1.questao02;

public class Main_Questao2 {
    public void selectionSort () {
        for (int i = ______________; i >= ______________; ______________) {
           int maior = this.posMaior(______________);
              if (maior != i) 
                 this.troca (i, maior);
           }
     }
     /* Métodos auxiliares: */
     private int posMaior (int fim) {
        int maior = fim;
        for (int i = fim-1; i >= 0; i--)
           if (valor[i] > valor[maior])
              maior = i;
        return maior;
     }
     private void troca (int a, int b) {
        float aux;
        aux = valor[a];
        valor[a] = valor[b];
        valor[b] = aux;
     }
     
}
