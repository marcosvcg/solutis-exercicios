package heranca_e_polimorfismo.exercicio11;

import heranca_e_polimorfismo.exercicio08.ComissaoGerente;
import heranca_e_polimorfismo.exercicio08.ComissaoSupervisor;
import heranca_e_polimorfismo.exercicio08.ComissaoVendedor;

// Repetindo a classe para ela usar as classes Funcionario dessa package:
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

        empresa[0] = new FuncionarioEnsinoBasico("FuncionarioBasico1", 101, new ComissaoVendedor(), "Escola Básica ABC");
        empresa[1] = new FuncionarioEnsinoBasico("FuncionarioBasico2", 102, new ComissaoVendedor(), "Escola Básica ABC");
        empresa[2] = new FuncionarioEnsinoBasico("FuncionarioBasico3", 103, new ComissaoVendedor(), "Escola Básica ABC");
        empresa[3] = new FuncionarioEnsinoBasico("FuncionarioBasico4", 104, new ComissaoVendedor(), "Escola Básica ABC");

        empresa[4] = new FuncionarioEnsinoMedio("FuncionarioMedio1", 201, new ComissaoVendedor(), "Escola Básica DEF", "Escola Média GHI");
        empresa[5] = new FuncionarioEnsinoMedio("FuncionarioMedio2", 202, new ComissaoVendedor(), "Escola Básica DEF", "Escola Média GHI");
        empresa[6] = new FuncionarioEnsinoMedio("FuncionarioMedio3", 203, new ComissaoVendedor(), "Escola Básica DEF", "Escola Média GHI");
        empresa[7] = new FuncionarioEnsinoMedio("FuncionarioMedio4", 204, new ComissaoSupervisor(), "Escola Básica DEF", "Escola Média GHI");

        empresa[8] = new FuncionarioGraduacao("FuncionarioSuperior1", 301, new ComissaoSupervisor(), "Escola Básica JKL", "Escola Média MNO", "Universidade XYZ");
        empresa[9] = new FuncionarioGraduacao("FuncionarioSuperior2", 302, new ComissaoGerente(), "Escola Básica JKL", "Escola Média MNO", "Universidade XYZ");

        return empresa;
    }
}
