package heranca_e_polimorfismo.exercicio08;

public class ComissaoSupervisor extends Comissao {

    private static final double COMISSAO_SUPERVISOR = 600.00;

    @Override
    public double calcularComissao() {
        return COMISSAO_SUPERVISOR;
    }
}
