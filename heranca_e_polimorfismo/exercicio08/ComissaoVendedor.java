package heranca_e_polimorfismo.exercicio08;

public class ComissaoVendedor extends Comissao {

    private static final double COMISSAO_VENDEDOR = 250.00;

    @Override
    public double calcularComissao() {
        return COMISSAO_VENDEDOR;
    }
}
