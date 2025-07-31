package exercicio5;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Prato prato1 = new Prato();
        Pedido pedido1 = new Pedido();

        cliente1.nome = "Pedro";
        prato1.nome = "Macarrão";
        prato1.preco = 12;
        pedido1.cliente = cliente1;
        pedido1.prato = prato1;

        pedido1.exibirPedido();
    }
}
