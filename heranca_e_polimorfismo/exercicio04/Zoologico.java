package heranca_e_polimorfismo.exercicio04;

import heranca_e_polimorfismo.exercicio02.Animal;
import heranca_e_polimorfismo.exercicio02.Cachorro;
import heranca_e_polimorfismo.exercicio02.Cavalo;
import heranca_e_polimorfismo.exercicio02.Preguica;

public class Zoologico {

    public static void main(String[] args) {
        Animal[] jaulas = colocarOsAnimaisNasJaulas();

        for(Animal animal : jaulas) {
            animal.emitirSom();
            if(animal instanceof Cachorro || animal instanceof Cavalo) {
                animal.mover();
            }
            System.out.println();
        }
    }

    public static Animal[] colocarOsAnimaisNasJaulas() {
        Animal[] jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Cachorro1", 1, true);
        jaulas[1] = new Cachorro("Cachorro2", 2, true);
        jaulas[2] = new Cachorro("Cachorro3", 3, true);
        jaulas[3] = new Cachorro("Cachorro4", 4, true);

        jaulas[4] = new Cavalo("Cavalo1", 1, true);
        jaulas[5] = new Cavalo("Cavalo2", 2, true);
        jaulas[6] = new Cavalo("Cavalo3", 3, true);

        jaulas[7] = new Preguica("Preguica1", 1, true);
        jaulas[8] = new Preguica("Preguica2", 2, true);
        jaulas[9] = new Preguica("Preguica3", 3, true);

        return jaulas;
    }
}
