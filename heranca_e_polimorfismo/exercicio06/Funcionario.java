package heranca_e_polimorfismo.exercicio06;

public class Funcionario {

    private String nome;
    private int codigoFuncional;
    private double rendaBasica = 1000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public double calcularRendaTotal() {
        return rendaBasica;
    }

    @Override
    public String toString() {
        return String.format(
                "Funcionario {" +
                "nome = " + nome +
                ", codigoFuncional = " + codigoFuncional +
                ", rendaTotal = R$%.2f" +
                '}', calcularRendaTotal());
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
