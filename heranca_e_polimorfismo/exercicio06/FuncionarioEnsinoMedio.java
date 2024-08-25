package heranca_e_polimorfismo.exercicio06;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50;
    }

    @Override
    public String toString() {
        return super.toString() +
                " FuncionarioEnsinoMedio {" +
                "escolaEnsinoMedio = " + escolaEnsinoMedio +
                '}';
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }
}
