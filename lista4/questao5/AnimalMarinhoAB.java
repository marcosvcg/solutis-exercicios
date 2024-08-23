package lista4.questao5;

public abstract class AnimalMarinhoAB extends AnimalAB {

    private int quantidadeDeNadadeiras;
    private int quantidadeDeTentaculos;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, int altura, double peso, int quantidadeDeNadadeiras, int quantidadeDeTentaculos) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeDeNadadeiras = quantidadeDeNadadeiras;
        this.quantidadeDeTentaculos = quantidadeDeTentaculos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de nadadeiras: " + quantidadeDeNadadeiras
                                + "\nQuantidade de tentáculos: " + quantidadeDeTentaculos;
    }

    public abstract void nadar(int distancia);
}
