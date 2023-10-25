package q3;

public class AlunoUfersa {
    int matricula;
    String nome;
    private double notaP1;
    private double notaP2;
    private double notaTrabalho;

    public AlunoUfersa(int matricula, String nome, double notaP1, double notaP2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return 2.5 * notaP1 + 2.75 * notaP2 + 2 * notaTrabalho;
    }

    public double provaFinal() {
        double mp = media();
        if (mp < 3 || mp >= 7) {
            return 0;
        } else {
            double mf = (mp * 6) / 10;
            double ef = (5 - mf) * 10 / 4;
            return Math.max(0, ef);
        }
    }
}
