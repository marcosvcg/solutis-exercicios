package heranca_exercicios.exercicio02;

public class TesteFornecedor {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornecedor", "Endereco", "Telefone", 0, 0);
        System.out.println(fornecedor);

        System.out.println("\nTestando os métodos herdados da classe Pessoa primeiro:");
        fornecedor.setNome("Marcos");
        fornecedor.setEndereco("Salvador, Bahia");
        fornecedor.setTelefone("719XXXX-XXXX");
        System.out.println(fornecedor);

        System.out.println("\nAgora iremos testar os métodos da classe Fornecedor:");
        fornecedor.setValorCredito(500.00);
        fornecedor.setValorDivida(149.99);
        System.out.println(fornecedor);

        System.out.printf("\nTestando o método \"obterSaldo()\": %.2f\n", fornecedor.obterSaldo());

        System.out.println("\nMais alguns testes:");
        fornecedor.setValorCredito(2158.79);
        fornecedor.setValorDivida(3698.29);
        System.out.println(fornecedor);

        System.out.printf("\nSaldo final: %.2f", fornecedor.obterSaldo());
    }
}
