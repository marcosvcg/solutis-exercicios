package heranca_e_polimorfismo.exercicio02;

public class Cavalo extends Animal {

    private boolean deveCorrer = true;

    public Cavalo(String nome, int idade, boolean emiteSom) {
        super(nome, idade, emiteSom);
    }

    @Override
    public void emitirSom() {
        if(isEmiteSom()) System.out.println(this.getNome() + " está relinchando!");
        else System.out.println(this.getNome() + " não pode relinchar...");
    }

    @Override
    public void mover() {
        if(isDeveCorrer()) System.out.println(this.getNome() + " está correndo!");
        else System.out.println(this.getNome() + " não pode correr...");
    }

    public boolean isDeveCorrer() {
        return deveCorrer;
    }

    public void setDeveCorrer(boolean deveCorrer) {
        this.deveCorrer = deveCorrer;
    }
}
