package lista4.questao5;

import lista4.questao1.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private int altura;
    private double peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("{" +
                "nome = " + nome +
                ", tipoAnimal = " + tipoAnimal +
                ", idade = %s anos" +
                ", habitat = " + habitat +
                ", altura = %scm" +
                ", peso = %.1fkg" +
                '}', idade, altura, peso);
    }

    @Override
    public abstract void comer(int quantidade);

    @Override
    public abstract void moverse(int distancia);

    @Override
    public abstract void dormir(int horas);
}
