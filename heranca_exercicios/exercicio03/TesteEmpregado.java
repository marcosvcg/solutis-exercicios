package heranca_exercicios.exercicio03;

public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("Empregado", "Endereco", "Telefone", 0, 0.0, 0.0);
        definirAtributosDaClassePessoa(empregado, "João", "São Paulo", "119YYYY-YYYY");
        System.out.println(empregado + "\n");

        empregado.setCodigoSetor(1076);
        empregado.setSalarioBase(7000.00);
        empregado.setImposto(20.0);
        System.out.println(empregado);

        System.out.printf("Testando o método \"calcularSalario()\": R$%.2f\n\n", empregado.calcularSalario());

        empregado.setCodigoSetor(2811);
        empregado.setSalarioBase(11087.59);
        empregado.setImposto(23.78);
        System.out.println(empregado);

        System.out.printf("Testando mais uma vez: R$%.2f", empregado.calcularSalario());
    }

    public static void definirAtributosDaClassePessoa(Empregado empregado, String nome, String endereco, String telefone) {
        empregado.setNome(nome);
        empregado.setEndereco(endereco);
        empregado.setTelefone(telefone);
    }
}
