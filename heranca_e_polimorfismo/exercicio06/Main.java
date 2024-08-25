package heranca_e_polimorfismo.exercicio06;

public class Main {

    public static void main(String[] args) {
        // Funcionário sem escolaridade:
        Funcionario f = new Funcionario("João", 1234);
        System.out.println(f);

        // Funcionário com ensino básico:
        FuncionarioEnsinoBasico b = new FuncionarioEnsinoBasico("Maria", 5678, "Escola Básica XYZ");
        System.out.println(b);

        // Funcionário com ensino médio:
        FuncionarioEnsinoMedio m = new FuncionarioEnsinoMedio("Carlos", 9012, "Escola Básica XYZ", "Escola Média ABC");
        System.out.println(m);

        // Funcionário com graduação:
        FuncionarioGraduacao g = new FuncionarioGraduacao("Ana", 3456, "Escola Básica XYZ", "Escola Média ABC", "Universidade DEF");
        System.out.println(g);
    }
}
