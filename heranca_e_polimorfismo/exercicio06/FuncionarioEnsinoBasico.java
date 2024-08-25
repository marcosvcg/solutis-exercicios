package heranca_e_polimorfismo.exercicio06;

public class FuncionarioEnsinoBasico extends Funcionario {

    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional);
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
