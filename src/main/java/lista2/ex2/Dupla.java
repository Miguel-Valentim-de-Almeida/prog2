package lista2.ex2;

public class Dupla {
    Aluno aluno1;
    Aluno aluno2;

    Dupla (int matricula1, String nome1, int matricula2, String nome2) {
        aluno1 = new Aluno(matricula1, nome1);
        aluno2 = new Aluno(matricula2, nome2);
    }
    void mostrarAlunos () {
        System.out.println("Aluno 1: "+aluno1.nome+" | Matricula: "+aluno1.matricula);
        System.out.println("Aluno 2: "+aluno2.nome+" | Matricula: "+aluno2.matricula);
    }
}
