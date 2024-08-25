package heranca_e_polimorfismo.exercicio01;

public class Preguica extends Animal {

    private boolean deveSubirArvores;

    public Preguica(String nome, int idade, boolean emiteSom) {
        super(nome, idade, emiteSom);
    }

    public boolean isDeveSubirArvores() {
        return deveSubirArvores;
    }

    public void setDeveSubirArvores(boolean deveSubirArvores) {
        this.deveSubirArvores = deveSubirArvores;
    }
}
