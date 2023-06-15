package exercicios.marco2.atvd14;

public class Main {
    public static void main(String[] args) {
        MapaHashVetor mapaAlunos = new MapaHashVetor(10, 0.5f);
        Aluno aluno1 = new Aluno("João 1", 20, 10, 870631009);
        Aluno aluno2 = new Aluno("Robson 2", 22, 8, 935402860);
        Aluno aluno3 = new Aluno("Felipe 3", 20, 10, 508961735);
        Aluno aluno4 = new Aluno("Mauricio 4", 22, 8, 721850936);
        Aluno aluno5 = new Aluno("Claudio 5", 20, 10, 294670158);
        Aluno aluno6 = new Aluno("José 6", 22, 8, 912534268);
        Aluno aluno7 = new Aluno("Romildo 7", 22, 8, 2134789878);
        Aluno aluno8 = new Aluno("Gigi 8", 22, 8, 451354885);
        Aluno aluno9 = new Aluno("Alice 9", 22, 8, 472651875);
        Aluno aluno10 = new Aluno("Jorge 10", 22, 8, 724013765);

        mapaAlunos.put(aluno1.getMatricula(), aluno1);
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        mapaAlunos.put(aluno2.getMatricula(), aluno2);
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        mapaAlunos.put(aluno3.getMatricula(), aluno3);
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        mapaAlunos.put(aluno4.getMatricula(), aluno4);
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        mapaAlunos.put(aluno5.getMatricula(), aluno5);
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        mapaAlunos.put(aluno6.getMatricula(), aluno6); 
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        mapaAlunos.put(aluno7.getMatricula(), aluno7);
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        System.out.println("Tamanho atual mapa: " + mapaAlunos.actualCapacity());
        mapaAlunos.put(aluno8.getMatricula(), aluno8); 
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        mapaAlunos.put(aluno9.getMatricula(), aluno9); // VAI REALIZAR RESIZE() E REHASH(), POIS O FATOR DE CARGA É 0.5
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        System.out.println("Tamanho atual mapa após resize e rehash: " + mapaAlunos.actualCapacity());
        mapaAlunos.put(aluno10.getMatricula(), aluno10);
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        System.out.println("Tamanho atual mapa: " + mapaAlunos.actualCapacity());

        mapaAlunos.remove(721850936); // REMOVE ALUNO 4
        System.out.println("Mapa Alunos: " + mapaAlunos.toString());
        
        System.out.println(mapaAlunos.get(870631009).toString()); // UTILIZA GET PARA IMPRIMIR O ALUNO 1
    }
}
