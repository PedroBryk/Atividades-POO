package exercicio2;

public class Instrutor {
    String nome;
    int diasTrabalhados;
    int valorDia;

    void pagamentoInstrutor(){

        int pagamento = diasTrabalhados * valorDia;

        System.out.println("Seu pagamento mensal é: " + pagamento);
    }
}
