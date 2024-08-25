package heranca_e_polimorfismo.exercicio09;

import heranca_e_polimorfismo.exercicio08.Comissao;

public class FuncionarioEnsinoBasico extends Funcionario {

    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, Comissao comissao, String escolaEnsinoBasico) {
        super(nome, codigoFuncional, comissao);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(
                " FuncionarioEnsinoBasico {" +
                "escolaEnsinoBasico = " + escolaEnsinoBasico +
                '}');
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }
}
