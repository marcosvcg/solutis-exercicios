package lista4;

import lista4.questao3.Cachorro;
import lista4.questao3.Elefante;
import lista4.questao3.Gato;
import lista4.questao3.Leao;
import lista4.questao4.Peixe;
import lista4.questao4.Pombo;
import lista4.questao5.Coruja;
import lista4.questao5.Lobo;
import lista4.questao5.Tartaruga;

public class Main {

    public static void main(String[] args) {
        testarQuestao3();
        testarQuestao4();
        testarQuestao5();
    }

    public static void testarQuestao3() {
        Cachorro cachorro = new Cachorro();
        cachorro.comer(0); cachorro.comer(4); cachorro.comer(2);
        cachorro.moverse(10);
        cachorro.dormir(8);
        System.out.println();

        Gato gato = new Gato();
        gato.comer(0); gato.comer(1); gato.comer(2);
        gato.moverse(25);
        gato.dormir(12);
        System.out.println();

        Elefante elefante = new Elefante();
        elefante.comer(10); elefante.comer(6); elefante.comer(4);
        elefante.moverse(7);
        elefante.dormir(10);
        System.out.println();

        Leao leao = new Leao();
        leao.comer(5); leao.comer(10); leao.comer(15);
        leao.moverse(40);
        leao.dormir(6);
        System.out.println();
    }

    public static void testarQuestao4() {
        Peixe peixe = new Peixe();
        peixe.comer(0); peixe.comer(1); peixe.comer(1);
        peixe.moverse(3);
        peixe.dormir(4);
        peixe.nadar(100); peixe.nadar(250);
        System.out.println();

        Pombo pombo = new Pombo();
        pombo.comer(1);
        pombo.moverse(5);
        pombo.dormir(5);
        pombo.voar(0); pombo.voar(400);
    }

    public static void testarQuestao5() {
        Lobo lobo = new Lobo("Lobo", "Mamífero", 6, "Floresta temperada", 85, 70.2, 4);
        System.out.println("\n" + lobo);
        lobo.andar(60); lobo.andar(130);
        lobo.comer(7); lobo.comer(8);
        lobo.moverse(9);
        lobo.dormir(11);

        Coruja coruja = new Coruja("Coruja", "Ave", 3, "Cerrado", 59, 2.1, 2, 146);
        System.out.println("\n" + coruja);
        coruja.voar(270); coruja.voar(330);
        coruja.comer(1);
        coruja.moverse(3);
        coruja.dormir(8);

        Tartaruga tartaruga = new Tartaruga("Tartaruga Marinha", "Réptil", 10, "Mares tropicais", 70, 53.4, 4, 0);
        System.out.println("\n" + tartaruga);
        tartaruga.nadar(400); tartaruga.nadar(150);
        tartaruga.comer(1); tartaruga.comer(1);
        tartaruga.moverse(4);
        tartaruga.dormir(7);
    }
}
