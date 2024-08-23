package lista4.questao4;

public class Pombo extends AnimalVoadorAB {

    private int distanciaVoo = 0;
    private int comidaIngerida = 0;
    private int caminhoPercorrido = 0;
    private int horasDormidas = 0;

    @Override
    public void voar(int distancia) {
        this.distanciaVoo += distancia;
        System.out.printf("Distância do voo do pombo: %sm\n", this.distanciaVoo);
    }

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.printf("Quantidade de comida ingerida pelo pombo: %skg\n", this.comidaIngerida);
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.printf("Distância percorrida pelo pombo: %skm\n", this.caminhoPercorrido);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.printf("Quantidade de horas dormidas pelo pombo: %sh\n", this.horasDormidas);
    }
}
