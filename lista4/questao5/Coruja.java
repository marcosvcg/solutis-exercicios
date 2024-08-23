package lista4.questao5;

public class Coruja extends AnimalVoadorAB {

    private int distanciaVoo = 0;
    private int comidaIngerida = 0;
    private int caminhoPercorrido = 0;
    private int horasDormidas = 0;

    public Coruja(String nome, String tipoAnimal, int idade, String habitat, int altura, double peso, int quantidadeAsas, int envergaduraAsa) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, quantidadeAsas, envergaduraAsa);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void voar(int distancia) {
        this.distanciaVoo += distancia;
        System.out.printf("Distância do voo da coruja: %sm\n", this.distanciaVoo);
    }

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.printf("Quantidade de comida ingerida pela coruja: %skg\n", this.comidaIngerida);
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.printf("Distância percorrida pela coruja: %skm\n", this.caminhoPercorrido);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.printf("Quantidade de horas dormidas pela coruja: %sh\n", this.horasDormidas);
    }
}
