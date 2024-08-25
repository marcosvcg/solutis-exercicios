package heranca_e_polimorfismo.exercicio01;

public class Cavalo extends Animal {

    private boolean deveCorrer;

    public Cavalo(String nome, int idade, boolean emiteSom) {
        super(nome, idade, emiteSom);
    }

    public boolean isDeveCorrer() {
        return deveCorrer;
    }

    public void setDeveCorrer(boolean deveCorrer) {
        this.deveCorrer = deveCorrer;
    }
}
