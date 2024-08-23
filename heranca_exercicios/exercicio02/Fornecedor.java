package heranca_exercicios.exercicio02;

import heranca_exercicios.exercicio01.Pessoa;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                ", Fornecedor {" +
                "valorCredito = %.2f" +
                "; valorDivida = %.2f" +
                '}', valorCredito, valorDivida);
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
