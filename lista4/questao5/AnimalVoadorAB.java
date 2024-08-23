package lista4.questao5;

public abstract class AnimalVoadorAB extends AnimalAB {

    private int quantidadeAsas;
    private int envergaduraAsa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int altura, double peso, int quantidadeAsas, int envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de asas: " + quantidadeAsas
                                + "\nEnvergadura das asas: " + envergaduraAsa + "cm";
    }

    public abstract void voar(int distancia);
}
