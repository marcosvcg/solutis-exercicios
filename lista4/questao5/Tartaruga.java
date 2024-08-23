package lista4.questao5;

public class Tartaruga extends AnimalMarinhoAB {

    private int distanciaNadada = 0;
    private int comidaIngerida = 0;
    private int caminhoPercorrido = 0;
    private int horasDormidas = 0;

    public Tartaruga(String nome, String tipoAnimal, int idade, String habitat, int altura, double peso, int quantidadeDeNadadeiras, int quantidadeDeTentaculos) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeDeNadadeiras, quantidadeDeTentaculos);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void nadar(int distancia) {
        this.distanciaNadada += distancia;
        System.out.printf("Distância nadada pela tartaruga: %sm\n", this.distanciaNadada);
    }

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.printf("Quantidade de comida ingerida pela tartaruga: %skg\n", this.comidaIngerida);
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.printf("Distância percorrida pela tartaruga: %skm\n", this.caminhoPercorrido);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.printf("Quantidade de horas dormidas pela tartaruga: %sh\n", this.horasDormidas);
    }
}
