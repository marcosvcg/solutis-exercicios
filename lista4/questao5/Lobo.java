package lista4.questao5;

public class Lobo extends AnimalTerrestreAB {

    private int distanciaAndada = 0;
    private int comidaIngerida = 0;
    private int caminhoPercorrido = 0;
    private int horasDormidas = 0;

    public Lobo(String nome, String tipoAnimal, int idade, String habitat, int altura, double peso, int quantidadeDePatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeDePatas);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void andar(int distancia) {
        this.distanciaAndada += distancia;
        System.out.printf("Distância andada pelo lobo: %sm\n", this.distanciaAndada);
    }

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.printf("Quantidade de comida ingerida pelo lobo: %skg\n", this.comidaIngerida);
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.printf("Distância percorrida pelo lobo: %skm\n", this.caminhoPercorrido);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.printf("Quantidade de horas dormidas pelo lobo: %sh\n", this.horasDormidas);
    }
}
