package heranca_exercicios.exercicio03;

import heranca_exercicios.exercicio01.Pessoa;

public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                ", Empregado {" +
                "codigoSetor = " + codigoSetor +
                ", salarioBase = R$%.2f" +
                "; imposto = %.1f%%" +
                "}", salarioBase, imposto);
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto/100));
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
