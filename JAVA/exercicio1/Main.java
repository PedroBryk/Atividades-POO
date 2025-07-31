package exercicio1;

public class Main {
    
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();

        Cliente cliente1 = new Cliente();

        filme1.genero = "Terror";
        filme1.estoque = 1;
        filme1.nome = "Anabele";

        filme2.genero = "Comédia";
        filme2.estoque = 0;
        filme2.nome = "As Branquelas";

        cliente1.nome = "Pedro";

        cliente1.alugarFilme(filme1);
    }
}
