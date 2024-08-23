package lista4.questao2;

import lista4.questao1.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    @Override
    public abstract void comer(int quantidade);

    @Override
    public abstract void moverse(int distancia);

    @Override
    public abstract void dormir(int horas);
}
