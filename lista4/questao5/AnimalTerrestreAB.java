package lista4.questao5;

public abstract class AnimalTerrestreAB extends AnimalAB {

    private int quantidadeDePatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, int altura, double peso, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeDePatas = quantidadeDePatas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de patas: " + quantidadeDePatas;
    }

    public abstract void andar(int distancia);
}
