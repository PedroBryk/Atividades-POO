package exercicio5;

public class Pedido {
    Cliente cliente;
    Prato prato;

    void exibirPedido(){
        System.out.println("O cliente: " + cliente.nome + " realizou o pedido de: " + prato.nome);
    }
}
