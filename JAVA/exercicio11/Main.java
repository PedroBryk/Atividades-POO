package exercicio11;

public class Main {
    public static void main(String[] args) {
        Animal porco = new Animal();
        Animal cachorro = new Animal();

        porco.Nome = "Porco";
        porco.Especie = "porcus porcus";
        porco.Idade = 5;
        porco.Som = "Oinc Oinc";

        cachorro.Nome = "Cachorro";
        cachorro.Especie = "vira-Lata";
        cachorro.Idade = 5;
        cachorro.Som = "Au Au";

        porco.fazerBarulho();
        cachorro.fazerBarulho();
        
    }
}
