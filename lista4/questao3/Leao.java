package lista4.questao3;

import lista4.questao2.AnimalAB;

public class Leao extends AnimalAB {

    private int comidaIngerida = 0;
    private int caminhoPercorrido = 0;
    private int horasDormidas = 0;

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.printf("Quantidade de comida ingerida pelo leao: %skg\n", this.comidaIngerida);
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.printf("Distância percorrida pelo leao: %skm\n", this.caminhoPercorrido);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.printf("Quantidade de horas dormidas pelo leao: %sh\n", this.horasDormidas);
    }
}
