package heranca_exercicios.exercicio06;

public class TesteVendedor {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Ana", "Salvador, Bahia", "719XXXX-XXXX", 12345, 2500.00, 12.0, 50000.00, 25.0);
        System.out.println(vendedor);
        System.out.printf("Testando o método \"calcularSalario()\": R$%.2f\n\n", vendedor.calcularSalario());

        vendedor.setSalarioBase(4500.00);
        vendedor.setValorVendas(85000.00);
        vendedor.setComissao(12.0);

        System.out.println(vendedor);
        System.out.printf("Testando mais uma vez: R$%.2f", vendedor.calcularSalario());
    }
}
