package exercicio4;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Pedro";
        aluno1.matricula = 234;
        aluno1.notas = new float[3];

        aluno1.notas[0] = 8f;
        aluno1.notas[1] = 4f;
        aluno1.notas[2] = 6f;

        //aluno1.adicionarNota(float); pedir ajuda professor
        aluno1.calcularMedia();
        aluno1.exibirBoletim();

    }
}
