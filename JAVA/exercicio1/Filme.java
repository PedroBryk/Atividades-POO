package exercicio1;

class Filme {
    String genero;
    int estoque;
    String nome;

    void alugarFilme(){
        if (estoque > 0) {

            System.out.println("Filme Alugado");
            
        }else{
            System.out.println("Filme sem estoque");
        }
    }
}