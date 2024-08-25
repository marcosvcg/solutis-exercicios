package heranca_e_polimorfismo.exercicio02;

public abstract class Animal {

    private String nome;
    private int idade;
    private boolean emiteSom;

    public Animal(String nome, int idade, boolean emiteSom) {
        this.nome = nome;
        this.idade = idade;
        this.emiteSom = emiteSom;
    }

    public abstract void emitirSom();

    public abstract void mover();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEmiteSom() {
        return emiteSom;
    }

    public void setEmiteSom(boolean emiteSom) {
        this.emiteSom = emiteSom;
    }
}
