package heranca_e_polimorfismo.exercicio11;

import heranca_e_polimorfismo.exercicio08.Comissao;

public class Funcionario {

    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000.00;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        return rendaBasica + comissao.calcularComissao();
    }

    @Override
    public String toString() {
        return String.format(
                "Funcionario {" +
                "nome = " + nome +
                ", codigoFuncional = " + codigoFuncional +
                ", comissao = R$%.2f" +
                "; rendaTotal = R$%.2f" +
                '}', comissao.calcularComissao(), calcularRendaTotal());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

}
