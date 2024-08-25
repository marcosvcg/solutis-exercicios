package heranca_e_polimorfismo.exercicio08;

public class ComissaoGerente extends Comissao {

    private static final double COMISSAO_GERENTE = 1500.00;

    @Override
    public double calcularComissao() {
        return COMISSAO_GERENTE;
    }
}
