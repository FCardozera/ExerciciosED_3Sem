package exercicios.marco1.atvd10_exercicios_p1.questao01;

public class Main {
    public static void main(String[] args) {
        VetorInt vetorInt01= new VetorInt(20);
        VetorInt vetorInt02= new VetorInt(20);
        VetorInt vetorIntersecao = new VetorInt(20);

        vetorInt01.adiciona(1);
        vetorInt02.adiciona(1);
        vetorInt01.adiciona(5);
        vetorInt02.adiciona(6);
        vetorInt01.adiciona(4);
        vetorInt02.adiciona(3);
        vetorInt01.adiciona(2);
        vetorInt02.adiciona(9);
        vetorInt01.adiciona(3);
        vetorInt02.adiciona(4);

        System.out.println("Vetor 1:" + vetorInt01.imprimeVetor());
        System.out.println("Vetor 2: " + vetorInt02.imprimeVetor());

        vetorIntersecao = intersecaoVetor(vetorInt01, vetorInt02);
        System.out.println("Vetor Interseção: " + vetorIntersecao.imprimeVetor());
        
    }

    // PROGRAMA EXERCÍCIO 01
    public static VetorInt intersecaoVetor(VetorInt vetor1, VetorInt vetor2) {
        VetorInt vetorRetorno = new VetorInt(vetor1.tamanho() + 1);
        
        // Os dois vetores devem possuir tamanho n
        if (vetor1.tamanho() == vetor2.tamanho()) {
            // Iteração no tamanho dos vetores
            for (int i = 0; i < vetor1.tamanho(); i++) {
                for (int j = 0; j < vetor2.tamanho(); j++) {
                    //Verifica se é igual
                    if (vetor1.getVetorInt()[i] == vetor2.getVetorInt()[j]) {
                        // Se igual e o número ainda não existe no vetorRetorno -> Adiciona no vetorRetorno
                        if (!(vetorRetorno.contem(vetor2.getVetorInt()[j]))) {
                            vetorRetorno.adiciona(vetor2.getVetorInt()[j]);
                        }
                    }
                }
            }

            return vetorRetorno;
        }
        // Se o tamanho dos dois vetores for diferente retorna null
        return null;
    }
}
