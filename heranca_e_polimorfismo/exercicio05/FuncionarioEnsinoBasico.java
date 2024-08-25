package heranca_e_polimorfismo.exercicio05;

public class FuncionarioEnsinoBasico extends Funcionario {

    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaEnsinoBasico) {
        super(nome, codigoFuncional);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    @Override
    public String toString() {
        return super.toString() +
                " FuncionarioEnsinoBasico {" +
                "escolaEnsinoBasico = " + escolaEnsinoBasico +
                '}';
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }
}
