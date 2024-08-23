package heranca_exercicios.exercicio04;

public class TesteAdministrador {

    public static void main(String[] args) {
        Administrador administrador = new Administrador("Maria", "Rio de Janeiro", "219XXXX-XXXX", 8732, 9200.00, 15.0, 3300.00);
        System.out.println(administrador);
        System.out.printf("Testando o método \"calcularSalario()\" da classe Administrador: R$%.2f\n\n", administrador.calcularSalario());

        administrador.setImposto(21.0);
        administrador.setSalarioBase(13220.42);
        administrador.setAjudaDeCusto(5728.97);

        System.out.println(administrador);
        System.out.printf("Testando mais uma vez: R$%.2f", administrador.calcularSalario());
    }
}
