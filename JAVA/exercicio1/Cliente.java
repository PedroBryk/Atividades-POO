package exercicio1;
public class Cliente {

    String nome;
    Filme filme;

    void realizarPagamento(){
        System.out.println("Pagamento realizado com sucesso!");
    }

    void alugarFilme(Filme filme) {
        this.filme = filme;
        filme.alugarFilme();
    }
    
}
