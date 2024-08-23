package lista4.questao3;

import lista4.questao2.AnimalAB;

public class Gato extends AnimalAB {

    private int comidaIngerida = 0;
    private int caminhoPercorrido = 0;
    private int horasDormidas = 0;

    @Override
    public void comer(int quantidade) {
        this.comidaIngerida += quantidade;
        System.out.printf("Quantidade de comida ingerida pelo gato: %skg\n", this.comidaIngerida);
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido += distancia;
        System.out.printf("Distância percorrida pelo gato: %skm\n", this.caminhoPercorrido);
    }

    @Override
    public void dormir(int horas) {
        this.horasDormidas += horas;
        System.out.printf("Quantidade de horas dormidas pelo gato: %sh\n", this.horasDormidas);
    }
}
