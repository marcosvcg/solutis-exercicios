package heranca_e_polimorfismo.exercicio06;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {

    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, escolaEnsinoBasico, escolaEnsinoMedio);
        this.universidade = universidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00;
    }

    @Override
    public String toString() {
        return super.toString() +
                " FuncionarioGraduacao {" +
                "universidade = " + universidade +
                '}';
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
