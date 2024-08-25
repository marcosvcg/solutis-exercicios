package heranca_e_polimorfismo.exercicio03;

import heranca_e_polimorfismo.exercicio02.Animal;
import heranca_e_polimorfismo.exercicio02.Cachorro;
import heranca_e_polimorfismo.exercicio02.Cavalo;
import heranca_e_polimorfismo.exercicio02.Preguica;

public class Veterinario {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro", 5, true);
        Cachorro cachorroTeste = new Cachorro("Rex", 3, false);
        Cavalo cavalo = new Cavalo("Cavalo", 7, true);
        Preguica preguica = new Preguica("Preguiça", 10, true);

        examinar(cachorro);
        System.out.println("Passando para o próximo animal...\n");

        examinar(cachorroTeste);
        System.out.println("Passando para o próximo animal...\n");

        examinar(cavalo);
        System.out.println("Passando para o próximo animal...\n");

        examinar(preguica);
    }

    public static void examinar(Animal animal) {
        System.out.printf("Examinando agora o %s...\n", animal.getNome());

        if(animal.isEmiteSom()) {
            animal.emitirSom();
            System.out.println("Ele está fazendo barulho! Parece que está tudo normal com ele!");
        } else {
            System.out.println("Ele não está emitindo nenhum som, iremos investigar isso melhor...");
        }
    }
}
