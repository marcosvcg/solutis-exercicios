package heranca_e_polimorfismo.exercicio02;

public class Cachorro extends Animal {

    private boolean deveCorrer = true;

    public Cachorro(String nome, int idade, boolean emiteSom) {
        super(nome, idade, emiteSom);
    }

    @Override
    public void emitirSom() {
        if(isEmiteSom()) System.out.println(this.getNome() + " está latindo: au, au!");
        else System.out.println(this.getNome() + " não pode latir...");
    }

    @Override
    public void mover() {
        if(deveCorrer) System.out.println(this.getNome() + " está correndo!");
        else System.out.println(this.getNome() + " não pode correr...");
    }

    public boolean isDeveCorrer() {
        return deveCorrer;
    }

    public void setDeveCorrer(boolean deveCorrer) {
        this.deveCorrer = deveCorrer;
    }
}
