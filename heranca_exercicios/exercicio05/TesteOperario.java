package heranca_exercicios.exercicio05;

public class TesteOperario {

    public static void main(String[] args) {
        Operario operario = new Operario("Pedro", "Rua da Solutis", "119ABCD-EFGH", 101, 3000.00, 15.0, 70000.00, 6.0);
        System.out.println(operario);
        System.out.printf("Testando o método \"calcularSalario()\" da classe Operario: R$%.2f\n\n", operario.calcularSalario());

        operario.setImposto(19.3);
        operario.setSalarioBase(2700);
        operario.setValorProducao(100000.00);
        operario.setComissao(5.5);

        System.out.println(operario);
        System.out.printf("Testando mais uma vez: R$%.2f", operario.calcularSalario());
    }
}
