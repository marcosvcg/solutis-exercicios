package heranca_exercicios.exercicio05;

import heranca_exercicios.exercicio03.Empregado;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * (comissao / 100));
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                ", Operario {" +
                "valorProducao = R$%.2f" +
                "; comissao = %.1f%%" +
                '}', valorProducao, comissao);
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
