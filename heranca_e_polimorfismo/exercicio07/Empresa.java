package heranca_e_polimorfismo.exercicio07;

import heranca_e_polimorfismo.exercicio06.Funcionario;
import heranca_e_polimorfismo.exercicio06.FuncionarioEnsinoBasico;
import heranca_e_polimorfismo.exercicio06.FuncionarioEnsinoMedio;
import heranca_e_polimorfismo.exercicio06.FuncionarioGraduacao;

public class Empresa {

    public static void main(String[] args) {
        Funcionario[] empresa = criarEmpresa();
        double custoTotal = 0.0;

        for(Funcionario funcionario : empresa) {
            custoTotal += funcionario.calcularRendaTotal();
            System.out.println(funcionario);
        }

        System.out.printf("\nCusto total da empresa: R$%.2f", custoTotal);
    }

    public static Funcionario[] criarEmpresa() {
        Funcionario[] empresa = new Funcionario[10];

        empresa[0] = new FuncionarioEnsinoBasico("FuncionarioBasico1", 101, "Escola Básica ABC");
        empresa[1] = new FuncionarioEnsinoBasico("FuncionarioBasico2", 102, "Escola Básica ABC");
        empresa[2] = new FuncionarioEnsinoBasico("FuncionarioBasico3", 103, "Escola Básica ABC");
        empresa[3] = new FuncionarioEnsinoBasico("FuncionarioBasico4", 104, "Escola Básica ABC");

        empresa[4] = new FuncionarioEnsinoMedio("FuncionarioMedio1", 201, "Escola Básica DEF", "Escola Média GHI");
        empresa[5] = new FuncionarioEnsinoMedio("FuncionarioMedio2", 202, "Escola Básica DEF", "Escola Média GHI");
        empresa[6] = new FuncionarioEnsinoMedio("FuncionarioMedio3", 203, "Escola Básica DEF", "Escola Média GHI");
        empresa[7] = new FuncionarioEnsinoMedio("FuncionarioMedio4", 204, "Escola Básica DEF", "Escola Média GHI");

        empresa[8] = new FuncionarioGraduacao("FuncionarioSuperior1", 301, "Escola Básica JKL", "Escola Média MNO", "Universidade XYZ");
        empresa[9] = new FuncionarioGraduacao("FuncionarioSuperior2", 302, "Escola Básica JKL", "Escola Média MNO", "Universidade XYZ");

        return empresa;
    }
}
