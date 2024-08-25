package heranca_e_polimorfismo.exercicio11;

import heranca_e_polimorfismo.exercicio08.Comissao;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {

    private String universidade;

    public FuncionarioGraduacao(String nome, int codigoFuncional, Comissao comissao, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
        super(nome, codigoFuncional, comissao, escolaEnsinoBasico, escolaEnsinoMedio);
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
