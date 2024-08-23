package lista4.questao4;

public class Peixe extends AnimalMarinhoAB {

    private int distanciaNadada = 0;
    private int comidaIngerida = 0;
    private int caminhoPercorrido = 0;
    private int horasDormidas = 0;

    @Override
    public void nadar(int distancia) {
        this.distanciaNadada += distancia;
        System.out.printf("Distância nadada pelo peixe: %sm\n", this.distanciaNadada);
    }

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.printf("Quantidade de comida ingerida pelo peixe: %skg\n", this.comidaIngerida);
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.printf("Distância percorrida pelo peixe: %skm\n", this.caminhoPercorrido);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.printf("Quantidade de horas dormidas pelo peixe: %sh\n", this.horasDormidas);
    }
}
