package heranca_exercicios.exercicio04;

import heranca_exercicios.exercicio03.Empregado;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                ", Administrador {" +
                "ajudaDeCusto = %.2f" +
                '}', ajudaDeCusto);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
