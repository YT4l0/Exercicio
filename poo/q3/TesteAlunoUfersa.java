package q3;

public class TesteAlunoUfersa {
    public static void main(String[] args) {
        AlunoUfersa aluno1 = new AlunoUfersa(1, "João", 6.5, 7.2, 8.0);
        AlunoUfersa aluno2 = new AlunoUfersa(2, "Maria", 4.0, 5.5, 6.2);
        AlunoUfersa aluno3 = new AlunoUfersa(3, "Pedro", 2.0, 3.5, 4.8);

        AlunoUfersa[] alunos = {aluno1, aluno2, aluno3};

        for (AlunoUfersa aluno : alunos) {
            System.out.println("Aluno: " + aluno.nome);
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Média Parcial (MP): " + aluno.media());

            double ef = aluno.provaFinal();
            if (ef == 0) {
                System.out.println("O aluno não precisa fazer exame final.");
            } else {
                System.out.println("O aluno precisa de " + String.format("%.2f", ef) + " na prova final para ser aprovado.");
            }

            System.out.println();
        }
    }
}
