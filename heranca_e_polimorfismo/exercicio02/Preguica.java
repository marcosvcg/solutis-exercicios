package heranca_e_polimorfismo.exercicio02;

public class Preguica extends Animal {

    private boolean deveSubirArvores = true;

    public Preguica(String nome, int idade, boolean emiteSom) {
        super(nome, idade, emiteSom);
    }

    @Override
    public void emitirSom() {
        if(isEmiteSom()) System.out.println(this.getNome() + " está emitindo um som: Zzzzzz...");
        else System.out.println(this.getNome() + " não está emitindo nenhum som...");
    }

    @Override
    public void mover() {
        if(isDeveSubirArvores()) System.out.println(this.getNome() + " está subindo a árvore lentamente..!");
        else System.out.println(this.getNome() + " está parada...");
    }

    public boolean isDeveSubirArvores() {
        return deveSubirArvores;
    }

    public void setDeveSubirArvores(boolean deveSubirArvores) {
        this.deveSubirArvores = deveSubirArvores;
    }
}
