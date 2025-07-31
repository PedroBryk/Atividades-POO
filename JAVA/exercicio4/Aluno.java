package exercicio4;

public class Aluno {
    String nome;
    int matricula;
    float[] notas;

    void adicionarNota(float notas){

        System.out.println("insira as notas: ");
    }

    void calcularMedia(){
        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        float media = soma / notas.length;
        System.out.println("Média de " + nome + ": " + media);
    }

    void exibirBoletim(){

        System.out.println("O boletim é: " + notas);
        
    }
}
