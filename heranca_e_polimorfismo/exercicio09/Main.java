package heranca_e_polimorfismo.exercicio09;

import heranca_e_polimorfismo.exercicio08.ComissaoGerente;
import heranca_e_polimorfismo.exercicio08.ComissaoSupervisor;
import heranca_e_polimorfismo.exercicio08.ComissaoVendedor;

public class Main {

    public static void main(String[] args) {
        // Funcionário sem escolaridade:
        Funcionario f = new Funcionario("João", 1234, new ComissaoGerente());
        System.out.println(f);

        // Funcionário com ensino básico:
        FuncionarioEnsinoBasico b = new FuncionarioEnsinoBasico("Maria", 5678, new ComissaoVendedor(), "Escola Básica XYZ");
        System.out.println(b);

        // Funcionário com ensino médio:
        FuncionarioEnsinoMedio m = new FuncionarioEnsinoMedio("Carlos", 9012, new ComissaoSupervisor(), "Escola Básica XYZ", "Escola Média ABC");
        System.out.println(m);

        // Funcionário com graduação:
        FuncionarioGraduacao g = new FuncionarioGraduacao("Ana", 3456, new ComissaoGerente(), "Escola Básica XYZ", "Escola Média ABC", "Universidade DEF");
        System.out.println(g);
    }
}
